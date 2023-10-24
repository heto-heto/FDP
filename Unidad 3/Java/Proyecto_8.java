/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_8;
import java.util.Scanner;

/**
 *
 * @author alexr
 */
public class Proyecto_8 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingrese el primer numero: ");
        n1=sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2=sc.nextInt();
        
        if(n1==n2){
            System.out.print("Los dos números son iguales");
        }else if(n1>n2){
            System.out.print(n1+" es mayor que "+n2);
        }else{
            System.out.print(n2+" es mayor que "+n1);
        }
        
    }
}
