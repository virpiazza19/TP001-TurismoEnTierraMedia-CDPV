package tierraMedia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EscritorDeArchivosDeUsuario {

	// pasar lista usuarios
	public void crearArchivoDeSalida(List<Usuario> usuario) throws IOException {
		
		//List<Usuario> usuarios = new LinkedList<Usuario>();
		
		//HABRIA QUE CONSULTARLE AL PROFE ALGUNA FORMA DE NO TENER QUE DECLARAR LAS LISTAS EN TODAS LAS CLASES

		BufferedWriter bw = new BufferedWriter(new FileWriter("archivosDeSalida/nombre.out")); 
		//NO SE COMO HACER PARA QUE EL ARCHIVO TENGA EL NOMBRE DEL USUARIO

		for (Usuario U : usuario) {
			bw.write("Nombre del usuario: " + U.getNombre() + ", Presupuesto total: " + U.getPresupuesto()
					+ ", Tiempo disponible: " + U.getTiempoDisponible());
			bw.newLine();
			bw.write("Itinerario: ");
			bw.newLine();

			double duracionTotal = 0;
			int costoTotal = 0;
			for (Producto P : U.getItinerario()) { 
				if (P.esPromo()) {
					bw.write(P.nombre + ", atracciones incluidas: " + P.atracciones);
					bw.newLine();
				}
				if (!P.esPromo()) {
					bw.write(P.nombre);
					bw.newLine();
				}
				duracionTotal += P.duracion;
				costoTotal += P.costo;
			}
			bw.write("El costo total del itinerario es de " + costoTotal + " monedas, y su duración total es de "
					+ duracionTotal + " horas.");

			bw.close();
		}
	}
}
