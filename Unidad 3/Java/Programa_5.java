

package com.mycompany.programa_5;
import java.util.Scanner;

public class Programa_5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String d="";
        double a1, a2, a3, suma, total;
        
        System.out.print("Precio del primer articulo: ");
        a1=sc.nextDouble();
        System.out.print("Precio del segundo articulo: ");
        a2=sc.nextDouble();
        System.out.print("Precio del tercer articulo: ");
        a3=sc.nextDouble();
        suma=a1+a2+a3;
        
        if(suma>=1500){
            total=suma-(suma*0.30);
            d="con un 30% de descuento";
        }else if(suma<1500&&suma>=1000){
            total=suma-(suma*0.20);
            d="con un 20% de descuento";
        }else if(suma<1000&&suma>=700){
            total=suma-(suma*0.10);
            d="con un 10% de descuento";
        }else{
            total=suma;
            d="sin ningun descuento";
        }
        
        System.out.println("El precio de los 3 articulos es de: "+suma);
        System.out.println("El total a pagar, "+d+", es de: "+total);
    }
}
