package javaapplication2;
import java.util.Arrays;
import java.text.NumberFormat;
public class fundamental{
    public static void main(String[] args){
        // Strings and its syntax:
        /*String hello = "Hello, world" + "!!";
        System.out.println(hello);
        System.out.println(hello.endsWith("!!")); //Checks if it does end with whatever included
        System.out.println(hello.startsWith("!!"));
        System.out.println(hello.length());
        System.out.println(hello.indexOf("w"));
        System.out.println(hello.indexOf("sky"));
        System.out.println(hello.replace("w","b")); // all occurrences modified + does not change original string
        System.out.println(hello.toUpperCase());
        System.out.println(hello.trim());
        
       //Escape sequences: 
        System.out.println("Hello \"World\"");
        System.out.println("C:\\Windows\\Administrator\\");
        System.out.println("Hey \nthere, \t I am World!");
        
        //Arrays:
        int[] numbers = new int[10]; 
        numbers[0] = 1;
        numbers[2] = 2;
        //numbers[30] = 20;     //Exception in thread error
        System.out.println(Arrays.toString(numbers));
        int[] others  = {1,2,6,9,0,3};
        System.out.println(others.length);
        Arrays.sort(others);
        System.out.println(Arrays.toString(others));
        int[][] matrix = new int[2][3];
        matrix[1][2] = 3;
        System.out.println(Arrays.deepToString(matrix));
        int[][] matrix1 ={{1,2,3},{0,1}};
        System.out.println(Arrays.deepToString(matrix1));
        
        //Constants
        final float PI = 3.14159F; //cannot assign any other value to PI & also, constants are generally designated with capital letters
        
        //Arithmetic operations
        double result = (double)10/(double)3;
        System.out.println(result);
                
        //Casting
        //Implicit Casting
        // byte < short < int < long < float < double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        //Explict casting
        double a = 1.1;
        int b = (int)a + 1;
        System.out.println(b);
        //What if one of the variable is a string? You mean like this?
        String c = "1";
        int d = Integer.parseInt(c) + 1;
        System.out.println(d);
        
        int result = Math.round(1.3F); //1.5 rounded to 2 // round method returns a long
        System.out.println(result);
        int result1 = (int)Math.ceil(1.234);  //ceil returns a double
        System.out.println(result1); //ceil gives the greatest integer function
        int result2 = (int)Math.floor(1.234);  //ceil returns a double
        System.out.println(result2); //floor gives the smallest integer function
        System.out.println(Math.max(1,2));
        System.out.println(Math.min(5, 3));
        double any = Math.random();         //returns a double and any number between 0 and 1 by default
        System.out.println(any);
        int any1 = (int)Math.round(Math.random()*100); // Multiplying by any number gives a random number between 0 to that number
        System.out.println(any1); // can also be possible without the round method
        
        //Formatting numbers
        //NumberFormat currency = new NumberFormat(); // NumberFormat is abstact hence, cannot be instantiated
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.890);
        System.out.println(result);
        String result1 = NumberFormat.getPercentInstance().format(0.1);   //Method Chaining
        System.out.println(result1);
        */
        
    }
    
}
