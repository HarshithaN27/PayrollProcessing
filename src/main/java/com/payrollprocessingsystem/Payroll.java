package com.payrollprocessingsystem;
public class Payroll {

    private Employee employee;

    public Payroll(Employee employee) {
        this.employee = employee;

    }

    public void processPayroll() {
        System.out.println("Processing Payroll...");
        System.out.println("Gross Salary : " + employee.calculateGrossSalary());
        System.out.println("Deduction    : " + employee.calculateDeduction());
        System.out.println("Net Salary   : " + employee.calculateNetSalary());
    }

    public void generatePayslip() {
        System.out.println("\n========== PAYSLIP ==========");
        employee.displayEmployeeDetails();
        System.out.println("Gross Salary : " + employee.calculateGrossSalary());
        System.out.println("Deduction    : " + employee.calculateDeduction());
        System.out.println("Net Salary   : " + employee.calculateNetSalary());
        System.out.println("=============================");
    }
}

