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
		parque.usuarios = lu.leerUsuarios("archivosDeEntrada/usuarios.csv");
		LectorAtracciones la = new LectorAtracciones();
		atracciones = la.leerAtracciones("archivosDeEntrada/atracciones.csv");
		LectorPromociones lp = new LectorPromociones();
		promociones = lp.leerPromociones(atracciones, "archivosDeEntrada/promociones.csv");
		
	}
}
