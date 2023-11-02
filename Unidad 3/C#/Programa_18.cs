using System;
namespace Programa_18;
class Sal{
    static void Main(string[] args){
        double sal=19800, suma=0;
        Console.WriteLine("Salario del 1° year: "+sal);
        suma=suma+sal;
        for(int i=2;i<=6;i++){
            sal=sal+(sal*0.1);
            suma=suma+sal;
            Console.WriteLine("Salario del "+i+"° year: "+sal);
        }
        Console.WriteLine("Salario ganado al cabo de 6 years: "+suma);
    }

 }
