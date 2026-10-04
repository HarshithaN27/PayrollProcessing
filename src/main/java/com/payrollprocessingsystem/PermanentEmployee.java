package com.payrollprocessingsystem;
public class PermanentEmployee extends Employee {

    private double houseAllowance;
    private double transportAllowance;

    public PermanentEmployee(String employeeId,
                             String employeeName,
                             double basicSalary,
                             double houseAllowance,
                             double transportAllowance) {

        super(employeeId, employeeName, basicSalary);

        this.houseAllowance = houseAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getHouseAllowance() {
        return houseAllowance;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary()
                + houseAllowance
                + transportAllowance;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.10;
    }
}

