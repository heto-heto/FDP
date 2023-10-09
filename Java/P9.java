package com.mycompany.p9;
import java.util.Scanner;

public class P9{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1, p2, p3, iva, total, sub;
        System.out.println("* * *  IVA subtotal  * * *");
	System.out.print("Precio del primer producto");
	p1=sc.nextInt();
	System.out.print("Precio del segundo producto");
	p2=sc.nextInt();
	System.out.print("Precio del tercer producto");
	p3=sc.nextInt();

	total=p1+p2+p3;
	iva=total*0.16;
	sub=total-iva;
	
	System.out.println("Total: "+total);
        System.out.println("IVA: "+iva);
        System.out.println("IVA subtotal: "+sub);
    }

}