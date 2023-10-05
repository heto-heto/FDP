using System;
namespace Programa5_Grados;

class Grados
{
    static void Main(string[] args)
    {
        Console.WriteLine("* * *  Grados centrigraods a grados farenheit");
        Console.WriteLine("");
        int c = 0;
        double f = 0;
        Console.Write("Ingrese los grados centigrados: ");
        c = Int32.Parse(Console.ReadLine());
        f = (c * 4.5) + 32;
        Console.WriteLine(c + "C° equivalen a "+f+"F°");
    }
}