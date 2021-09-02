package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public class Producto { //Era TierraMedia
	List <Producto> ofertas = new ArrayList<Producto>();
	
	protected TipoAtraccion atraccionPreferida;
	protected int costo;
	protected double duracion;

	public Producto(TipoAtraccion atraccionPreferida, int costo, double duracion) {
		this.atraccionPreferida = atraccionPreferida;
		this.costo = costo;
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + " [atraccionPreferida=" + atraccionPreferida + ", costo=" + costo + ", duracion=" + duracion + "]";
	}

	protected boolean esPromo() {
		return false;
	}
	
}