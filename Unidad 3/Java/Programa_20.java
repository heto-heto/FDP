/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_20;

/**
 *
 * @author gaelr
 */
public class Programa_20 {

    public static void main(String[] args) {
        int i=1, dia=3, y=0;
        while(i<=365){
            y=y+dia;
            dia=dia*3;
            i++;
        }
        System.out.print("Dinero ahorrado durante un año: "+y);
    }
}
