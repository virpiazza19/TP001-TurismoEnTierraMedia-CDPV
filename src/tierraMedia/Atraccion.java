package tierraMedia;

public class Atraccion extends TierraMedia{
	private String nombre;
	private int costo;
	private double duracion;
	private int capacidad;
	private TipoAtraccion atraccion;
	
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
}
