package JavaProjectByRaGa;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word will check whether it Palindrome or Not !!");
        String user_input = sc.next();

        StringBuffer sb = new StringBuffer(user_input);
        String reverse_UI = sb.reverse().toString();

        if(user_input.equalsIgnoreCase(reverse_UI)){
            System.out.println("Yess !! It is Palindrome :)");
        }else{
            System.out.println("NO !! Not Palindrome :( ");
        }
        sc.close();
    }
}
