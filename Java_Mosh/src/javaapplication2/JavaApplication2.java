package javaapplication2;
import java.util.Date;
import java.awt.*;
import java.util.*;

public class JavaApplication2 {

    public static void main(String[] args) {
        //Basic and modified data types
        int a = 10;
        System.out.println("Hello, world!" +a);
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);
        
        //Takin' an input from user
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("The integer you entered is: "+b);
        System.out.println("Enter a word");
        String name = sc.next();  //only one word
        System.out.println("Your word is "+name);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine(); //Full sentence (with spaces)
        System.out.println("Your sentence is " +sentence);
        System.out.println("Enter name or a sentence with a lot of spaces before or after it");
        String withSpaces = sc.nextLine().trim();
        System.out.println("Your full name without any space is: "+withSpaces);
    }
    
}
