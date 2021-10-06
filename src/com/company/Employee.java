package com.company;

public abstract class Employee {

    public void fileW2Forms(){
        System.out.println("Here are your W2 Tax forms");
    }

    public void WithHoldTaxes(){
        System.out.println("Removing "+calculateBiWeeklyPay()+.1+" of your pay for taxes");
    }

    public abstract double calculateBiWeeklyPay();
}
