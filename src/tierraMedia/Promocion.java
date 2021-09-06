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

	protected double duracionPromocion() {
		double duracion = 0;
		for (Atraccion A : atraccionesEnPromocion) {
			duracion += A.duracion;
		}
		return duracion;
	}

	protected int costoPromocion() {
		int costo = 0;
		for (Atraccion A : atraccionesEnPromocion) {
			if (A.preferencia == tipoPreferido) {
				costo += A.costo;
			}
		}
		return costo;
	}

	protected Atraccion[] getAtraccionesEnPromocion() {
		return this.atraccionesEnPromocion;
	}
	@Override
	protected boolean esPromo() {
		return true;
	}

}
