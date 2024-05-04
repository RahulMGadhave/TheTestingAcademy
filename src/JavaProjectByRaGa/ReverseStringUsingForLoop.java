package JavaProjectByRaGa;

public class ReverseStringUsingForLoop {

    public static void main(String[] args) {
        String s = "RAHUL";

        for (int i=s.length()-1 ;i >= 0; i--){
            //char revestring = s.charAt(i);
            System.out.print(s.charAt(i));
        }
    }
}
