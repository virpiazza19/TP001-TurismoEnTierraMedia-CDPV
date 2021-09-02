package tierraMedia;

public class PromocionAbsoluta extends Promocion {

	private int costoPaquete;

	public PromocionAbsoluta(TipoPromocion tipoPromo, TipoAtraccion atraccionPreferida, int costo, double duracion,
			Atraccion a1, Atraccion a2, Atraccion a3, int costoPaquete) {
		super(tipoPromo, atraccionPreferida, costo, duracion);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, a3 };
		this.costoPaquete = costoPaquete;
	}

	@Override
	protected int costoPromocion() {
		return this.costoPaquete;
	}
}
