package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public class Atraccion extends Producto{
	String nombre;
	int costo;
	double duracion;
	int capacidad;
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

	public int getCapacidad() {
		return capacidad;
	}

	public TipoAtraccion getAtraccion() {
		return atraccion;
	}

	public Atraccion(String nombre, int costo, double duracion, int capacidad, TipoAtraccion atraccion) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.duracion = duracion;
		this.capacidad = capacidad;
		this.atraccion = atraccion;
	}
	
	private int restarCapacidad() {
		
		return this.capacidad--;
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
