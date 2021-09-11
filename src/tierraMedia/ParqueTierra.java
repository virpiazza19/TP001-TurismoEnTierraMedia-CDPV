package tierraMedia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParqueTierra {

	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Producto> productos = new ArrayList<Producto>();

	public static void main(String[] args) {

		ParqueTierra parque = new ParqueTierra();
		List<Atraccion> atracciones;
		List<Promocion> promociones;
		LectorUsuario lu = new LectorUsuario();
		LectorAtracciones la = new LectorAtracciones();
		LectorPromociones lp = new LectorPromociones();

		parque.usuarios = lu.leerUsuarios("archivosDeEntrada/usuarios.csv");
		
		atracciones = la.leerAtracciones("archivosDeEntrada/atracciones.csv");
		
		promociones = lp.leerPromociones(atracciones, "archivosDeEntrada/promociones.csv");
		for (Promocion promocion : promociones) {
			parque.productos.add(promocion);
		}


	}

	public void aceptarOferta() { //NO SE SI LA FIRMA VA ASÍ, ME TIRA ERROR cuando lo intento hacer dentro del main
		List<Producto> itinerario = new ArrayList<Producto>();
		List<Usuario> usuarios;
		List<Producto> ofertas;

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
