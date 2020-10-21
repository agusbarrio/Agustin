package edu.agustin.modelo;

public class Persona {
	
	//Crear atributos globales publicos
	
	public String nombre;
	public String apellido;
	public int edad;
	
	//comportamiento
	
	public void hablar(String idioma) {
		System.out.println(idioma);
	}
	
	public void muestroDatos() {
		System.out.println("su nombre es " + nombre +" " + apellido + " y su edad es " + edad );
	}

}
