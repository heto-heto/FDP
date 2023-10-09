package com.mycompany.p8;
import java.util.Scanner;//Librería para entrada de datos

public class P8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//sc el objeto para dar la entradad de dato
        int n1, n2, s, r, m, d;
        System.out.println("* * *  Operaciones basicas  * * *");
        System.out.print("Valor del primer numero: ");
        n1=sc.nextInt();
        System.out.print("Valor del segundo numero: ");
        n2=sc.nextInt();
        
        s=n1+n2;
        r=n1-n2;
        m=n1*n2;
        d=n1/n2;
        
        System.out.println(n1+" + "+n2+" = "+s);
        System.out.println(n1+" - "+n2+" = "+r);
        System.out.println(n1+" x "+n2+" = "+m);
        System.out.println(n1+" / "+n2+" = "+d);
        
    }
}
