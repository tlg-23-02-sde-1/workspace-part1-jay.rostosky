/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
public abstract class Employee {
    // fields
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {
        super();    // a superclass ctor is always called, whether you say this or not!
    }

    public Employee(String name, LocalDate hireDate) {
        super();    // a superclass ctor is always called, whether you say this or not!
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    /*
     * We declare THAT "all Employees get paid," BUT we don't implement it here in { }.
     * This is because we simply can't do so meaningfully, all we have is name, hireDate.
     * HOWEVER, this establishes a "contract" - all subclasses MUST provide pay() { }.
     */
    public abstract void pay();

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", hireDate=" + getHireDate();
    }
}