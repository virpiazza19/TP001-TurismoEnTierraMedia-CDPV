package tierraMedia;

public abstract class Promocion extends Producto {

	private TipoAtraccion atraccionPreferida;
	protected Atraccion[] atraccionesEnPromocion;
	protected int costoPromocion;
	protected double duracionPromocion;
	protected TipoPromocion tipoPromo;

	public Promocion(TipoPromocion tipoPromo, TipoAtraccion atraccionPreferida, int costo, double duracion) {
		super(atraccionPreferida, costo, duracion);
		this.tipoPromo = tipoPromo;
	}

	protected int costoPromocion() {
		int costo = 0;
		for (Atraccion A : atraccionesEnPromocion) {
			if (A.atraccionPreferida == atraccionPreferida) {
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

	protected void agregarPromo(Promocion promo) { //Agrega cada objeto de promocion (cada promo) a la lista gral de productos
		ofertas.add(promo);
	}

}
