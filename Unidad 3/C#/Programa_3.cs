using System;
using System.Data;

namespace Programa_3;

class Programa_3
{
    static void Main(string[] args)
    {
        int op;
        Console.Write("Ingrese en número el diá de de la semana: ");
        op = Convert.ToInt32(Console.ReadLine());

        switch (op)
        {
            case 1:
                Console.Write("Lunes");
                break;
            case 2:
                Console.Write("Martes");
                break;
            case 3:
                Console.Write("Miercoles");
                break;
            case 4:
                Console.Write("Jueves");
                break;
            case 5:
                Console.Write("Viernes");
                break;
            case 6:
                Console.Write("Sabado");
                break;
            case 7:
                Console.Write("Domingo");
                break;
            default:
                Console.Write("No entra en el rango de 1 a 7");
                break;
        }
    }
}
