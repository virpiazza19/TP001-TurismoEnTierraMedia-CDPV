package tierraMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfertadorDeProductos {

	public void sugerirProductos(List<Usuario> usuarios, List<Producto> productos) {
		for (Usuario usuario : usuarios) {
			productos.sort(new ComparadorPorTipoAtraccion(usuario.getAtraccionPreferida()));
			// if() si el producto tiene cupo, y no esta en itinerario 
			for (Producto O : productos) {
				if (usuario.getAtraccionPreferida() == O.tipoAtraccion && usuario.getPresupuesto() >= O.costo
						&& usuario.getTiempoDisponible() >= O.duracion) {
					System.out.println(O);
				} else {
					while (usuario.getPresupuesto() >= O.costo && usuario.getTiempoDisponible() >= O.duracion) {
						System.out.println(O);
					}
				}
			}
		}

	}

	public void aceptarOferta(List<Usuario> usuarios, List<Producto> productos) { 
		List<Producto> itinerario = new ArrayList<Producto>();

		//SCANNER
		String opcion = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese SI o No: ");
		opcion = sc.next();
		System.out.println();
		while (!opcion.equals("SI") && !opcion.equals("NO")) {
			System.out.println("Ingrese SI o No: ");
			opcion = sc.next();
			System.out.println();
		}
		for (Usuario U: usuarios) {
		for (Producto O:productos) { // para cada oferta de la lista de ofertas
				if(O.esPromo()) { // si la oferta es una promo
					O.atracciones  // tiene que chequear que ninguna de las atracciones que estan adentro este adentro de la lista de Itinerario
				} else if(!O.esPromo()) { //si no es promo 
					// tiene que chequear que la atraccion se haya aceptado dentro de una promo
				}
			U.sugerirProductos(productos); //Una vez que cumple con lo anterior, sugiere la oferta correcta
			if(sc.equals("SI")) {
			itinerario.add(O); 
			}
		}
		System.out.println(itinerario);
	}
	}

}
