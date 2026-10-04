package com.payrollprocessingsystem;
import java.util.ArrayList;
import java.util.List;

public class PayrollApplication {

    public static void main(String[] args) {

        // Create Permanent Employee
        PermanentEmployee permanentEmployee =
                new PermanentEmployee(
                        "EMP101",
                        "Santhosh",
                        3000,
                        500,
                        200
                );

        // Create Contract Employee
        ContractEmployee contractEmployee =
                new ContractEmployee(
                        "EMP102",
                        "Harshini",
                        3000,
                        400
                );

        // Create Manager
        Manager manager =
                new Manager(
                        "EMP103",
                        "Priya",
                        5000,
                        800,
                        300,
                        1000
                );

        // HAS-A Relationship
        Payroll payroll = new Payroll(permanentEmployee);

        payroll.processPayroll();
        payroll.generatePayslip();

        // Polymorphism
        System.out.println("\n===== POLYMORPHISM =====");

        Employee employee;

        employee = permanentEmployee;
        System.out.println("Permanent Gross Salary : "
                + employee.calculateGrossSalary());

        employee = contractEmployee;
        System.out.println("Contract Gross Salary  : "
                + employee.calculateGrossSalary());

        employee = manager;
        System.out.println("Manager Gross Salary   : "
                + employee.calculateGrossSalary());

        // Store multiple employees
        List<Employee> employees = new ArrayList<>();

        employees.add(permanentEmployee);
        employees.add(contractEmployee);
        employees.add(manager);

        // Payroll Service
        PayrollService service = new PayrollService();
        service.processEmployees(employees);

        // Payroll Report
        PayrollReport report = new PayrollReport();
        report.displayReport(employees);
    }
}

