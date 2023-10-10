using System;
namespace Programa_Suma;

class Suma
{
    static void Main(string[] args)
    {
        int a = 0, b = 0,suma=0;
        Console.WriteLine("* * *  Suma de dos números  * * *");
        Console.Write("Valor de a: ");
        a=Int32.Parse(Console.ReadLine());
        Console.Write("Valor de b: ");
        b=Int32.Parse(Console.ReadLine());
        suma = a + b;
        Console.WriteLine("La suam es: "+suma);
    
    }
}
