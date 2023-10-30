using System;
namespace Programa_19;
class Si{
    static void Main(string[] args){
        double num;
        int c, cero=0, mas=0, menos=0;

        Console.Write("Cantidad de numeros a evaluar: ");
        c=Convert.ToInt32(Console.ReadLine());
        
        for(int i=1;i<=c;i++){
            Console.Write("Ingrese un numero: ");
            num=Convert.ToDouble(Console.ReadLine());
            if(num==0){
                cero++;
            }else if(num>0){
                mas++;
            }else{
                menos++;
            }
        }
        Console.WriteLine("Cantidad de numeros menores a 0: "+menos);
        Console.WriteLine("Cantidad de numeros igaules a 0: "+cero);
        Console.WriteLine("Cantidad de numeros mayores a 0: "+mas);

    }
}