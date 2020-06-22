import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        	// write your code here
        String[] cars = { "Volvo","BMW","Ford","Mazda"};
        System.out.println(cars[2]);

        //ArrayList
        ArrayList<String> sampleCars= new ArrayList<String>();
        sampleCars.add("Volvo");
        sampleCars.add("BMW");
        sampleCars.add("Ford");
        sampleCars.add("Mazda");
        System.out.println(sampleCars);

        sampleCars.remove(0);
        System.out.println(sampleCars);

        sampleCars.remove(0);
        System.out.println(sampleCars);

        sampleCars.remove(0);
        System.out.println(sampleCars);

        int [] employeeIds = { 1001,1002,1002,1004};
        System.out.println(employeeIds[0]);

        ArrayList<Integer> empIds = new ArrayList<Integer>();
        empIds.add(2001);
        empIds.add(2002);
        empIds.add(2003);
        empIds.add(2004);
        System.out.println(empIds);

        empIds.remove(2);
        System.out.println(empIds);

        empIds.remove(2);
        System.out.println(empIds);


        ArrayList<String> cartoonNames = new ArrayList<String>();
        cartoonNames.add("Donald");
        cartoonNames.add("Daffy");
        cartoonNames.add("Mickey");
        cartoonNames.add("Garfield");
        cartoonNames.add("Bugs Bunny");

        cartoonNames.set(4,"Scooby-Doo");

        Collections.sort(cartoonNames);

        //for each loop
        for (String name: cartoonNames)
        {
            System.out.println(name);
        }

            //size or count
         System.out.println(cartoonNames.size());

         // revere sort
            Collections.reverse(cartoonNames);
            System.out.println(cartoonNames);

    }
}
