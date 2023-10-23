package com.mycompany.programa_2;
import java.util.Scanner;

public class Programa_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prom, cal, suma=0;
        System.out.println("El metodo de calificacion es de 0 a 100");
        for(int i=1; i<=6; i++){
            System.out.print(i+"° calificacion: ");
            cal=sc.nextInt();
            suma=suma+cal;
        }
        prom=suma/6;
        System.out.print("El promedio es: "+prom);

        
    }
}
