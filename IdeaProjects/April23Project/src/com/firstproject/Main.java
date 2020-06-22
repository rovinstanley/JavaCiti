package com.firstproject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] cars = {"volvo", "BMW", "Ford","Mazda", "ABC"};
        System.out.println(cars.length);
        cars[4] = "Benz";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);

        // second example//

        int [] employeeId = {1002, 1003, 1004,1005, 9999};

        employeeId[4] = 1006;
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);

        System.out.println(employeeId.length);


    }
}
