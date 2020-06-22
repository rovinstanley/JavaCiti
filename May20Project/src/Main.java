import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Car> customCars = new ArrayList<>();

        customCars.add(new Car("Mercades", "S-Class", "Sport", 2020, 140));
        customCars.add(new Car("Toyota", "RAV4", "SUV", 2018, 220));

        Car c2 = new Car("Nissan", "Sentra", "Sedan", 2010, 140);
        customCars.add(c2);



        Collections.sort(customCars);
        for (Car c: customCars){
            System.out.println(c.ModelName);
        }

    }
}
