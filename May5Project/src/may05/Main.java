package may05;

import may06.Employee;
import myStudent.Student;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner (System.in);

        Employee e1 = new Employee();
        System.out.println("Enter a name..");
        e1.Name = scanner.nextLine();

        System.out.println("Enter a designation..");
        e1.Name = scanner.nextLine();

        System.out.println("Enter an Email Address..");
        e1.Name = scanner.nextLine();

        int year;
        do{
            System.out.println("Enter Year of Birth");
            year = scanner.nextInt();
        }while (year < 1900 || year > LocalDate.now().getYear());

        int month;
        do{
            System.out.println("Enter Month of Birth..");
            month = scanner.nextInt();
        }while (month < 1 || month > 12);

        int day;
        do {
            System.out.println("Enter Day of Birth..");
            day = scanner.nextInt();
        }while (day<1 || day >31);

        e1.DateOfBirth = LocalDate.of(year,month,day);

        System.out.println(e1.DisplayEmployeeInfo());
        System.out.println(e1.DisplayDate());


//        String name = scanner.nextLine();
//        System.out.println("Name entered is:"+name);
//
//        Employee e1 = new Employee();
//        e1.Name = "Bob ";
//        e1.Designation = "Builder";
//        //e1.Salary = 1000;
//        e1.EmailAddress = "test@gmail.com";
//        e1.DateOfBirth = LocalDate.of(1970,01,12);
//
//        System.out.println(e1.EmployeeId);
//        System.out.println(e1.Name);
//        System.out.println(e1.Designation);
//        System.out.println(e1.DisplayEmployeeInfo());
//        System.out.println(e1.DisplayDate());

//        Student s1 = new Student();
//        s1.Name = "Rovin";
//        s1.RollNumber = 101;
//        System.out.println(s1.DisplayInfo());


    }

}
