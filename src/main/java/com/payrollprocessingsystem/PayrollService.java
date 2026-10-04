package com.payrollprocessingsystem;
import java.util.List;

public class PayrollService {

    public void processEmployees(List<Employee> employees) {

        for (Employee employee : employees) {

            System.out.println("\n--------------------------");

            employee.displayEmployeeDetails();

            System.out.println("Gross Salary : "
                    + employee.calculateGrossSalary());

            System.out.println("Deduction    : "
                    + employee.calculateDeduction());

            System.out.println("Net Salary   : "
                    + employee.calculateNetSalary());
        }
    }
}

