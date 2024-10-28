package org.example;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int salary) {
        super(name, salary);
    }


    //У сотрудника будет указана salary=оплата за час, 8ч рабочий день и 248 рабочих дней в году
    @Override
    public void calculateAnnualSalary() {
        System.out.println(getName() + ", Ваша з/п рассчитана на основе почасовой оплаты труда. За год Вы заработали: " + getSalary() * 8 * 248 + " рублей.");
    }

}
