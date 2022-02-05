package ru.skypro;

public class EmployeeUtility {
    private static Employee[] employeeDatabase;
    public EmployeeUtility(Employee[] employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }
    public static void allEmployeesInfo (Employee[] employeeDatabase) {
        System.out.println("Информация о сотрудниках в полученной базе данных: ");
        for (int i = 0; i < employeeDatabase.length; i++) {
            Employee currentEmployee = employeeDatabase[i];
            System.out.println("  "+currentEmployee.toString());
        }
        System.out.println();
    }
    public static void totalMonthPay(Employee[] employeeDatabase){
        int totalPay = 0;
        for(int i=0;i< employeeDatabase.length;i++){
            totalPay += employeeDatabase[i].getEmployeePayment();
        }
        System.out.println("Полная сумма затрат на сотрудников в месяц составляет "+ totalPay + " рублей");
        System.out.println();
    }
    public static void maxPayEmployee(Employee[] employeeDatabase){
        int maxPay = 0;
        Employee maxPayEmployee = employeeDatabase[0];
        for (int i =0;i<employeeDatabase.length;i++){
            if (employeeDatabase[i].getEmployeePayment()>maxPay){
                maxPay = employeeDatabase[i].getEmployeePayment();
                maxPayEmployee = employeeDatabase[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxPayEmployee.getEmployeeFullName() +
                ", зарплата составляет: "+ maxPay);
        System.out.println();
    }
    public static void minPayEmployee(Employee[] employeeDatabase){
        int minPay = employeeDatabase[0].getEmployeePayment();
        Employee minPayEmployee = employeeDatabase[0];
        for (int i =0;i<employeeDatabase.length;i++){
            if (employeeDatabase[i].getEmployeePayment()<minPay){
                minPay = employeeDatabase[i].getEmployeePayment();
                minPayEmployee = employeeDatabase[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minPayEmployee.getEmployeeFullName() +
                ", зарплата составляет: "+ minPay);
        System.out.println();
    }
    public static void averagePay(Employee[] employeeDatabase){
        int totalPay = 0;
        for(int i=0;i< employeeDatabase.length;i++){
            totalPay += employeeDatabase[i].getEmployeePayment();
        }
        float averagePay = (float) totalPay/ employeeDatabase.length;
        System.out.println("Среднее значение зарплат составляет " + averagePay + " рублей");
        System.out.println();
    }
    public static void allEmployeesFullNames(Employee[] employeeDatabase){
        System.out.println("Полные имена сотрудников: ");
        for(int i = 0;i<employeeDatabase.length;i++){
            System.out.println("  " + employeeDatabase[i].getEmployeeFullName());
        }
        System.out.println();
    }
}
