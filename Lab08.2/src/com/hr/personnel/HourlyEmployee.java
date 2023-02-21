package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();                // a superclass ctor is always called, whether you say this or not!
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setRate(rate);          // handle rate myself, by delegating to setter
        setHours(hours);        // ditto here
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}