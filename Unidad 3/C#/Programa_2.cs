using System;
namespace Programa_2;

class Promedio
{
    static void Main(string[] args)
    {
        int prom, cal, suma = 0;
        Console.WriteLine("El metodo de calificacion es de 0 a 100");
        for (int i = 1; i <= 6; i++)
        {
            Console.Write(i + "° calificacion: ");
            cal = Int32.Parse(Console.ReadLine());
            suma = suma + cal;
        }
        prom = suma / 6;
        Console.Write("El promedio es: " + prom);
    }
}