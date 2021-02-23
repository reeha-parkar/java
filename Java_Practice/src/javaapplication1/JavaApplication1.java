// Exception Handling
package javaapplication1;
import java.util.*;
class marksOutOfBoundsException extends Exception{
    public void showError(){
        System.out.println("Invalid");
}
}
public class JavaApplication1 {

    public static void main(String[] args) {
     //Vector<String> res = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter seat number: ");
        String seatno = sc.next();
        System.out.println("Enter date in DD.MM.YYYY format: ");
        String date = sc.next();
        System.out.println("Enter center number: ");
        int centreno = sc.nextInt();
        boolean f = false;
        int marks = 0;
        do{
            f = false;
            try{
                System.out.println("Enter marks: ");
                marks = sc.nextInt();
                if(marks<0 || marks>100)
                   throw new marksOutOfBoundsException();
            }
            catch(marksOutOfBoundsException e){
                e.showError();
                f = true;
            }
        }while(f);
        
        System.out.println("Name: "+name + "Seat number: "+seatno + "Date: "+date + "Center number: "+centreno + "Marks: " +marks);
    }
    
}
