package com.experiment03;

public class SalaryService {
    public static double getTotalSalaries(Employee... employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }
        return total;
    }
}

