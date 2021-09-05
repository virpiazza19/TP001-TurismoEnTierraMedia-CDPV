package tierraMedia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ParqueTierra { // Clase general que guarda las dos listas

	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Producto> ofertas = new ArrayList<Producto>(); // La puse como ArrayList para poder ordenarla

	public static void main(String[] args) {
		ParqueTierra parqueTierra = new ParqueTierra();
		LectorDeUsuarios lector = new LectorDeUsuarios();
		parqueTierra.usuarios = lector.leerUsuarios("archivos/usuarios.csv");
		// Falta la invocación de los lectores y más
	}
}
