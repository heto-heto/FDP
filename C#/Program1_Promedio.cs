using System;
namespace Programa_3;
class Promedio
{
    static void Main(string[] args)
    {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, n, suma=0, c;
        double promedio = 0;
        Console.WriteLine("El rango de calificación es de 0 al 100");
        /* Console.Write("Ingrese la 1° calificación: ");
         c1 = Int32.Parse(Console.ReadLine()); //También se puede usar Convert.ToInt32(Console.ReadLine());
         Console.Write("Ingrese la 2° calificación: ");
         c2 = Int32.Parse(Console.ReadLine());
         Console.Write("Ingrese la 3° calificación: ");
         c3 = Int32.Parse(Console.ReadLine());
         Console.Write("Ingrese la 4° calificación: ");
         c4 = Int32.Parse(Console.ReadLine());
         Console.Write("Ingrese la 5° calificación: ");
         c5 = Int32.Parse(Console.ReadLine());
         Console.Write("Ingrese la 6° calificación: ");
         c6 = Int32.Parse(Console.ReadLine());

         promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;

         Console.WriteLine("El promeido es: " + promedio);
         */
        Console.Write("¿Cuántas calificaciones son? ");
        n = Int32.Parse(Console.ReadLine());
        for (int i = 1; i <= n; i++)
        {
            Console.Write("Escriba la " + i + "° calificación: ");
            c = Int32.Parse(Console.ReadLine());
            suma = suma + c;

        }
        promedio = suma / n;
        Console.WriteLine("El promedio de las " + n + " calificaciones es de : " + promedio);
    }
}