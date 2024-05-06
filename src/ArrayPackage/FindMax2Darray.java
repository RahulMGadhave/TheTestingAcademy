package ArrayPackage;

public class FindMax2Darray {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 1365, 6},
                {7, 8, 9}
        };
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max_value < array[i][j]) {

                    max_value = array[i][j];
                }
            }
        }
        System.out.println(max_value);
    }
}
