
package com.mycompany.programa_12;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, num;
        System.out.print("Cantidad de números a verfificar: ");
        c = sc.nextInt();
        
        for(int i=1;i<=c;i++){
            System.out.print("Digite un numero: ");
            num=sc.nextInt();
            if(num%2==0){
                System.out.println(num+" es par");
            }else{
                System.out.println(num+" es impar");
            }
        }
        
    }
}
