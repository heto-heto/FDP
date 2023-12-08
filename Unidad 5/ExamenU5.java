/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenu5;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LaboratorioLTI2
 */
public class ExamenU5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        double n;
        System.out.println("1. 3^2x+2 - (28)(3^x) + 3");
        System.out.println("2. Raiz cuadrada de: 3^x^2 + 1");
        System.out.println("3. PI^(x^(2)-2)");
        
        do{
            System.out.print("Ingrese el numero de la ecuacion a realizar: ");
            p=sc.nextInt();
            switch (p) {
                case 1:
                    System.out.print("Ingrese el valor de x: ");
                    n=sc.nextDouble();
                    System.out.println("Resultado: "+Uno(n));
                    break;
                case 2:
                    System.out.print("Ingrese el valor de x: ");
                    n=sc.nextDouble();
                    System.out.println("Resultado: "+Dos(n));
                    break;
                case 3:
                    System.out.print("Ingrese el valor de x: ");
                    n=sc.nextDouble();
                    System.out.println("Resultado: "+Tres(n));
                    break;
                default:
                System.out.println("No entra en una de las opciones. ");
                    break;
            }
            System.out.println("");
        }while(p<1 || p>4);
    }
    
    //1
    public static double Uno(double x){
        double r; 
        //double elevado=(2*x)+2;
        r= Math.pow(3,(2*x)+2)-(28*Math.pow(3,x))+3;
        return r;
    }
    //2
    public static double Dos(double x){
        double r;
        r=Math.sqrt(Math.pow(3,Math.pow(x,2)+1));
        return r;
    }
    //3
    public static double Tres(double x){
        double r;
        r=Math.pow(Math.PI,Math.pow(x, 2)-2);
        return r;
    }
    
}
