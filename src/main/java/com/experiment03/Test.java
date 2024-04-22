package com.experiment03;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 5000, 2);
        Seller seller = new Seller("Alice", 3000, 20000, 0.15);

        double totalSalaries = SalaryService.getTotalSalaries(manager, seller);
        System.out.println("Total salaries: " + totalSalaries);
    }
}
