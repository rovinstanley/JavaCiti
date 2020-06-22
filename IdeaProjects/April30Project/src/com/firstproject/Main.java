package com.firstproject;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(Add(10,13,1));
        System.out.println(Add(10,13));
    }
    public static int Add(int num1, int num2)
    {
        return num1 + num2;

    }
    public static int Add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}
