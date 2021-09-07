package tierraMedia;

public class Atraccion extends Producto {

	private int cupo;
	
	public Atraccion(String nombre, int costo, double duracion, int cupo,TipoAtraccion tipo) {
		super.nombre = nombre;
		super.costo = costo;
		super.duracion = duracion;
		super.tipoAtraccion = tipo;
		this.cupo = cupo;
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
		return "Atraccion [preferencia=" + super.getTipoAtraccion() + ", nombre=" + super.getNombre() + ", costo=" + super.getCosto() + ", duracion="
				+ super.getDuracion() + ", cupo=" + this.getCupo() + "]";
	}
}
