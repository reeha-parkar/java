
package javaapplication1;

public class methodOverloading {
    public static void main(String[] args){
        calculate a = new calculate();
        a.area(20,10);
        a.area(20);
        a.area(2.35F);
    }
}
class calculate{
    void area(int l, int b){
        System.out.println("Area of the rectangle is: "+(l*b));
    }
    void area(int s){
        System.out.println("Area of the square is: "+(s*s));
    }
    void area(float r){
        System.out.println("Area of the circle is: "+(3.14*r*r));
    }
}
