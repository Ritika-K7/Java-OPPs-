package com.company;

import java.util.Scanner;

public class CWH_4_PercentageCalculator {
    public static void main(String[] args){
        System.out.println("Percentage Calculator");
        System.out.println("Input the marks");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks of English:");
        int a=sc.nextInt();
        System.out.println("Enter marks of Maths:");
        int b=sc.nextInt();
        System.out.println("Enter marks of EVS:");
        int c=sc.nextInt();
        System.out.println("Enter marks of History:");
        int d=sc.nextInt();
        System.out.println("Enter marks of Civis:");
        int e=sc.nextInt();
        //sum
        float s=(a+b+c+d+e);
        //Percentage
        float Percentage=(s/500)*100f;
        System.out.println("The Percentage of marks is:"+Percentage+"%");


    }
}
