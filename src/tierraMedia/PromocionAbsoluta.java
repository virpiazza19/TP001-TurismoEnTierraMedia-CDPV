package tierraMedia;

public class PromocionAbsoluta extends Promocion {

	private int costoPaquete;

	public PromocionAbsoluta(TipoPromocion tipoPromo, TipoAtraccion tipoPreferido, int costo, double duracion,
			Atraccion a1, Atraccion a2, Atraccion a3, int costoPaquete) {
		super(tipoPromo, tipoPreferido, costo, duracion);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, a3 };
		this.costoPaquete = costoPaquete;
	}
	
	public PromocionAbsoluta(TipoPromocion tipoPromo, TipoAtraccion tipoPreferido, int costo, double duracion,
			Atraccion a1, Atraccion a2, int costoPaquete) {
		super(tipoPromo, tipoPreferido, costo, duracion);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2};
		this.costoPaquete = costoPaquete;
	}
	

	@Override
	protected int costoPromocion() {
		return this.costoPaquete;
	}
}
