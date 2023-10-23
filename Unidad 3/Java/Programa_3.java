package com.mycompany.programa_3;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op;
        System.out.print("Ingrese en número el diá de de la semana: ");
        op=sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No entra en el rango de 1 a 7");
                
        }
    }
}
