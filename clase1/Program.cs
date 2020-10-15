using System;

namespace Clase_1
{
    //Mi primera aplicacion de consola en C#
    class Program
    { //Inicio de la clase
        static void Main(string[] args)
        {
            //creacion de variables
            //tipo de variable   nombre de variable, =valor de la variable ej
            string nombre = "agustin"; //string --> cadena de texto --> doble comilla 
            string apellido = "barrio";
            int edad = 20 ; //variable entera -> int edad=6575674

            Console.WriteLine("Hola soy " + nombre + " y mi apellido es " + apellido + ". Mi edad es de " + edad);
            Console.WriteLine(nombre);
            Console.WriteLine(apellido);
            Console.WriteLine(edad);

            nombre= "Pepito";
            apellido = "Armani";
            Console.WriteLine("Hola soy " + nombre + " y mi apellido es " + apellido + ". Mi edad es de " + edad);
            Console.WriteLine(nombre);
            Console.WriteLine(apellido);
            Console.WriteLine(edad);
            //El + en programacion sirve para concatenar dos strings
            //Si son numeros sirve para sumar

        }
    /*
    Comentario de varias lineas
    */

    }//Fin de la clase
}
