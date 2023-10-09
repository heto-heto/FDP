
package com.mycompany.p2;
import java.util.Scanner;//Librería para entrada de datos

public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//sc el objeto para dar la entradad de dato
        int suma, n1, n2;
        System.out.println("* * *  Suma de dos numeros  * * *");
        System.out.print("Valor del primer numero: ");
        n1= sc.nextInt(); //sc. Es entrada de dato y nextInt(). para la conversión
        System.out.print("Valor del segundo numero: ");
        n2= sc.nextInt();
        suma=n1+n2;
        System.out.print("La suma es: "+suma);
    }
}
