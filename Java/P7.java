
package com.mycompany.p7;
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//sc el objeto para dar la entrada de dato
        double m, p;
        System.out.println("* * *  Metros a pies  * * *");
        System.out.print("Ingrese la longitud en metros: ");
        m=sc.nextInt();
        p=m*3.28084;
        System.out.print("Longitud en pies: "+p);
    }
}
