package com.ClassDemos;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee.setCompany("Persistance");
        //e1.setCompany("Persistance");
        e1.displayData();
        double salary = e1.calculateSalary();
        System.out.println("Net Salary   : " + salary);
        System.out.println("---------------------------------");
        Employee e2 = new Employee(123, "Kamini", 60000, "Female", "Performance Testing");
        e2.displayData();
        System.out.println("Net Salary   : " + e2.calculateSalary());
    }
}
