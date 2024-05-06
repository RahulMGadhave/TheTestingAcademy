package ArrayPackage;

public class PrintingTwoDArray {

    public static void main (String[] args){

        int [][] array =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array[i].length; j++){

                System.out.println(array[i][j]);
            }
//            System.out.println("We can print this by Using 'for each' loop");
//
//            for (int []input :array){
//                System.out.println(input);
//            }
        }




    }
}
