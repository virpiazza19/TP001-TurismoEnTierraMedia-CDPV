package tierraMedia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorDePromociones {
	private FileReader fr = null;
	private BufferedReader br = null;

	public void leerPromociones(String archivo) {
		try {
			fr = new FileReader("promociones.csv");
			br = new BufferedReader(fr);

			String linea = br.readLine();
			while (linea != null) {
				System.out.println(crearPromocion(linea));
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

	private Promocion crearPromocion(String linea) {
		String[] lin = linea.split(",");
		Promocion promocion;
		
		if (lin[1].toUpperCase() == "AXB") {
		if (lin.length == 5) {
			promocion = new PromocionAxB(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2], lin[3], lin[4];	
	  	}
		if (lin.length == 4) {
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
			
		}
		return promocion;
	}
}
