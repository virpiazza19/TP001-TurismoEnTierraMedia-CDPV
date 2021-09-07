package tierraMedia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorPromociones {
	private FileReader fr = null;
	private BufferedReader br = null;

	public List<Promocion> leerPromociones(List<Atraccion> atracciones, String archivo) {
		List<Promocion> promociones = new ArrayList<Promocion>();
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine();
			while (linea != null) {
				promociones.add(crearPromocion(linea, atracciones));
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
		return null;

	}

	private Promocion crearPromocion(String linea, List<Atraccion> atracciones) {
		String[] lin = linea.split(",");
		if (lin[0].toUpperCase() == "AXB") {
			if (lin.length == 6) {
				Atraccion a1 = buscarAtracacion(atracciones, lin[3]);
				Atraccion a2 = buscarAtracacion(atracciones, lin[4]);
				Atraccion a3 = buscarAtracacion(atracciones, lin[5]);
				
				return new PromocionAxB(TipoAtraccion.valueOf(lin[1].toUpperCase()), lin[2], a1, a2, a3);	
	  	    }
		/*if (lin.length == 4) {
			promocion = new PromocionAxB(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2],lin[3]);	
		}
		
		else if (lin[0].toUpperCase() == "ABSOLUTA") {
			if (lin.length == 5) {
				promocion = new PromocionAbsoluta(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2], lin[3], 
					Integer.parseInt(lin[4]));	
		  	}
			if (lin.length == 6) {
				promocion = new PromocionAbsoluta(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2], lin[3], lin[4], 
					Integer.parseInt(lin[5]));	
			}
			
		else if (lin[0].toUpperCase() == "PORCENTUAL") {
			if (lin.length == 5) {
				promocion = new PromocionPorcentual(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2], lin[3], 
					Double.parseDouble(lin[4]));	
		  	}
			if (lin.length == 6) {
				promocion = new PromocionPorcentual(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2], lin[3], lin[4], 
					Double.parseDouble(lin[5]));	
			}
		}
			
		}*/
		}
		return null;
	}
	
	private Atraccion buscarAtracacion(List<Atraccion> lista, String nombre) {
		
		for (Atraccion atraccion : lista) {
			if (atraccion.getNombre().equals(nombre)) {
				return atraccion;
			}
		}
		return null;
	}
}
