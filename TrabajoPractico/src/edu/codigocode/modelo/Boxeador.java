package edu.codigocode.modelo;

public class Boxeador {

	private String nombre;
	private String apellido;
	private int edad;
	private double altura;
	private double peso;
	
	public Boxeador(String nombre, String apellido, int edad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
}
