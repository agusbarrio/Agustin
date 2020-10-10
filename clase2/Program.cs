using System;

namespace clase2
{
    class Program
    {
        static void Main(string[] args) // nuestro punto de inicio
        {
            Console.WriteLine("Inicio del programa");
            Console.WriteLine("Hello World!");
            saludarEspEng();
            Console.WriteLine("Fin del programa");

        }
        
        static void saludarEspEng()
        {
            saludarEsp("Hola soy argentino");
            saludarEng();
        }

        static void saludarEsp(string mensaje)
        {
            Console.WriteLine(mensaje.ToUpper());   
        }

        static void saludarEng()
        {
            Console.WriteLine("welcome to the summer house");
        }
    }
}
