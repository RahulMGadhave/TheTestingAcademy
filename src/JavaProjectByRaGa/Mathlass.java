package JavaProjectByRaGa;

public class Mathlass {
    public static void main(String[] args) {
        int x = 10 , y = 12 ,p = 2,p2 =1/3, exp1,exp2,exp3,result1;
        float z= 56.78f;
        double result ;

        exp1= (int) Math.pow(x,p);
        exp2= (int) Math.pow(y,p);
        exp3= (int) Math.abs(z);
        result1=exp1+exp2-exp3;
        result =  Math.cbrt(result1);

        System.out.println(result);
    }
}
