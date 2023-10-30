using System;
namespace Programa_21;

class Cubo{
    static void Main(string[] args){
        int num, cubo;
        do{
            Console.Write("Ingrese un numero natural: ");
            num=Convert.ToInt32(Console.ReadLine());
            if(num<1){
                Console.WriteLine("No es un numero natural. Intente de nuevo");
            }
        }while(num<1);
        cubo=num*num*num;
        Console.WriteLine("El cubo de "+num+" es: "+cubo);
    }
}