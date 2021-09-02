package tierraMedia;

public class Atraccion extends Producto {
	private String nombre;
	int costo;
	double duracion;
	private int cupo;
	private TipoAtraccion atraccion;
	
	public Atraccion(TipoAtraccion atraccionPreferida, int costo, double duracion, String nombre, int costo2,
			double duracion2, int cupo, TipoAtraccion atraccion) {
		super(atraccionPreferida, costo, duracion);
		this.nombre = nombre;
		costo = costo2;
		duracion = duracion2;
		this.cupo = cupo;
		this.atraccion = atraccion;
	}

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
