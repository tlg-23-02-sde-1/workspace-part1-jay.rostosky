package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    public static final double STANDARD_DEDUCTION = 10_000.0;

    private double salary;

    public SalariedEmployee() {
        super();                // a superclass ctor is always called, whether you say this or not!
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
        // registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setSalary(salary);      // handle salary myself, by delegating to its setter
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override   // interface TaxPayer
    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    @Override   // interface TaxPayer
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    @Override   // interface TaxPayer
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}