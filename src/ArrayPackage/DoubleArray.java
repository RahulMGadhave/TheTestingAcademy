package ArrayPackage;

public class DoubleArray {
    public static void main(String[] args) {
        int [] DArry = {14,45,23,41,33,62};
        int [] DArray2 = new int[6] ;
        for (int i= 0; i< DArry.length ; i++){
           DArray2 [i]= DArry[i]*2;
            System.out.println(DArray2[i]);
        }
    }
}
