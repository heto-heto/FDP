/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_17;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        do{
            System.out.println("Bienvenidos a un hola ejecucion");
            System.out.println("Escriba n para salir");
            op=sc.next().charAt(0);
        }while(op != 'n');
        
}
}
