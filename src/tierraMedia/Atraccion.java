package tierraMedia;

public class Atraccion extends Producto {

	TipoAtraccion preferencia;
	private String nombre;
	int costo;
	double duracion;
	private int cupo;

	
	public Atraccion(TipoAtraccion preferencia, String nombre, int costo, double duracion, int cupo) {
		super();
		this.preferencia = preferencia;
		this.nombre = nombre;
		this.costo = costo;
		this.duracion = duracion;
		this.cupo = cupo;

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

	public TipoAtraccion getPreferencia() {
		return preferencia;
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

	protected void agregarAtraccion(Atraccion AA) { //Agrega cada objeto de atraccion (cada atraccion) a la lista gral de productos
		ofertas.add(AA);
	}

}
