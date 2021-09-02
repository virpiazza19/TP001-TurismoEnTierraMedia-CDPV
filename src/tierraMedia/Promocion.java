package tierraMedia;

public abstract class Promocion extends TierraMedia {
	
	private TipoPromocion tipoPromocion;
	private String nombrePromocion;
	private TipoAtraccion tipoAtraccion;
	private int cantidadAtraccionesEnPromocion;
	private Atraccion[] atraccionesEnPromocion;
	protected int costoPromocion;
	protected double duracionPromocion;
	
	protected Promocion(TipoPromocion tipoPromocion, String nombrePromocion, TipoAtraccion tipoAtraccion,
			int cantidadAtraccionesEnPromocion) {
		this.tipoPromocion = tipoPromocion.;
		this.nombrePromocion = nombrePromocion;
		this.tipoAtraccion = tipoAtraccion;
		this.atraccionesEnPromocion = new Atraccion[cantidadAtraccionesEnPromocion];
	}





	// ACA VA UN ARRAY PERO NO SE COMO LLAMARLO, PORQUE EN REALIDAD LAS PROMOCIONES SE TIENE QUE GUARDAR EN EL ARRAY DE LA SUPERCLASE

	protected abstract int costoPromocion();
	
	protected abstract double duracionPromocion();
	

}
