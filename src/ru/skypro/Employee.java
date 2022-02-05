package ru.skypro;

public class Employee {
    //    Я понимаю что можно отдельно выделить фамилию,имя и отчество в разные переменные и работать с ними,
//    но мне показалось это неудобным и излишним, поэтому я сразу выделил переменную в которую пишется полное ФИО человека
    private String employeeFullName;
    private int employeeDepartment;
    private int employeePayment;
    private int id;
    //Переменная счетчик
    public static int idCounter = 1;

    public Employee(String employeeFullName,int employeeDepartment, int employeePayment){
        if (employeeDepartment <1 || employeeDepartment >5){
            System.out.println("Такого департамента не существует");
            return;
        }
        this.employeeFullName = employeeFullName;
        this.employeeDepartment = employeeDepartment;
        this.employeePayment = employeePayment;
        this.id = idCounter++;
    }
    //Геттеры
    public String getEmployeeFullName(){
        return employeeFullName;
    }
    public int getEmployeeDepartment(){
        return employeeDepartment;
    }
    public int getEmployeePayment(){
        return employeePayment;
    }
    //Сеттеры
    public void setEmployeeDepartment(int newEmployeeDepartment){
        this.employeeDepartment = newEmployeeDepartment;
    }
    public void setEmployeePayment ( int newEmployeePayment ) {
        this.employeePayment = newEmployeePayment;
    }
    //Поле вывода
    public String toString(){
        return "ФИО: " + this.employeeFullName + ", зарплата в рублях: "+this.employeePayment+
                ", отдел: "+this.employeeDepartment
                + ", ID сотрудника: "+this.id;
    }
}
