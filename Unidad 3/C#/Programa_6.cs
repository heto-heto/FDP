using System;
namespace Programa_6;
class Entero
{
    static void Main(string[] args)
    {
        int num;
        Console.Write("Ingrese un número entero: ");
        num = Convert.ToInt32(Console.ReadLine());

        if (num % 2 == 0)
        {
            Console.Write("El numero es par.");
        }
        else
        {
            Console.Write("El número es impar.");
        }
    }
}
