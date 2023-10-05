using System;
namespace Programa5_Triangulo;

class Triangulo
{
    static void Main(string[] args)
    {
        Console.WriteLine("* * *  Área y Perimetro de un Triángulo  * * *");
        Console.WriteLine("");
        int p = 0, a = 0, b = 0, h = 0;
        Console.Write("Ingrese el valor de la base: ");
        b = Int32.Parse(Console.ReadLine());
        Console.Write("Ingrese el valor la altura: ");
        h = Int32.Parse(Console.ReadLine());
        p = b * 3;
        a = (b * h) / 2;
        Console.WriteLine("Área = " + a);
        Console.WriteLine("Perimetro = " + p);
    }
}