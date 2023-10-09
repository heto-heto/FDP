package com.mycompany.p5;
import java.util.Scanner;//Librería para entrada de datos
public class P5 {

    public static void main(String[] args) {
        System.out.println("* * *  Area y perimetro de un triangulo  * * *  ");
        int b, h, p;
        float a;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de la base: ");
        b=sc.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        h=sc.nextInt();
        p=b*3;
        a=(b*h)/2;
        System.out.println("Area: "+a);
        System.out.print("Perimetro: "+p);
             
    }
}
