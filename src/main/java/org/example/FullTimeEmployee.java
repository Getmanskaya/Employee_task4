package org.example;

public class FullTimeEmployee extends Employee {


    public FullTimeEmployee(String name, int salary) {
        super(name, salary);
    }

    //У сотрудника будет указана salary=оплата за месяц, будем считать, что сотрудник работал 12 месяцев (без отпуска/больничных/отгулов)
    @Override
    public void calculateAnnualSalary() {
        System.out.println(getName() + ", Ваша з/п рассчитана на основе месячной зарплаты. За год Вы заработали: " + getSalary() * 12 + " рублей.");
    }


}
