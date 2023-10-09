package com.mycompany.p3;
import java.util.Scanner;//Librería para entrada de datos

public class P3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc= new Scanner(System.in);
        int suma = 0, prom, c;
         System.out.println("* * *  Promdeio  * * *");
         System.out.println("Los valores de calificacion son del 1 al 1000");
         
         for(int i=1;i<=6;i++){
             System.out.print("Pormedio de la "+i+"° : ");
             c = sc.nextInt();
             suma=suma+c;
         }
        prom=suma/6;
        System.out.print("El promedioi de las 6 calificaciones es: "+prom);
        
    }
}
