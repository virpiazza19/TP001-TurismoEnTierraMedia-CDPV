package tierraMedia;

public class Atraccion extends Producto {

	TipoAtraccion preferencia;
	private String nombre;
	int costo;
	double duracion;
	private int cupo;
	
	

	public Atraccion(TipoAtraccion preferencia, String nombre, int costo, double duracion, int cupo) {
		this.preferencia = preferencia;
		this.nombre = nombre;
		this.costo = costo;
		this.duracion = duracion;
		this.cupo = cupo;
	}

	public TipoAtraccion getPreferencia() {
		return preferencia;
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
	private boolean hayCupo() {
		return this.getCupo() > 0;
	}

	// Exception es atrapada cuando leemos el archivo
	protected void disminuirCupo() throws NoHayCupoException {
		if (!hayCupo()) {
			throw new NoHayCupoException("Se agoto el CUPO en la atraccion.");
		}
		this.cupo--;
	}

	@Override
	public String toString() {
		return "Atraccion [preferencia=" + preferencia + ", nombre=" + nombre + ", costo=" + costo + ", duracion="
				+ duracion + ", cupo=" + cupo + "]";
	}
}
