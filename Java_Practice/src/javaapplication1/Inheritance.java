package javaapplication1;
class Super{
    int salary = 50000;
    public void inc(){
        System.out.println("This is base level income.");
    }
}
interface intf{
    void print();
}
public class Inheritance extends Super implements intf{
    @Override
    public void print(){
        System.out.println("Hello, this is employee E1");
    }
    int bonus = 17000;
    @Override
    public void inc(){
        System.out.println("This is total salary of employee E1");
    } 
    public static void main(String[] args){
        Inheritance employee1 = new Inheritance();
        employee1.print();
        System.out.println("the salary of employee1 ="+employee1.salary);
        System.out.println("The bonus of emloyee1 ="+employee1.bonus);
        employee1.inc();
    }
}
