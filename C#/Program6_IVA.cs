using System;
using System.Xml.Schema;

namespace Programna6_IVA;

class IVA
{
    static void Main(string[] args)
    {
        int p1, p2, p3;
        double total = 0, sub = 0, iva = 0;
        Console.WriteLine("* * *  Iva subtotal  * * *");
        Console.Write("Precio del producto 1: ");
        p1=Int32.Parse(Console.ReadLine());
        Console.Write("Precio del producto 2: ");
        p2 = Int32.Parse(Console.ReadLine());
        Console.Write("Precio del producto 3: ");
        p3 = Int32.Parse(Console.ReadLine());
        total = p1 + p2 + p3;
        iva = total * 0.16;
        sub = total - iva;
        Console.WriteLine("El subtotal del iva es: " + sub);
    }
}