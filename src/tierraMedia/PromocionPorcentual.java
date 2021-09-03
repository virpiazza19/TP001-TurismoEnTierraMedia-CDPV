package tierraMedia;

public class PromocionPorcentual extends Promocion {

	private static final int CIEN = 100;
	private double descuento;

	public PromocionPorcentual(TipoPromocion tipoPromo, TipoAtraccion tipoPreferido, int costo, double duracion,
			Atraccion a1, Atraccion a2, Atraccion a3, double descuento) {
		super(tipoPromo, tipoPreferido, costo, duracion);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, a3 };
		this.descuento = descuento / CIEN;
	}
	
	public PromocionPorcentual(TipoPromocion tipoPromo, TipoAtraccion tipoPreferido, int costo, double duracion,
			Atraccion a1, Atraccion a2, double descuento) {
		super(tipoPromo, tipoPreferido, costo, duracion);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2};
		this.descuento = descuento / CIEN;
	}

	@Override
	protected int costoPromocion() {
		int costo = 0;
		for (int i = 0; i < atraccionesEnPromocion.length; i++) {
			costo += atraccionesEnPromocion[i].costo;
		}
		return (int) (costo * (1 - this.descuento));
	}

}
