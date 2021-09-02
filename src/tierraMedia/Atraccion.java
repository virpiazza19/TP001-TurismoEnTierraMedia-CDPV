package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public class Atraccion extends Producto{
	String nombre;
	int costo;
	double duracion;
	int cupo;
	TipoAtraccion atraccion;
	
	public String getNombre() {
		return nombre;
	}

	public int getCosto() {
		return costo;
	}

	public double getDuracion() {
		return duracion;
	}

	public int getCupo() {
		return cupo;
	}

	public TipoAtraccion getAtraccion() {
		return atraccion;
	}

	public Atraccion(String nombre, int costo, double duracion, int cupo, TipoAtraccion atraccion) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.duracion = duracion;
		this.cupo = cupo;
		this.atraccion = atraccion;
	}
	
	private int restarCapacidad() {
		
		return this.cupo--;
	}
	
	// DUDA: modificador de acceso
	public boolean hayCupo() {
		return this.getCupo() > 0;
	}

	
	// Exception es atrapada en la clase padre.
	protected void disminuirCupo() throws NoHayCupoException {
		if (!hayCupo()) {
			throw new NoHayCupoException("Se agotó el CUPO en la atracción.");
		}
		this.cupo--;
	}
	
}
