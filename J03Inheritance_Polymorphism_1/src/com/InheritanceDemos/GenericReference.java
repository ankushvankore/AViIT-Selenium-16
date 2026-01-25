package com.InheritanceDemos;

public class GenericReference {
    public static void main(String[] args) {
        Employee emp;
        //emp - Reference of Employee / Base Class
        //Generic Reference - is a reference of base class which can hold address of derived class object.
        Employee e1 = new Employee(333, "Amit", 60000, "Male", "Automation");
        //e1 - Object of Employee / Base class
        Manager m1 = new Manager(222, "Pravin", 60000, "Male", "Testing", 50000, 0.05);
        //m1 - Object of Manager / Derived class

        emp = e1;
        emp.displayData();
        System.out.println("Net Salary   : " + emp.calculateSalary());

        System.out.println("-----------------------------");

        emp = m1;
        emp.displayData();
        System.out.println("Net Salary   : " + emp.calculateSalary());

        final double pi = 3.142;
        //pi = 77;
    }
}
