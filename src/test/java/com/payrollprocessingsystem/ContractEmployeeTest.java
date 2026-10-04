package com.payrollprocessingsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new ContractEmployee(
                "EMP102",
                "Kavin",
                3000,
                400
        );
    }

    @Test
    void shouldCalculateGrossSalary()
    {
        assertEquals(3400, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(170, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {

        assertEquals(3230, employee.calculateNetSalary());
    }

    @Test
    void employeeShouldNotBeNull() {
        assertNotNull(employee);
    }
}
