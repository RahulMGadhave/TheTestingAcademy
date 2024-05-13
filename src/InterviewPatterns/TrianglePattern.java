package InterviewPatterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {

        // ****** To Draw Right angle traingle *******
          Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the triangle:");
        int height = scanner.nextInt();

        scanner.close();

        for (int i = 0 ; i< height ; i++){
            for (int j = 0 ; j<i ; j++){

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    }


//          //******* To draw Triangle ********
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the height of the triangle:");
//        int height = scanner.nextInt();
//
//        drawTriangle(height);
//
//        scanner.close();
//    }
//
//    public static void drawTriangle(int height) {
//        for (int i = 1; i <= height; i++) {
//            // Print spaces before stars
//            for (int j = 1; j <= height - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Print stars
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }
//}

               //******* To draw reverse Triangle ********

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the height of the triangle:");
//        int height = scanner.nextInt();
//
//        drawTriangle(height);
//
//        scanner.close();
//    }
//
//    public static void drawTriangle(int height) {
//        for (int i = height -1; i >= 1; i--) {
//            // Print spaces before stars
//            for (int j = 1; j <= height - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Print stars
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }
//}