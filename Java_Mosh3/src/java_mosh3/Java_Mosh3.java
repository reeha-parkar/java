package java_mosh3;

public class Java_Mosh3 {
    public static void main(String[] args) {
        TaxCalculatorCoupled calculator = new TaxCalculatorCoupled(100_000); //constsructor injection
        TaxReport report = new TaxReport();
        report.show(calculator);
        
        //report.setCalculator(new TextCalculator2());//setter injection
        //report.show();
        
        report.show(new TextCalculator2());//method injection
    }
    
}























/*
Interface: like a class but ony includes method declarations, no code so no implemntaion
avoids dependency/ coupled classes

In C#, interfaces are named as I and then interface name
or written with can prefix as canCalculateTax
or able words like draggabele and resizeable
*/