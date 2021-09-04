package tierraMedia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
	private FileReader fr = null;
	private BufferedReader br = null;
	
	public void leerAtracciones(String archivo) {
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = 
					br.readLine();
			while (linea != null) {
				System.out.println(crearAtraccion(linea));
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
	
	private Atraccion crearAtraccion(String linea) {
		String[] lin = linea.split(",");
		Atraccion atraccion;
		atraccion = new Atraccion(lin[0], Integer.parseInt(lin[1]), Double.parseDouble(lin[2]),
				Integer.parseInt(lin[3]), TipoAtraccion.valueOf(lin[4].toUpperCase()));
		//MODIFICAR EL CONSTRUCTOR DE ATRACION Y UBICAR PRIMERO EL TIPO PARA COMPARABLE(ahora esta ultimo)
		return atraccion;
	}
}
