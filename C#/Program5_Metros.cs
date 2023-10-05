using System;
namespace Program5_Metros;

class Metros
{
    static void Main(string[] args)
    {
        int m = 0; double p = 0;
        Console.WriteLine("* * *  Metros a pies  * * *");
        Console.Write("longitud en metros: ");
        m = Int32.Parse(Console.ReadLine());
        p = m * 3.28084;
        Console.WriteLine(m + " metros equivale a " + p + " pies");
    }
}
