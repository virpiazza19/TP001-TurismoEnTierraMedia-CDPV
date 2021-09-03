package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto { //Era TierraMedia
	List <Producto> ofertas = new ArrayList<Producto>();
	
	protected TipoAtraccion preferida;
	protected int costo;
	protected double duracion;

	public Producto(TipoAtraccion preferida, int costo, double duracion) {
		this.preferida = preferida;
		this.costo = costo;
		this.duracion = duracion;
	}
	public Producto() {
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + " [atraccionPreferida=" + preferida + ", costo=" + costo + ", duracion=" + duracion + "]";
	}

	protected boolean esPromo() {
		return false;
	}
}