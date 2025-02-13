
package com.experiment08;

import java.io.*;
import java.nio.file.*;
import java.util.Comparator;

public class IOTest {
    public static void main(String[] args) throws IOException {
        String fileName = "D:/college/学科/Java/实验作业/test.txt";
        createFile(fileName);
        String str ="测试一下写入文件";
        writeToFile2(fileName, str);
        String toFile = "D:/college/学科/Java/实验作业/test2.txt";
        copyByIO(fileName, toFile);
        String toFile2 = "D:/college/学科/Java/实验作业/test3.txt";
        copyByNIO(fileName, toFile2);
        System.out.println(" 删除文件 ");
        deleteFile(toFile);

        System.out.println(" 遍历指定目录文件 ");
        System.out.println("------------------------------------------------");
        String dir = "D:/college/学科/Java/实验作业";
        walkDirectories(dir);
        System.out.println("------------------------------------------------");
    }

    private static void createFile(String fileName) throws IOException {
        Path dir = Paths.get(fileName);
        Files.createDirectories(dir.getParent());
        try{
            Files.createFile(dir);
            System.out.println("文件创建成功！文件位置：" + fileName);
        }
        catch(FileAlreadyExistsException e){
            System.out.println("文件 " + fileName + " 已存在，无需创建！");
        }

    }

    private static void writeToFile(String fileName, String content) throws IOException {
        byte[] buffer = content.getBytes();
        //Path p = Paths.get(fileName);
        try(FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(buffer);
            System.out.println("数据写入成功！文件位置：" + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeToFile2(String fileName, String content) throws IOException {
        String[] lines = content.split("\r\s");
        try(FileOutputStream out = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(out);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            System.out.println("数据写入成功！文件位置：" + fileName);
        }
    }

    private static void copyByIO(String sourceFile, String targetFile) throws IOException {
        try(InputStream input = new FileInputStream(sourceFile);
            OutputStream output = new FileOutputStream(targetFile)) {
            int size = 8;
            byte[] buffer = new byte[size];
            int length;
            int count = 0;
            while ((length = input.read(buffer) )!= -1){
                output.write(buffer,0,length);
                count++;
            }
            System.out.println(sourceFile + "->" + targetFile + " 复制成功！");
            System.out.println("字节数组缓冲区大小为" + size + "时，读写循环次数为" + count + "\n");
        }

    }

    private static void copyByNIO(String sourceFile, String targetFile) {
        Path source = Path.of(sourceFile);
        Path target = Path.of(targetFile);
        try {
            Files.createDirectories(target.getParent());
            Files.createFile(target);
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to copy file: " + e.getMessage());
        }
        finally {
            System.out.println(sourceFile + " -> " + targetFile + " 复制成功！\n");
        }
    }

    private static void deleteFile(String fileName) throws IOException {
        Path dir = Paths.get(fileName);
        Files.deleteIfExists(dir);
        System.out.println(fileName + " 删除成功！\n");
    }

    private static void walkDirectories(String dir) throws IOException {
        Path d = Paths.get(dir);
        Files.walk(d)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
