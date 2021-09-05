package tierraMedia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Lector {
	private FileReader fr = null;
	private BufferedReader br = null;

	public void leerUsuarios(String archivo) {
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();
			while (linea != null) {
				System.out.println(crearUsuario(linea));
				linea = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}


	private Usuario crearUsuario(String linea) {
		String[] lin = linea.split(",");
		Usuario usuario;
		usuario = new Usuario(lin[0], Integer.parseInt(lin[1]), Double.parseDouble(lin[2]),
				TipoAtraccion.valueOf(lin[3].toUpperCase()));
		//REVISAR SI ES CORRECTO EL ORDEN EN EL QUE ESTAN LOS DATOS (Nombre, presupuesto, tiempo, tipoPreferido)
		return usuario;
	}
	
	
}