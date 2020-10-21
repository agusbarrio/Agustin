package edu.agustin.vista;

import edu.agustin.modelo.Persona;

public class App {

	public static void main(String[] args) {
		System.out.println("Hola mundo 3");
		
		String nombre ="valor";
		
		//Me creo el objeto per1 que tiene el comportamiento de la persona
		Persona per1 = new Persona();
		
		//Asigno los valores al objeto per1
		per1.nombre="agustin";
		per1.apellido="barrio";
		per1.edad=20;
		
		//Creo el objeto per2
		Persona per2 = new Persona();
		
		//Asigno los valores al objeto per2
		per2.nombre="laura";
		per2.apellido="barrio";
		per2.edad=21;
		
		per1.muestroDatos();
		per1.hablar("hello how are you?");
		per2.muestroDatos();
		per2.hablar("ola como vai");
	}
	
}
