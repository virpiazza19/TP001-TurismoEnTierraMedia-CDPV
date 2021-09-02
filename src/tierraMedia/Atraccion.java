package tierraMedia;

<<<<<<< HEAD
public class Atraccion extends Producto{
	String nombre;
	int costo;
	double duracion;
	int cupo;
	TipoAtraccion atraccion;
	
=======
public class Atraccion extends TierraMedia {
	private String nombre;
	private int costo;
	private double duracion;
	private int cupo;
	private TipoAtraccion atraccion;

	public Atraccion(String nombre, int costo, double duracion, int cupo, TipoAtraccion atraccion) {
		// super();
		this.nombre = nombre;
		this.costo = costo;
		this.duracion = duracion;
		this.cupo = cupo;
		this.atraccion = atraccion;
	}

>>>>>>> refs/heads/master
	public String getNombre() {
		return nombre;
	}
	public int getCosto() {
		return costo;
	}
	public double getDuracion() {
		return duracion;
	}
<<<<<<< HEAD
=======

>>>>>>> refs/heads/master
	public int getCupo() {
		return cupo;
	}
	public TipoAtraccion getAtraccion() {
		return atraccion;
	}

<<<<<<< HEAD
	public Atraccion(String nombre, int costo, double duracion, int cupo, TipoAtraccion atraccion) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.duracion = duracion;
		this.cupo = cupo;
		this.atraccion = atraccion;
=======
	
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
>>>>>>> refs/heads/master
	}
	
<<<<<<< HEAD
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
	
=======
>>>>>>> refs/heads/master
}
