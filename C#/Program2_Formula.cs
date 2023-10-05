using System;
namespace Programa4_Formula;

class Formula
{
    static void Main(string[] args)
    {
        int a = 0, x = 0, y = 0;
        Console.WriteLine("* * *  Formula x=a+y+3  * * *");
        Console.Write("Ingrese valor de a: ");
        a= Int32.Parse(Console.ReadLine());
        Console.Write("Ingrese valor de y: ");
        y= Int32.Parse(Console.ReadLine());
        x = a + y + 3;
        Console.WriteLine("x = a+y+3");
        Console.WriteLine("x = " + a + "+" + y + "+3");
        Console.WriteLine("x = " + x);
    }
}