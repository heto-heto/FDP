/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_9;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto_9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hrs, costo, a=10, b=12, c=15;
        System.out.print("Horas que estuvo en el estacionamiento: ");
        hrs=sc.nextInt();
        
        if(hrs<=2){
            costo=hrs*5;
            System.out.print("El costo es de: "+costo);
        }else if(hrs>2&&hrs<=5){
            costo=(hrs*4)+a;
            System.out.print("El costo es de: "+costo);
        }else if(hrs>5&&hrs<10){
            costo=(hrs*3)+a+b;
            System.out.print("El costo es de: "+costo);
        }else{
            costo=(hrs*2)+a+b+c;
            System.out.print("El costo es de: "+costo);
        }
        
        
    }
}
