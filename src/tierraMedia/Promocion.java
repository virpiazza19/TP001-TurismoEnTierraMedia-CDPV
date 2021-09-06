package tierraMedia;

public abstract class Promocion extends Producto {
	TipoAtraccion tipoPreferido; 
	TipoPromocion tipoPromo;
	int costoPromocion; 
	double duracionPromocion; 

	protected Atraccion[] atraccionesEnPromocion;
	
	public Promocion(TipoAtraccion tipoPreferido, TipoPromocion tipoPromo, int costoPromocion,
			double duracionPromocion) {
		super();
		this.tipoPreferido = tipoPreferido;
		this.tipoPromo = tipoPromo;
		this.costoPromocion = costoPromocion;
		this.duracionPromocion = duracionPromocion;
	}

	public TipoAtraccion getTipoPreferido() {
		return tipoPreferido;
	}

	public TipoPromocion getTipoPromo() {
		return tipoPromo;
	}
	public int getCostoPromocion() {
		return costoPromocion;
	}
	public double getDuracionPromocion() {
		return duracionPromocion;
	}
	public Promocion(String nombre) {
		super.nombre = nombre;
	}

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
	@Override
	protected boolean esPromo() {
		return true;
	}

}
