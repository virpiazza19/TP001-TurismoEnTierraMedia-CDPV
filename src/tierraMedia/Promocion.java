package tierraMedia;

public abstract class Promocion extends Producto {

	private TipoAtraccion tipoPreferido;
	protected Atraccion[] atraccionesEnPromocion;
	protected int costoPromocion;
	protected double duracionPromocion;
	protected TipoPromocion tipoPromo;

	public Promocion(TipoPromocion tipoPromo, TipoAtraccion tipoPreferido, int costo, double duracion) {
		this.tipoPromo = tipoPromo;
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

	protected double duracionPromocion() {
		double duracion = 0;
		for (Atraccion A : atraccionesEnPromocion) {
			duracion += A.duracion;
		}
		return duracion;
	}

	protected int getCostoPromocion() {
		return costoPromocion;
	}

	protected double getDuracionPromocion() {
		return duracionPromocion;
	}

	public Atraccion[] getAtraccionesEnPromocion() {
		return this.atraccionesEnPromocion;
	}
}
