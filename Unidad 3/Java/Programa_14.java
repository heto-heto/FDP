
package com.mycompany.programa_14;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_14 {

    public static void main(String[] args) {
        int mas=0, menos=0, num;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=100;i++){
            System.out.print("Número: ");
            num=sc.nextInt();
            if(num<0){
                menos++;
            }else
                mas++;
        }
        System.out.println("Cantidad de numeros positivos: "+mas);
        System.out.println("Cantidad de numeros negativos: "+menos);
    }
}
