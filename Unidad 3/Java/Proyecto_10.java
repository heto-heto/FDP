/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_10;
import java.util.Scanner;
/**
 *
 * @author alexr
 */
public class Proyecto_10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hrs,hrs_2=40, sueldo, ph, extra;
        System.out.print("Pago por hora: ");
        ph=sc.nextInt();
        System.out.print("Cuantas horas trabajo a la semana: ");
        hrs=sc.nextInt();
              
        if(hrs>40){
            extra=hrs-40;
            extra=extra*ph*2;
            sueldo=(hrs_2*ph)+extra;
            System.out.println("Su pago es de:  "+sueldo);
        }else{
            sueldo=hrs*ph;
            System.out.println("Su pago es de:  "+sueldo);
        }
    }
}
