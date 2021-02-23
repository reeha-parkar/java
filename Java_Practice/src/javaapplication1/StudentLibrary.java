package javaapplication1;
import java.util.*;
public class StudentLibrary {
    public static void main(String[] args) {
        Library s1 = new Library();
        Library s2 = new Library();
        Library s3 = new Library();
        s1.initialize();
        s1.issue();
        s1.addFine();
        s1.Return();
        s2.initialize();
        s2.issue();
        s2.addFine();
        s2.Return();
        s3.initialize();
        s3.issue();
        s3.addFine();
        s3.Return();
        s1.display();
        s2.display();
        s3.display();
    }
}
class Library{
    Scanner sc = new Scanner(System.in);
    int booksIssued = 0, fine = 0, sap;
    String name;
    void initialize(){
        System.out.println("Enter the name of the student");
        String student = sc.nextLine();
        name = student;
        System.out.println("Enter the sap id of the student");
        sap = sc.nextInt();
    }
    void issue(){
        System.out.println("Enter the number of books issued");
        booksIssued = sc.nextInt();
    }
    void addFine(){
        System.out.println("Enter the fine");
        fine = sc.nextInt();
    }
    void Return(){
        System.out.println("Enter the no.of books returned");
        booksIssued -= sc.nextInt();
    }
    void display(){
        System.out.println(name);
        System.out.println(sap);
        System.out.println(booksIssued);
        System.out.println(fine);
    }
}