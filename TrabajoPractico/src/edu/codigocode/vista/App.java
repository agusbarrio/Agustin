package edu.codigocode.vista;

import edu.codigocode.controlador.GymController;
import edu.codigocode.modelo.Boxeador;
import edu.codigocode.modelo.Categoria;

public class App {

	public static void main(String[] args) {
		
		GymController gc = new GymController();	
		Boxeador b1 = new Boxeador("Agustin", "Barrio", 20, 1.72, 60.6);
		gc.IngresarBoxeador(b1);
		
	}
}
