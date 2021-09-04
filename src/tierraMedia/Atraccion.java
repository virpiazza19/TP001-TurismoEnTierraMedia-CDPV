package tierraMedia;

public class Atraccion extends Producto {

	//private String nombre;  Este atributo ya esta en la clase padre
	//int costo;              Este atributo ya esta en la clase padre
	//double duracion;        Este atributo ya esta en la clase padre
	
	TipoAtraccion tipoDeLaAtraccion;
	private int cupo;

	public Atraccion(TipoAtraccion tipo, String nombre, int costo, double duracion, int cupo) {
		super.nombre = nombre;
		super.costo = costo;
		super.duracion = duracion;
		this.tipoDeLaAtraccion = tipo;
		this.cupo = cupo;
	}

	public int getCupo() {
		return cupo;
	}

	public TipoAtraccion getTipoDeLaAtraccion() {
		return tipoDeLaAtraccion;
	}

	private boolean hayCupo() {
		return this.getCupo() > 0;
	}

	// Exception es atrapada cuando leemos el archivo
	protected void disminuirCupo() throws NoHayCupoException {
		if (!hayCupo()) {
			throw new NoHayCupoException("Se agotó el CUPO en la atracción.");
		}
		this.cupo--;
	}
}
