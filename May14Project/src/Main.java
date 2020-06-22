import ABSexc.Employee;
import ABSexc.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c1 = new Car();
        c1.Honk();
        c1.PassengerCapacity();

        Dog d1 = new Dog();
        d1.AnimalSound();
        d1.SleepSound();

        Employee e1 = new Employee();
        e1.DisplayName();
    }
}
