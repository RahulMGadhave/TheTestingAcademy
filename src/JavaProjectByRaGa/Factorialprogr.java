package JavaProjectByRaGa;

import java.util.Scanner;

public class Factorialprogr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact=1;
        int i ;

        for(i = 1; i<=num; i++){

            fact = fact*i;
            System.out.println(fact);

        }
       // System.out.println(fact);
    }
}

