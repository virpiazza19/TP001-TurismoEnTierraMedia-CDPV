package tierraMedia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParqueTierra {

	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Producto> productos = new ArrayList<Producto>();

	public static void main(String[] args) throws NoHayCupoException {

		ParqueTierra parque = new ParqueTierra();
		OfertadorDeProductos ofertador = new OfertadorDeProductos();

		parque.usuarios = parque.generarUsuarios("archivosDeEntrada/usuarios.csv");
		parque.productos = parque.generarProductos("archivosDeEntrada/atracciones.csv",
				"archivosDeEntrada/promociones.csv");

		// PRUEBAS
		
		//parque.usuarios = parque.generarUsuarios("archivosDeEntrada/pruebaUsuarios.csv");
		//parque.productos = parque.generarProductos("archivosDeEntrada/pruebaAtracciones.csv",
		//		    	"archivosDeEntrada/pruebaPromociones.csv");
		
		ofertador.sugerirProductos(parque.usuarios, parque.productos);

	}

	private List<Usuario> generarUsuarios(String archivo) {
		LectorUsuario lu = new LectorUsuario();
		return lu.leerUsuarios(archivo);
	}

	private List<Producto> generarProductos(String atracciones, String promociones) {
		LectorAtracciones la = new LectorAtracciones();
		LectorPromociones lp = new LectorPromociones();
		List<Producto> productos = new ArrayList<Producto>();
		List<Atraccion> a = la.leerAtracciones(atracciones);
		List<Promocion> p = lp.leerPromociones(a, promociones);

		for (Promocion promocion : p) {
			productos.add(promocion);
		}

		for (Atraccion atraccion : a) {
			productos.add(atraccion);
		}

		return productos;
	}
}
