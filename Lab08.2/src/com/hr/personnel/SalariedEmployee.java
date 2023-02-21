package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
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