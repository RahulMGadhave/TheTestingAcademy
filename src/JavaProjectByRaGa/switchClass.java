package JavaProjectByRaGa;

import java.util.Scanner;

public class switchClass {
    public static void main(String[] args) {
        int res;
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter which operation you want to perform (+,-,*,/,%):");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
                res=num1+num2;
                System.out.println("Sum of " + num1 +" and " + num2 + " is: " + res);
                break;
            case '-':
                res=num1-num2;
                System.out.println("Difference of " + num1 +" and " + num2 + " is: " + res);
                break;
            case '*':
                res=num1*num2;
                System.out.println("Product of " + num1 +" and " + num2 + " is: " + res);
                break;
            case '/':
                res=num1/num2;
                System.out.println("Division of " + num1 +" by " + num2 + " is: " + res);
                break;
            case '%':
                res=num1%num2;
                System.out.println("Remainder when dividing " + num1 +" by " + num2 + " is: " + res);
                break;
            default:
                System.out.println("Please enter valid symbol for performing operation....");
        }
    }
}
