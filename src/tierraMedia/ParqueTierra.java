package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public class ParqueTierra { // Clase general que guarda las dos listas

	private List<Usuario> usuarios;
	private List<Producto> ofertas = new ArrayList<Producto>(); // La puse como ArrayList para poder ordenarla

	public static void main(String[] args) {
		ParqueTierra parqueTierra = new ParqueTierra();
		LectorUsuario lector = new LectorUsuario();
		parqueTierra.usuarios = lector.leerUsuarios("archivos/usuarios.csv");
	}
}
