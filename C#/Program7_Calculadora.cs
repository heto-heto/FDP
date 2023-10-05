using System;
namespace Programa7_Calculadora;

class Calculadora
{
    static void Main(string[] args)
    {
        double n1, n2, suma, resta, multi, divi;
        Console.WriteLine("* * *  Calculadora básica  * * *");
        Console.Write("valor del primer número: ");
        n1=Int32.Parse(Console.ReadLine());
        Console.Write("Valor del segundo número: ");
        n2 = Int32.Parse(Console.ReadLine());

        suma = n1 + n2;
        resta = n1 - n2;
        multi = n1 * n2;
        divi = n1 / n2;

        Console.WriteLine(n1 + " + " + n2 + " = " + suma);
        Console.WriteLine(n1 + " - " + n2 + " = " + resta);
        Console.WriteLine(n1 + " x " + n2 + " = " + multi);
        Console.WriteLine(n1 + " / " + n2 + " = " + divi);

    }
}
