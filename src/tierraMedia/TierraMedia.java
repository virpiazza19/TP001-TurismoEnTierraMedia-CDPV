package tierraMedia;

import java.util.LinkedList;
import java.util.List;

public class TierraMedia {
	private List <Atraccion> atracciones = new LinkedList <Atraccion>();
	
	TipoAtraccion atraccion;

	public int compareTo(Atraccion A1, Atraccion A2) {
		return A1.getAtraccion().compareTo(A2.getAtraccion());	
	}
	
	public void agregarAtraccion(Atraccion A) {
		atracciones.add(A);
	}
	
}