using System;
namespace Progrma_1;

class Edad
{
    static void Main(string[] args)
    {
        int edad;
        Console.Write("¿Cuál es su edad? ");
        edad=Convert.ToInt32(Console.ReadLine());

        if (edad < 18)
        {
            Console.WriteLine("Es menor de edad");
        }
        else
        {
            Console.WriteLine("Es mayor de edad");
        }
    }
}