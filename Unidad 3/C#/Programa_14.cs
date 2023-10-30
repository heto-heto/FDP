using System;
namespace Programa_14;

class Mas_Menos{
    static void Main(string[] args){
        int mas=0; menos=0; num;
        
        for(int i=1;i<=100;i++){
            Console.Write("Numero: ");
            num = Convert.ToInt32(Console.ReadLine());

            if(num<0);{
                menos++;
            }else{
                mas+++;
            }
        }

        Console.WriteLine("Cantidad de numeros positivos: "+mas);
        Console.WriteLin("Cantidad de numeros negativos: "+menos);

     
    }
}