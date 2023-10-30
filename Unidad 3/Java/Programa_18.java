/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_18;

/**
 *
 * @author gaelr
 */
public class Programa_18 {

    public static void main(String[] args) {
        double sal=9000, suma=0;
        System.out.println("Salario del 1° año: "+sal);
        suma=suma+sal;
        for(int i=2;i<=6;i++){
            sal=sal+(sal*0.1);
            suma=suma+sal;
            System.out.println("Salario del "+i+"° año: "+sal);
        }
        System.out.println("Salario ganado al cabo de 6 años: "+suma);
    }
}