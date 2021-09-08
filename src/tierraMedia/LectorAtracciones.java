package tierraMedia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorAtracciones {
	private FileReader fr = null;
	private BufferedReader br = null;
	
	public List<Atraccion> leerAtracciones(String archivo) {
		List<Atraccion> atracciones= new ArrayList<Atraccion>();
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = 
					br.readLine();
			while (linea != null) {
				atracciones.add(crearAtraccion(linea));
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
		return atracciones;	
	}
	
	private Atraccion crearAtraccion(String linea) {
		String[] lin = linea.split(",");
		Atraccion atraccion;
		atraccion = new Atraccion(lin[0], Integer.parseInt(lin[1]), Double.parseDouble(lin[2]),
				Integer.parseInt(lin[3]), TipoAtraccion.valueOf(lin[4].toUpperCase()));
		return atraccion;
	}
}
