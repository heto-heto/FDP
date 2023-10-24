using System;
namespace Programa_8;

class Mayor_Menor
{
    static void Main(string[] args)
    {
        int n1, n2;
        Console.Write("Ingrese el primer numero: ");
        n1 = Convert.ToInt32(Console.ReadLine());
        Console.Write("Ingrese el segundo numero: ");
        n2 = Convert.ToInt32(Console.ReadLine());

        if (n1 == n2)
        {
            Console.Write("Los dos números son iguales");
        }
        else if (n1 > n2)
        {
            Console.Write(n1 + " es mayor que " + n2);
        }
        else
        {
            Console.Write(n2 + " es mayor que " + n1);
        }

    }
}
