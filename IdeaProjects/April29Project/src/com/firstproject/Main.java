package com.firstproject;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String a1=AgeClassification(40);
       System.out.println(a1);

        String a2=AgeClassification(17);
        System.out.println(a2);

        String a3=AgeClassification(65);
        System.out.println(a3);

        String a4=AgeClassification(20);
        System.out.println(a4);

    }

    public static String AgeClassification (int age)
    {
        String classification = "";
           if (age<13)
        {
            classification ="Child";
        }
           else if (age>=13 && age<=19)
          {
             classification = "Teen";
          }
        else if (age>64)

        {
            classification = "Senior";
        }
        else
        {
            classification = "Adult";
        }
        return classification;
        }


    }


