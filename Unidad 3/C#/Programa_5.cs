using System;
namespace Programa_5;

class Pagp
{
    static void Main(string[] args)
    {
 
        String d = "";
        double a1, a2, a3, suma, total;

        Console.Write("Precio del primer articulo: ");
        a1 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Precio del segundo articulo: ");
        a2 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Precio del tercer articulo: ");
        a3 = Convert.ToDouble(Console.ReadLine());
        suma = a1 + a2 + a3;

        if (suma >= 1500)
        {
            total = suma - (suma * 0.30);
            d = "con un 30% de descuento";
        }
        else if (suma < 1500 && suma >= 1000)
        {
            total = suma - (suma * 0.20);
            d = "con un 20% de descuento";
        }
        else if (suma < 1000 && suma >= 700)
        {
            total = suma - (suma * 0.10);
            d = "con un 10% de descuento";
        }
        else
        {
            total = suma;
            d = "sin ningun descuento";
        }

        Console.WriteLine("El precio de los 3 articulos es de: " + suma);
        Console.WriteLine("El total a pagar, " + d + ", es de: " + total);
    }
}