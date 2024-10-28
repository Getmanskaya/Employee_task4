package org.example;

public class App {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Вася", 120000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Катя", 1000);

        fullTimeEmployee.calculateAnnualSalary();
        partTimeEmployee.calculateAnnualSalary();

        }
    }
