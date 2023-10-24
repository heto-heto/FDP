using System;
namespace Programa_9;

class e
{
    static void Main(string[] args)
    {
        int hrs, costo, a = 10, b = 12, c = 15;
        Console.Write("Horas que estuvo en el estacionamiento: ");
        hrs = Convert.ToInt32(Console.ReadLine());

        if (hrs <= 2)
        {
            costo = hrs * 5;
            Console.Write("El costo es de: " + costo);
        }
        else if (hrs > 2 && hrs <= 5)
        {
            costo = (hrs * 4) + a;
            Console.Write("El costo es de: " + costo);
        }
        else if (hrs > 5 && hrs < 10)
        {
            costo = (hrs * 3) + a + b;
            Console.Write("El costo es de: " + costo);
        }
        else
        {
            costo = (hrs * 2) + a + b + c;
            Console.Write("El costo es de: " + costo);
        }


    }
}

