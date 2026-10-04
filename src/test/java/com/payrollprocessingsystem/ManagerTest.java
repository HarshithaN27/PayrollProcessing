package com.payrollprocessingsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ManagerTest {

    private Manager manager;

    @BeforeEach
    void setUp() {
        manager = new Manager(
                "EMP103",
                "Priya",
                6000,
                800,
                300,
                1000
        );
    }

    @Test
    void managerShouldNotBeNull() {
        assertNotNull(manager);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(8100, manager.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(972, manager.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(7128, manager.calculateNetSalary());
    }
}