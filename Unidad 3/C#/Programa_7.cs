using System;
namespace Programa_7;
class Temperatura
{
    static void Main(string[] args)
    {
        int temp;
        Console.Write("Temperatura actual: ");
        temp = Convert.ToInt32(Console.ReadLine());

        if (temp >= 27)
        {
            Console.Write("Hace calor");
        }
        else if (temp >= 20 && temp < 27)
        {
            Console.Write("Clima agradable");
        }
        else
        {
            Console.Write("Hace frio");
        }
    }
}