package tierraMedia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EscritorDeArchivosDeUsuario {

	public void crearArchivoDeSalida(List<Usuario> usuarios, String archivoSalida) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida));
		// la ruta la ingresamos al invocar al metodo
		// -> EscritorDeArchivosDeUsuario.crearArchivoDeSalida(usuarios,"archivosDeSalida/" + u.getNombre() + ".csv");


		for (Usuario U : usuarios) {
			bw.write("Nombre del usuario: " + U.getNombre() + " \nPresupuesto total: " + U.getPresupuesto()
					+ " monedas de oro \nTiempo disponible: " + U.getTiempoDisponible() + " horas\n");
			bw.write("Itinerario: ");
			bw.newLine();

			double duracionTotal = 0;
			int costoTotal = 0;
			for (Producto P : U.getItinerario()) {
				if (P.esPromo()) {
					bw.write(P.nombre + ". Atracciones incluidas: " + P.atracciones);
					bw.newLine();
				}
				if (!P.esPromo()) {
					bw.write(P.nombre);
					bw.newLine();
				}
				duracionTotal += P.duracion;
				costoTotal += P.costo;
			}
			bw.write("Costo total: " + duracionTotal + " monedas de oro\n");
			bw.write("Tiempo necesario para realizar el itinerario completo: " + costoTotal + " horas\n");
		}
		bw.close();
	}
}
