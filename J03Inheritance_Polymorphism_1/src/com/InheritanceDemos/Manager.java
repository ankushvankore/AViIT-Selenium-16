package com.InheritanceDemos;

public class Manager extends Employee{
    private double sales;
    private double rate;

    public Manager(){
        super();
        //Will call plain constructor of Employee class
        sales = 0;
        rate = 0;
        System.out.println("Manager -> Plain");
    }

    public Manager(int id, String nm, double bs, String gn, String dp, double s, double r){
        super(id, nm, bs, gn, dp);
        //Will call parameterized constructor of Employee class
        sales = s;
        rate = r;
        System.out.println("Manager -> Parameterized");
    }

    public double calculateInsentive(){
        return sales * rate;
    }

    public double calculateSalary() {
        return super.calculateSalary() + calculateInsentive();
        //super --> Will call function of base class
    }
    public  void displayData(){
        super.displayData();
        System.out.println("Total Sales  : " + sales);
        System.out.println("Rate of Comm : " + rate);
    }
}
