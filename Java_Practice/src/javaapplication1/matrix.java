package javaapplication1;
import java.util.*;

public class matrix {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int a[] = {1,5,3,6,8,2,4,7,9,2};
        int n = a.length;
        //int sum = 0;
        for(int i = 0;i < n;i++){
            System.out.println(a[i]);          
        }
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[i] > a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Sorted list:");
        for(int i = 0;i < n;i++){
            System.out.println(a[i]);          
        }
        
    }
}
