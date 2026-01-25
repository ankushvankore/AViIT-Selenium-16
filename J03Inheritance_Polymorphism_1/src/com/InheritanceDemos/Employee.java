package com.InheritanceDemos;

public class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    private String gender;
    private String dept;

    public Employee() {
        empId = 101;
        empName = "Chetan";
        basicSalary = 50000;
        gender = "Male";
        dept = "Testing";
        System.out.println("Employee -> Plain");
    }

    public Employee(int empId, String empName, double basicSalary, String gender, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.gender = gender;
        this.dept = dept;
        System.out.println("Employee -> Parameterized");
    }

    public double calculateSalary(){
        double da, hra, pf, net;

        da = basicSalary * 0.50;
        hra = basicSalary * 0.20;
        pf = basicSalary * 0.05;
        net = basicSalary + da + hra - pf;

        return  net;
    }

    public void displayData(){
        System.out.println("Employee Id  : " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Gender       : " + gender);
        System.out.println("Department   : " + dept);
    }
}
