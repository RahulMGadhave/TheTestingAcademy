package BluePrintClass;

public class StudentDetailsObject {

    public static void main(String[] args) {

        Student st = new Student();
        Course co = new Course();
        Payment pmt = new Payment();
        st.name= "Shekhar";
        st.email="shekhar@gmail.com";
        st.age="25";
        st.experiance= 3;
        st.Studentocupation(st.experiance);

        System.out.println(st.experiance);

    }
}
