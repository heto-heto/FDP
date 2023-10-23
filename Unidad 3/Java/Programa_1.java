

package com.mycompany.programa_1;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_1 {

    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad=sc.nextInt();
        
        if(edad<18){
             System.out.println("Usted es menor de edad");
        }else{
             System.out.println("Usted es mayor de edad");
        }
}}
