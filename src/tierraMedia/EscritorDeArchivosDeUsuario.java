package tierraMedia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EscritorDeArchivosDeUsuario {

	public void crearArchivoDeSalida() throws IOException {
		List<Producto> itinerario = new ArrayList<Producto>();
		List<Usuario> usuarios = new LinkedList<Usuario>();

		BufferedWriter bw = new BufferedWriter(new FileWriter("archivosDeSalida/nombre.out")); 
		//NO SE COMO HACER PARA QUE EL ARCHIVO TENGA EL NOMBRE DEL USUARIO

		for (Usuario U : usuarios) {
			bw.write("Nombre del usuario: " + U.getNombre() + ", Presupuesto total: " + U.getPresupuesto()
					+ ", Tiempo disponible: " + U.getTiempoDisponible());
			bw.newLine();
			bw.write("Itinerario: ");
			bw.newLine();

			double duracionTotal = 0;
			int costoTotal = 0;
			for (Producto P : itinerario) { // NO ESCRIBO EL FOR DEL USUARIO, PORQUE CREO QUE USUARIO LLAMA AL MÉTODO
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
