using System;
namespace Programa_20;

class Salario_Maestro{
    static void Main(string[] args){
        int i=1, dia=3, y=0;
        while(i<=365){
            y=y+dia;
            dia=dia*3;
            i++;
        }
        Console.WriteLine("Dinero ahorrado durante 365 dias: "+y);
    }
}