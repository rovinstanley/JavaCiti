import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee e1 = new Employee();

        e1.setEmployeeId(2001);
        System.out.println(e1.getEmployeeId());

        e1.setName("John");
        System.out.println(e1.getName());

        e1.setDoB(LocalDate.of(1990,10,20));
        System.out.println(e1.getDoB());

        Student s1 = new Student ();
        s1.setRollNumber(1234);
        System.out.println(s1.getRollNumber());

        s1.setFullName("Paul");
        System.out.println(s1.getFullName());



    }


}
