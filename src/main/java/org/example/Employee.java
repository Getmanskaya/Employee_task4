package org.example;

public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void calculateAnnualSalary();

    //геттер и сеттер для поля salary
    public int getSalary() {
        return salary;
    }

    public void setSalary() {
    }

    //геттер и сеттер для поля name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
