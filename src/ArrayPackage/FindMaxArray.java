package ArrayPackage;

public class FindMaxArray {
    public static void main(String[] args) {

        int [] array = {11,42,1200,63,100,999};
         int max_value = Integer.MIN_VALUE  ;
        for (int i = 0 ; i< array.length ; i++ ) {
            if (max_value < array[i]) {

                max_value = array[i];

            }
        }
            System.out.println(max_value);
        }



    }

