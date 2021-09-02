package tierraMedia;

public abstract class Promocion extends TierraMedia {
	private String nombrePromocion;
	private TipoAtraccion tipoAtraccion;
	protected Atraccion[] atraccionesEnPromocion;
	protected int costoPromocion;
	protected double duracionPromocion;
	
	protected Promocion(String nombrePromocion, TipoAtraccion tipoAtraccion) {
		this.nombrePromocion = nombrePromocion;
		this.tipoAtraccion = tipoAtraccion;
	}

	protected abstract int costoPromocion();
	
	protected abstract double duracionPromocion();
	
	public int getCostoPromocion() {
		return costoPromocion;
	}

	public double getDuracionPromocion() {
		return duracionPromocion;
	}
	
	public Atraccion[] getAtraccionesEnPromocion() {
		return this.atraccionesEnPromocion;
	}
}
