package com.company;

public class CWH_6_Operators {
    public static void main(String[] args){
        //Operators

        //1.Arithmetic - + ,- ,/ ,% ,++ ,--
        int a=4;
        int b=6+a;
        System.out.println(b);
        int c=4;
        int d=6%c;  //Modulo
        System.out.println(d);

        //2.Assignment - = , +=,*=
        int e=9;
        e+=3;
        System.out.println(e);
        int f=9;
        f *=3;
        System.out.println(f);

        //3.Comparsion - ==,<=,>=,>,<  return true/false
        System.out.println(6==8);

        //4.Logical - &&(AND)(all cond T then T otherwise F),||(OR)(If any one cond T then T)
        System.out.println(64>5 && 64>63);
        System.out.println(3<7 && 7<5);
        System.out.println(3<7 || 7<5);

        //5.Bitwise -&(bitwiseAND) ,|(bitwiseOR)
//        10 (2)
//      & 11 (3)
//       --------
//        10 (2)

        System.out.println(2&3);








    }
}
