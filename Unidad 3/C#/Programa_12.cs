using System;
namespace Programa_12;

class Par_impar{
    static void Main(string[] args){
        int c, num;

        Console.Write("Cantidad de numeros a evaluar: ");
        c = Convert.ToInt32(Console.ReadLine());
        
         for(int i=1;<=c;i++){
            Console.Write("Digite un numero: ");
            num = Convert.ToInt32(Console.ReadLine());
            if(num%2==0){
                Console.WriteLine(num+" es par");
            }else{
                Console.Write(num+" es impar");
            }
         }
    }
}