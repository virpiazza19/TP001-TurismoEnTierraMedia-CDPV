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
		return promociones;

	}

	private Promocion crearPromocion(String linea, List<Atraccion> atracciones) {
		String[] lin = linea.split(",");
		if (lin[0].toUpperCase().equals("AXB")) {
			return crearAxB(atracciones, lin);
		}
		if (lin[0].toUpperCase().equals("ABSOLUTA")) {
			return crearAbsoluta(atracciones, lin);
		}
		if (lin[0].toUpperCase().equals("PORCENTUAL")) {
			return crearPorcentual(atracciones, lin);
		}
		return null;
	}

	private Promocion crearPorcentual(List<Atraccion> a, String[] lin) {
		Atraccion a1 = buscarAtraccion(a, lin[3]);
		Atraccion a2 = buscarAtraccion(a, lin[4]);
		if (lin.length == 6) {
			return new PromocionPorcentual(TipoAtraccion.valueOf(lin[1].toUpperCase()), lin[2], a1, a2,
					Integer.parseInt(lin[5]));
		}
		if (lin.length == 7) {
			Atraccion a3 = buscarAtraccion(a, lin[5]);
			return new PromocionPorcentual(TipoAtraccion.valueOf(lin[1].toUpperCase()), lin[2], a1, a2, a3,
					Integer.parseInt(lin[5]));
		}
		return null;
	}

	private Promocion crearAbsoluta(List<Atraccion> a, String[] lin) {
		Atraccion a1 = buscarAtraccion(a, lin[3]);
		Atraccion a2 = buscarAtraccion(a, lin[4]);
		if (lin.length == 6) {
			return new PromocionAbsoluta(TipoAtraccion.valueOf(lin[1].toUpperCase()), lin[2], a1, a2,
					Integer.parseInt(lin[5]));
		}
		if (lin.length == 7) {
			Atraccion a3 = buscarAtraccion(a, lin[5]);
			return new PromocionAbsoluta(TipoAtraccion.valueOf(lin[1].toUpperCase()), lin[2], a1, a2, a3,
					Integer.parseInt(lin[5]));
		}
		return null;
	}

	private Promocion crearAxB(List<Atraccion> a, String[] lin) {
		Atraccion a1 = buscarAtraccion(a, lin[3]);
		Atraccion a2 = buscarAtraccion(a, lin[4]);
		if (lin.length == 6) {
			Atraccion a3 = buscarAtraccion(a, lin[5]);
			return new PromocionAxB(TipoAtraccion.valueOf(lin[1].toUpperCase()), lin[2], a1, a2, a3);
		}
		if (lin.length == 7) {
			return new PromocionAxB(TipoAtraccion.valueOf(lin[0].toUpperCase()), lin[2], a1, a2);
		}
		return null;
	}

	private Atraccion buscarAtraccion(List<Atraccion> lista, String nombre) {
		Atraccion a = null;
		for (Atraccion atraccion : lista) {
			if (atraccion.getNombre().equals(nombre)) {
				return atraccion;
			}
		}
		return a;
	}
}
