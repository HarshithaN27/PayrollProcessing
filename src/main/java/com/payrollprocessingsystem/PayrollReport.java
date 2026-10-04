package com.payrollprocessingsystem;

import java.util.List;

public class PayrollReport {

    public void displayReport(List<Employee> employees) {

        System.out.println("\n========= PAYROLL REPORT =========");

        for (Employee employee : employees) {

            System.out.println("\nEmployee : "
                    + employee.getEmployeeName());

            System.out.println("Gross    : "
                    + employee.calculateGrossSalary());

            System.out.println("Deduction: "
                    + employee.calculateDeduction());

            System.out.println("Net      : "
                    + employee.calculateNetSalary());
        }

        System.out.println("==================================");
    }
}