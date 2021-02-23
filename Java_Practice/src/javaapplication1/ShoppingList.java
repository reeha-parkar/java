package javaapplication1;
import java.util.*;


public class ShoppingList {
    public static void main(String[] args){
      Vector <String> sl = new Vector<>();
      Scanner sc = new Scanner(System.in);
      while(true){
          System.out.println("Enter 1 to add , 2 to remove an item, 3 to print list, 4 to end");
          int choice = sc.nextInt();
          switch(choice){
              case 1:
                  System.out.println("Enter element: ");
                  String groc = sc.next();
                  System.out.println("Enter location to add item: ");
                  int loc = sc.nextInt();
                  sl.add(loc,groc);
                  break;
              case 2:
                  System.out.println("Enter element: ");
                  String item = sc.next();
                  sl.remove(item);
                  break;
              case 3:
                  System.out.println(sl);
                  break;
              case 4:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Incorrect option, please enter again");
          }
      }
    }
}
