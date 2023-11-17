/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_13;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] temp = new float[5][7];
        float[][] far = new float[5][7];
        
        //entradad de valaores
        for(int i=0; i<5; i++){
            for(int j=0; j<7; j++){
                System.out.print("("+i+")("+j+") Grados centigrtados: ");
                temp[i][j]=sc.nextFloat();
            }
        }
        
        //Conversion
        for(int k=0; k<5; k++){
            for(int j=0; j<7; j++){
                far[k][j]=(float)((temp[k][j]*1.8)+32);
            }
        }
        
        //Imprimir resultados
        for(int l=0; l<5; l++){
            for(int j=0; j<7; j++){
                if(j==6){
                    System.out.println("("+l+")("+j+") "+temp[l][j]+" C° equivale a: "+far[l][j]+" F°");
                    System.out.println("");
                }else{
                    System.out.println("("+l+")("+j+") "+temp[l][j]+" C° equivale a: "+far[l][j]+" F°");
                }
            }
        }
        }
    }

