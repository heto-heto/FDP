package com.mycompany.p4;
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        System.out.println("* * *  La formula  * * *");
        int x, y, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("De valor a y: ");
        y=sc.nextInt();
        System.out.print("De valor a a: ");
        a=sc.nextInt();
        x=y+a+3;
        System.out.println("x = y+a+3");
        System.out.println("x = "+y+"+"+a+"+3");
        System.out.println("x = "+x);
        
    }
}
