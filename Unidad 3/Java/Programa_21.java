/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_21;
import java.util.Scanner;
/**
 *
 * @author gaelr
 */
public class Programa_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cubo;
        do{
            System.out.print("Ingrese un numero natural: ");
            num=sc.nextInt();
            if(num<1){
                System.out.println("No es un numero natural. Intente de nuevo");
            }
        }while(num<1);
        cubo=num*num*num;
        System.out.println("El cubo de "+num+" es: "+cubo);
    }
}
