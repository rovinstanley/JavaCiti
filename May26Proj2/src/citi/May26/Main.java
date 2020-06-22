package citi.May26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int temp;
        boolean isPrime = true;
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter any number");

        int num = scanObj.nextInt();
        scanObj.close();
        for (int i = 2; i <=num/2; i++)
        {
            temp = num%i;
            if(temp==0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num+"is a Prime number");
        else
            System.out.println(num+"is NOT a Prime number");


    }
}
