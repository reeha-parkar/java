
package hackerrank;
import java.util.Scanner;
public class HackerRank {

   
    public static void main(String[] args) {
        //Formatted Output
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        for(int i = 0; i < 3; i++){
            int a = sc.nextInt();
            String word = sc.next();
            System.out.printf("%-15s%03d%n", word, +a);
        }
        System.out.println("==================");
    }
    
}
