package com.mycompany.p10;
import java.util.Scanner;//Librería para entrada de datos

public class P10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//sc el objeto para dar la entradad de dato
	
	int p, A, ap;
	System.out.prinln("* * *  Area de un hecagono  * * *");
	System.out.print("Ingrese el valor de la apotema: ");
	ap=sc.nextInt();
	System.out.print("Ingrese el valor del perimetro: ");
	p=sc.nextInt();

	A=(p*ap)/2;

	System.out.println("Area: "+a);
	
    }
}