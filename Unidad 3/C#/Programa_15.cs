using System;
namespace Programa_15;

class Sumatoria{
    static void Main(string[] args){
        int i=1; suma=0;

        while(i<=20){
            suma=suma+i;
            i++;
        }
        Console.Write("La sumatoria del 1 al 20 es de: "+suma);
    }
}