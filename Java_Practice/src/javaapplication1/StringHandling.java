package javaapplication1;
import java.util.*;
public class StringHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        System.out.println("Length of the string is: "+str.length());
        str = str.substring(0,1).toUpperCase()+ str.substring(1).toLowerCase();
        System.out.println("The string after capitalizing the first character: "+str);
        
        String sen = new String();
        System.out.println("Enter a sentence: ");
        sen = sc.nextLine();
        String words[] = sen.split("\\s+");
        System.out.println("The words in the sentence are as follows: ");
        for(int i = 0;i<words.length;i++){
            System.out.println(words[i]);
        }
        StringBuffer builder = new StringBuffer(sen.length()+(sen.length()/5+1));
        int index = 0;
        String prefix = "";
        while(index<sen.length()){
            builder.append(prefix);
            prefix = "$";
            builder.append(sen.substring(index,Math.min(index + 5, sen.length())));
            index += 5;
        }
        System.out.println("The sentence after inserting $ after every 5th character is: "+(builder.toString()));
    }
}
