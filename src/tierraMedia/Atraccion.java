package tierraMedia;

public class Atraccion extends TierraMedia{
	private int id;
	private String nombre;
	private int costo;
	private double duracion;
	private int capacidad;
	private TipoAtraccion atraccion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public TipoAtraccion getAtraccion() {
		return atraccion;
	}

	public void setAtraccion(TipoAtraccion atraccion) {
		this.atraccion = atraccion;
	}

	public Atraccion(int id, String nombre, int costo, double duracion, int capacidad, TipoAtraccion atraccion) {
		super();
		this.id = id;
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
