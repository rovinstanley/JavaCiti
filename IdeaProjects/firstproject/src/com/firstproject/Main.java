package com.firstproject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String x = "John@123";
        System.out.println(x);

        int a = 200343 + 33333;
        int b = 77;
        int c = a+b;
        System.out.println(c);

        boolean flag = false;
        System.out.println(flag);

        char  oneChar = 'C';
        System.out.println(oneChar);

        float decimalNumber1 = 122.22f;
        float decimalNumber2 = 133.33f;

        float decimalNumber3 = decimalNumber1 * decimalNumber2;
        System.out.println(decimalNumber3);

        int Number4 = 10;
        float Number5 = decimalNumber3 + Number4;
        System.out.println(Number5);

        String s1 = "John", s2 = "Doe";
        String S3 = s1 + s2;
        System.out.println(S3);

        int num1 = 20;
        num1 = ++num1;
        num1 = ++num1;
        System.out.println(num1);

        String txt = "Myname is John &", name = "John", place = "& I live in Toronto";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());

        System.out.println(txt+name);
        System.out.println(txt.concat(name));
        System.out.println(name.concat(txt));

        System.out.println(txt+name+place);
        System.out.println(txt.concat(name).concat(place));

        System.out.println(txt.indexOf(""));
        System.out.println(txt.indexOf("n",txt.indexOf("n")+1));

        int z = 90, y = 99, d = 9, e= 0;

        System.out.println("Math.abs example:" + Math.abs((e-1) * d));
        System.out.println("Maximum Value is:"+Math.max(z,y));
        System.out.println("Maximum Value is:"+Math.min(z,y));
        System.out.println("Square root is:" + Math.sqrt(49));
        System.out.println("Absolute value is:"+Math.abs(-99));

        boolean flags = true;
        boolean isExample = false;

        System.out.println(flags);
        System.out.println(isExample);

        boolean checkGreaterThan;
        checkGreaterThan = 100>99;
        System.out.println(checkGreaterThan);















    }
}
