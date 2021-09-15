package tierraMedia;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OfertadorDeProductos {

	public void sugerirProductos(List<Usuario> usuarios, List<Producto> productos) throws NoHayCupoException {
		for (Usuario usuario : usuarios) {
			productos.sort(new ComparadorPorTipoAtraccion(usuario.getAtraccionPreferida()));

			System.out.println(
					"\n--------------------------------------------------------------------------------------------------\n");
			System.out.println("\t\t\t\t NUEVO USUARIO");

			for (Producto producto : productos) {

				// Recupera itinerario para verificar si el producto a ofrecer ya se encuentra
				// guardado
				List<Producto> itinerario = usuario.getProductosEnItinerario();
				boolean contiene = false;
				Iterator<Producto> iterador = itinerario.iterator();
				while (!contiene && iterador.hasNext()) {
					contiene = iterador.next().contiene(producto);
				}

				// Verifica cupo de atraccion
				boolean hayCupo = producto.hayCupo();

				// Verifica los recursos del usuario
				boolean puedeComprar = puedeComprar(usuario, producto);

				if (!contiene && hayCupo && puedeComprar) {
					System.out.println(
							"\n--------------------------------------------------------------------------------------------------\n");
					System.out.println("Usuario: " + usuario.getNombre() + "  Presupuesto: " + usuario.getPresupuesto()
							+ "  Tiempo Disponible: " + usuario.getTiempoDisponible() + "  Tipo de Atracci�n Favorito: "
							+ usuario.getAtraccionPreferida());
					System.out.println(
							"\n--------------------------------------------------------------------------------------------------\n");
					System.out.println(producto);
					if (this.decisionUsuario().toUpperCase().equals("SI")) {
						usuario.agregarProductosAlItinerario(producto);
						producto.disminuirCupo();
					}
				}
			}
			System.out.println(
					"\n--------------------------------------------------------------------------------------------------\n");
		    System.out.println("\t\t\t\t RESUMEN DE ITINERARIO\n");
			System.out.println(usuario.itinerario);
			System.out.println("\t\t\t\t COSTO TOTAL: " + usuario.itinerario.costoTotal() + " monedas.");
			System.out.println("\t\t\t\t DURACION TOTAL: " + usuario.itinerario.duracionTotal() + " horas.");
		}

		System.out.println("\n\n\n\t\t\t\t FIN PROGRAMA");
	}

	
	/***
	 * Devuelve la opcion elegida por el usuario
	 */
	private String decisionUsuario() {
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		System.out.println("\n\n�Desea a�adir la sugerencia a su ITINERARIO?");
		System.out.print("\nIngrese SI o No: ");
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
	private boolean puedeComprar(Usuario u, Producto p) {
		if (u.getPresupuesto() < p.getCosto() || u.getTiempoDisponible() < p.getDuracion()) {
			return false;
		}
		return true;
	}

}
