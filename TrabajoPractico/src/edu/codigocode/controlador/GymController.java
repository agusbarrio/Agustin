package edu.codigocode.controlador;

import java.util.ArrayList;
import java.util.List;

import edu.codigocode.modelo.Boxeador;
import edu.codigocode.modelo.Categoria;
import edu.codigocode.modelo.LimitesCategoria;
public class GymController {
	
	public void IngresarBoxeador(Boxeador Boxeador) {
		
		System.out.println(Boxeador.getNombre() + " " + Boxeador.getApellido());
		System.out.println("Edad: " + Boxeador.getEdad() + " años" + " Altura: " + Boxeador.getAltura() + " m" + " Peso: " + Boxeador.getPeso() + " kg" );
			
		}
/*	
	//(Nombre, LimiteInferior, LimiteSuperior)
	Categoria mosca = new Categoria("Mosca", 48.988, 50.802);
	Categoria gallo = new Categoria("Gallo", 52.163, 53.525);
	Categoria pluma = new Categoria("Pluma", 55.338, 57.152);
	Categoria ligero = new Categoria("Ligero", 58.967, 61.237);
	Categoria welter = new Categoria("Welter",  63.503, 66.678);
	Categoria mediano = new Categoria("Mediano", 69.853, 72.562);
	Categoria mediopesado = new Categoria("Mediopesado", 76.205, 79.378);
	Categoria pesado = new Categoria("Pesado", 91, 0);
	*/
	List<Categoria> Categorias = new ArrayList<Categoria>();
	
	public List<Categoria> getCategorias() {
		return Categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		Categorias = categorias;
	}
	
 
	public void AsignarCategoria(Boxeador Boxeador) {
		
		}
		
		
		
		/*	if (Boxeador.getPeso()<19) {
			
		}
		
		*/
	
}
