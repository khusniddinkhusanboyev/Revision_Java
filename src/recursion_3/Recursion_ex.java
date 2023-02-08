package recursion_3;

import java.util.Scanner;

public class Recursion_ex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        reverse("Welcome");
    }
    public static void reverse(String word){
        if (word==null || word.length()<=1){
            System.out.println( word);
        }else {
            System.out.print(word.charAt(word.length()-1));
            reverse(word.substring(0,word.length()-1));
        }

    }
}
