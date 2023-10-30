/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_16;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs, i=1, m, sueldo;
        System.out.print("Pago por hora: ");
        hrs=sc.nextInt();
        while(i<=20){
            System.out.println("Trabajador "+i+"°");
            System.out.print("Horas trabajadas: ");
            m=sc.nextInt();
            sueldo=m*hrs;
            System.out.println("Su sueldo es de: "+sueldo);
            System.out.println("");
            i++;
        }
        
    }
}
