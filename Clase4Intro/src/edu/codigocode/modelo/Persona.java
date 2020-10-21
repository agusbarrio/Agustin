package edu.codigocode.modelo;

public class Persona {

	//atributos
	public double limiteDiario=10;
	public String nombre;
	public int edad;
	public int cantAbdominales;
	public int intenso = 5000;
	public int intermedio = 4500;
	public int liviano = 3500;
	//acciones --> prorcedimiento
	//metodos que no retornan valor (void)
	
	//puede tener parametros de entrada
	public void caminar(double cantPasos) {
		
		System.out.println("Nombre: " + nombre + ", edad: " + edad);
		// condicionales --> si (caso a evaluar) {verdadero} else {falso}
		if(cantPasos <= limiteDiario) {
			
			if(cantPasos ==limiteDiario){
				System.out.println("Alcanzo la meta diaria!!! c:");
			} else {
				System.out.println("aun no alcanzo su meta diaria");
				System.out.println("Te estan faltando " + (limiteDiario-cantPasos)+"km");
			}
		} else {
			if (edad >30) {
				System.out.println("Tene cuidado ya estas grande para este ejercicio");
			}
			System.out.println("Completaste tu ejercicio diario");
			System.out.println("Supero la meta con una distancia de " + (cantPasos-limiteDiario) +"km");
		}
		
	}
	
	public void deportesHabilitados(TipoDeporte tipo) {
		
		switch(tipo) {
		
		case CAMINAR:
			System.out.println("hola " + nombre + ", hoy debes caminar " + limiteDiario + "km");
			break;
			
		case CICLISMO:
			System.out.println("hola " + nombre + ", hoy debes pedalear " + (1.5*limiteDiario) + "km");
			break;
			
		case CORRER:
			System.out.println("hola " + nombre + ", hoy debes correr " + (1.2*limiteDiario) + "km");
			break;
			
		case ABDOMINALES:
			System.out.println("Hacer " + cantAbdominales + " cantidad de abdominales");
			break;
			default:
				System.out.println("No conozco el deporte");
			break;
		}
	}
	//Funcion es un metodo, que termina RETORNANDO un valor
	//el valor, puede ser un objeto
	public boolean caloriasAQuemarDiarias(double cantCalorias) {
	
		double rta=0;
		boolean valorRetorno;
		
		//se trabajara con la variable rta
		if(cantCalorias > intenso) {
			System.out.println("Ha elegido la rutina intensa");
			rta = cantCalorias - intenso;
			System.out.println("valor fijado para rutina intensa es de " + intenso + " calorias");
			if(rta >= intenso) {
				valorRetorno=true;
			}else {
				valorRetorno=false;
			}
				
		}else if( cantCalorias < intermedio && cantCalorias > liviano ) {
			System.out.println("Eligio la rutina intermedia, vamos media pila");
			rta = intermedio - cantCalorias;
			//TODO: reemplazar este numero harcode por una variable
			if(rta >= 4000) {
				valorRetorno=true;
				
			}else {
				valorRetorno=false;
			}
			
		}else {
			System.out.println("dale gordo ponete las pilas");
			rta = liviano;
			valorRetorno=false;
			
		}
		
		return valorRetorno;
	}
}
