//package Project_list_Core_java;

import java.util.Scanner;

// Basic project 

// 1} write a rogram to create calculate persentage of a given student in CBSC bored exam ,
//       His mark from 5 sub must be take input as from the regi.

public class project1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int Total_mark = 500;

        System.out.println(" Now Enter Subject wise Mark ");

        System.out.print("Math Mark --> ");
        float Math = sc.nextFloat();

        System.out.print("Phy Mark --> ");
        float phy = sc.nextFloat();

        System.out.print("Chem Mark --> ");
        float chem = sc.nextFloat();

        System.out.print("bio Mark --> ");
        float bio = sc.nextFloat();

        System.out.print("Gk Mark --> ");
        float gk = sc.nextFloat();

        float Sumof_subject = Math + phy + chem + bio + gk;

        float persentage = ((Sumof_subject / Total_mark) * 100);

        System.out.println("THe total Parsentage is --> " + persentage);

        


    }
}
