/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_7;
import java.util.Scanner;
/**
 *
 * @author alexr
 */
public class Proyecto_7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp;
        System.out.print("Temperatura actual: ");
        temp=sc.nextInt();
        
        if(temp>=27){
            System.out.println("Hace calor");
        }else if(temp>=20&&temp<27){
            System.out.println("Clima agradable");
        }else{
            System.out.println("Hace frio");
        }
        
    }
}
