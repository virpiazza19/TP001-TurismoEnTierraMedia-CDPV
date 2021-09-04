package tierraMedia;

public abstract class Promocion extends Producto {
	// private TipoAtraccion tipoPreferido; Usado en el lector, no es atributo
	// protected TipoPromocion tipoPromo; Usado en el lector, no es atributo
	// protected int costoPromocion; Este atributo ya esta en la clase padre
	// protected double duracionPromocion; Este atributo ya esta en la clase padre

	protected Atraccion[] atraccionesEnPromocion;

	public Promocion(String nombre) {
		super.nombre = nombre;
	}

	// Es void porque no devuelve nada, solo define el valor del atributo duracion
	protected void duracionPromocion() {
		double duracion = 0;
		for (Atraccion A : atraccionesEnPromocion) {
			duracion += A.duracion;
		}
		super.duracion = duracion;
	}

	protected abstract void costoPromocion();

	protected Atraccion[] getAtraccionesEnPromocion() {
		return this.atraccionesEnPromocion;
	}

}
