package tierraMedia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Producto {
	List <Producto> ofertas = new ArrayList<Producto>();
	
	String tipoDeAtraccion;
	int costo;
	double duracion;

	public Producto(String tipoDeAtraccion, int costo, double duracion) {
		this.tipoDeAtraccion = tipoDeAtraccion;
		this.costo = costo;
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + " [tipoDeAtraccion=" + tipoDeAtraccion + ", costo=" + costo + ", duracion=" + duracion + "]";
	}

	protected boolean esPromo() {
		return false;
	}
	
	
}