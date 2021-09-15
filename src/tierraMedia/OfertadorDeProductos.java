package tierraMedia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OfertadorDeProductos {

	public void sugerirProductos(List<Usuario> usuarios, List<Producto> productos) {
		for (Usuario usuario : usuarios) {
			productos.sort(new ComparadorPorTipoAtraccion(usuario.getAtraccionPreferida()));
			System.out.println("----------------------------------------");
			System.out.println(usuario.getNombre() + "     " + usuario.getAtraccionPreferida());
			for (Producto producto : productos) {
				ArrayList<Producto> itinerario = (ArrayList<Producto>) usuario.getItinerario();
				boolean contiene = false;
				Iterator<Producto> iterador = itinerario.iterator();
				
				while (!contiene && iterador.hasNext()) {
					contiene = iterador.next().contiene(producto);
					
				}
				
				// verificar recursos del usuario
				if (!this.tieneRecursos(usuario)) {
					break;
				}
				
				
				
				System.out.println(producto);
				if (this.decisionUsuario().toUpperCase().equals("SI")) {
					System.out.println("añade producto");
					usuario.agregarProductosAlItinerario(producto);
				}
				else {
					break;
				}
			}
			System.out.println(usuario.getItinerario());
			break;
		}

	}

	
	private String decisionUsuario() {
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		System.out.println("\n¿Desea añadir la sugerencia a su ITINERARIO?");
		System.out.print("Ingrese SI o No: ");
		opcion = sc.next();
		System.out.println();
		while (!opcion.toUpperCase().equals("SI") && !opcion.toUpperCase().equals("NO")) {
			System.out.println("Ingrese SI o No: ");
			opcion = sc.next();
			System.out.println();
		}
		return opcion;
	}
	
	
	/***
	 * Devuelve true si tiene presupuesto y tiempo disponible
	 */
	private boolean tieneRecursos(Usuario u) {
		if (u.getPresupuesto() <= 0 || u.getTiempoDisponible() <= 0) {
			return false;
		}
		return true;
	}

}
