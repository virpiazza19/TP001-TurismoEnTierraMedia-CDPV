package tierraMedia;

public abstract class Promocion extends TierraMedia {
	
	private TipoPromocion tipoPromocion;
	private String nombre;
	private TipoAtraccion tipoAtraccion;
	private Atraccion[] atracciones;
	
	
	
	// ACA VA UN ARRAY PERO NO SE COMO LLAMARLO, PORQUE EN REALIDAD LAS PROMOCIONES SE TIENE QUE GUARDAR EN EL ARRAY DE LA SUPERCLASE

	protected abstract int calcularPromocion();
	

}
