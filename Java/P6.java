package com.mycompany.p6;
import java.util.Scanner;//Librería para entrada de datos

public class P6 {

    public static void main(String[] args) {
        System.out.print("");
        Scanner sc = new Scanner(System.in);//sc el objeto para dar la entradad de dato
        double c, f;
        System.out.println("* * *  Centigrados a Farenheit  * * *");
        System.out.print("Ingrese los grados centrigrados: ");
        c=sc.nextInt();
        f=(c * 1.8) + 32;
        System.out.println(c+" C° equivalen a "+f+" F°");
    }
}
