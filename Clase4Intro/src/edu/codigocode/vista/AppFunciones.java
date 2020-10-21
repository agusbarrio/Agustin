package edu.codigocode.vista;

import edu.codigocode.modelo.Persona;

public class AppFunciones {
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		
		if(p.caloriasAQuemarDiarias(20000)) {
			System.out.println("c:  Felicidades cumpliste tu objetivo diario   c:");
		
		}else {
			System.out.println("BUUUUUU MUERTO");
		}
		
	}

}
