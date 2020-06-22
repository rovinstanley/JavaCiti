package com.firstproject;

public class Main {

    public static void main(String[] args) {

        double t = Add(10.33, 3);
        System.out.println(t);

        double t1 = Add(40, 5.55);
        System.out.println(t1);

        double t2 = Add(2323, 121.4);
        System.out.println(t2);

        double t5 = Subtraction(59.5,10);
        System.out.println(t5);

        double t6 = Mult(10.01,5.55);
        System.out.println(t6);

        double t7 = Divide(43,3);
        System.out.println(t7);



    }
    public static double Mult (double  number1, double number2)
    {
        double multiply = number1*number2;
                return multiply;
    }


    public static double Subtraction ( double number1, double number2)
    {

        double difference = 0;
        difference = number1-number2;
        return difference;
    }
        public static double Add ( double number1, double number2)
        {
            double total = 0;
            total= number1+number2;
            return total;

        }

        public static double Divide (double num1, double num2)
        {
            double result;
            if (num1>num2)
            {
                result = num1/num2;
            }
            else
            {
                result = num2/num1;
            }
            return result;        }

}
