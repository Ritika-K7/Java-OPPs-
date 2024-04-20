package com.company;

import java.util.Scanner;

public class CWH_5_Questions {
    public static void main(String[] args){
        //Question 1 : Sum of Three Numbers
//        int a=4;
//        int b=7;
//        int c=6;
//        int sum=a+b+c;
//        System.out.println("Sum is :"+sum);

        //Question 2: Calculate CGPA of 5 Subject
//        float Subject1=45;
//        float Subject2=55;
//        float Subject3=60;
//        float Subject4=40;
//        float Subject5=80;
//        float cgpa=(Subject1+Subject2+Subject3+Subject4+Subject5)/50;
//        System.out.println(cgpa);

        //Question 3:Take input of user name & print "Hello <name> have a good day"
//        Scanner sc =new Scanner((System.in));
//        System.out.println("Enter name:");
//        String name=sc.next();
//        System.out.println("Hello " +name+ " have a good day.");

        //Question 4: Kilometer to miles( 1 km=0.6213 miles )
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter Kilometer:");
//        float k= sc.nextFloat();
//        float m= k*0.6213f;
//        System.out.println("miles is :"+m);

        //Question 5:Detect whether number entered by user is int or not.
        System.out.println("Enter number:");
        Scanner sc= new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
