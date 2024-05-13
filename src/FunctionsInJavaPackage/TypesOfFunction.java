package FunctionsInJavaPackage;

public class TypesOfFunction {
        public static void main(String[] args) {
            // 1. Non Return with no parameter
            saySomethingPlease();
            // 2. Non return with parameter
            sayHelloToYou("pramod");

            // 3. Return with no parameter
            sumOfTwoBad();
            System.out.println(sumOfTwoBad());
            // 4. Return with parameter
            int result = sumOfTwoGood(3, 4);
            System.out.println(result);


        }
        static int sumOfTwoGood(int a, int b) {
            return a + b;
        }

        static int sumOfTwoBad() {
            return 5 + 6;
        }

        static void sayHelloToYou(String name) {
            System.out.println("Hello, " + name);
        }

        static void saySomethingPlease() {
            System.out.println("Non Return with no parameter");
        }
    }


