using System;
namespace Programa_10;

class a
{
    static void Main(string[] args)
    {
        int hrs, hrs_2 = 40, sueldo, ph, extra;
        Console.Write("Pago por hora: ");
        ph = Convert.ToInt32(Console.ReadLine());
        Console.Write("Cuantas horas trabajo a la semana: ");
        hrs = Convert.ToInt32(Console.ReadLine());

        if (hrs > 40)
        {
            extra = hrs - 40;
            extra = extra * ph * 2;
            sueldo = (hrs_2 * ph) + extra;
            Console.Write("Su pago es de:  " + sueldo);
        }
        else
        {
            sueldo = hrs * ph;
            Console.Write("Su pago es de:  " + sueldo);
        }
    }
}