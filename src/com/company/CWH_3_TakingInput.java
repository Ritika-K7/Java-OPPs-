package com.company;
import java.util.Scanner;

public class CWH_3_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter num 1 :");
//        int a=sc.nextInt();
//        System.out.println("Enter num 2 :");
//        int b=sc.nextInt();
//        int sum =a+b;
//        System.out.println("The sum is :"+sum);

//          To check the validity
//        boolean b1=sc.hasNextInt();
//        System.out.println(b1);

        String str=sc.next();
        System.out.println(str);

//        OUTPUT
//        Taking Input from User
//        Ritika
//        Ritika

//        Taking Input from User
//        Ritika is a good girl
//        Ritika

//        next() method :read only one word
//        nextline() method :read the whole line


        String str2=sc.nextLine();
        System.out.println(str2);

    }
}
