/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_19;
import java.util.Scanner;
/**
 *
 * @author gaelr
 */
public class Programa_19 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double num; 
       int c, cero=0, mas=0, menos=0;
       
       System.err.print("Cantidad de numeros a evaluar: ");
       c=sc.nextInt();
       
       for(int i=1;i<=c;i++){
           System.err.print("Ingrese un numero: ");
           num=sc.nextDouble();
           if(num==0){
               cero++;
           }else if(num>0){
               mas++;
           }else{
               menos++;
           }
       }
       System.out.println("Cantidad de numeros menores a 0: "+menos);
       System.out.println("Cantidad de numeros igaules a 0: "+cero);
       System.out.println("Cantidad de numeros mayores a 0: "+mas);
       
       
       
    }
}
