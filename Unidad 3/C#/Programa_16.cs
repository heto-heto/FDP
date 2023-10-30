using System;
namespace Programa_16;

class Salario{
    static void Main(string[] args){
        int hrs, i=1, m, sueldo;
        
        Console.Write("Pago por hora: ");
        hrs=Convert.ToInt32(Console.ReadLine());

        while(i<=20){
            Console.WriteLine("Trabajador "+i+"°");
            Console.Write("Horas trabajadas: ");
            m=Convert.ToInt32(Console.ReadLine());
            sueldo=m*hrs;
            Console.WriteLine("Su sueldo es de: "+sueldo);
            Console.WriteLine("");
            i++;
        }

    }
}