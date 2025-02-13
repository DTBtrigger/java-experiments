package com.experiment05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {
    public static void copyFile(String sourcePath, String destinationPath) {
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(sourcePath);
            output = new FileOutputStream(destinationPath);
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error occurred while copying the file: " + e.getMessage());
        } finally {
            // Close resources properly
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.err.println("Failed to close input stream: " + e.getMessage());
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    System.err.println("Failed to close output stream: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        String sourcePath = "path/to/source/file.ext";
        String destinationPath = "path/to/destination/file.ext";
        copyFile(sourcePath, destinationPath);
        System.out.println("File copied successfully!");
    }
}
