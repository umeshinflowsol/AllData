import DepencyInjection.Address;
import DepencyInjection.Student;

public class Tester {
    public static void main(String[] args) {
        Address address = new Address();
        Student student = new Student();
        new Address();
        student.setId(1);
        student.setName("umesh");
        student.setAddress(address);
        System.out.println(student.toString());


    }{
        Address address = new Address();
        Student student = new Student();
        new Address();
        student.setId(1);
        student.setName("umesh");
        student.setAddress(address);
        System.out.println(student.toString());


    }
}
