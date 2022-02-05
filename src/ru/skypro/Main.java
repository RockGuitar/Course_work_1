package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Employee[] database = new Employee[10];
//        Все ФИО сгенерированы случайно
        Employee first = new Employee("Моисеев Нисон Тимофеевич", 1, 21200);
        Employee second = new Employee("Власов Родион Кимович", 2, 26799);
        Employee third = new Employee("Ершов Модест Евгеньевич", 2, 68098);
        Employee fourth = new Employee("Семёнова Айлин Натановна", 4, 45313);
        Employee fifth = new Employee("Суханов Аристарх Константинович", 5, 50992);
        Employee sixth = new Employee("Овчинникова Северина Гордеевна", 5, 11400);
        Employee seventh = new Employee("Дмитриев Мечеслав Матвеевич", 3, 48421);
        Employee eighth = new Employee("Шарова Азалия Семёновна", 3, 40594);
        Employee ninth = new Employee("Кононов Август Протасьевич", 2, 50987);
        Employee tenth = new Employee("Полякова Октябрина Улебовна", 3, 67900);

        database[0] = first;
        database[1] = second;
        database[2] = third;
        database[3] = fourth;
        database[4] = fifth;
        database[5] = sixth;
        database[6] = seventh;
        database[7] = eighth;
        database[8] = ninth;
        database[9] = tenth;

        EmployeeUtility.totalMonthPay(database);
        EmployeeUtility.averagePay(database);
        EmployeeUtility.maxPayEmployee(database);
        EmployeeUtility.minPayEmployee(database);
        EmployeeUtility.allEmployeesFullNames(database);
        EmployeeUtility.allEmployeesInfo(database);
    }
}
