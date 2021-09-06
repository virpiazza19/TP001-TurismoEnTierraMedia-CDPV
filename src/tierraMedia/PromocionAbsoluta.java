package tierraMedia;

public class PromocionAbsoluta extends Promocion {

	private int costoPaquete;

	public PromocionAbsoluta(String nombre, Atraccion a1, Atraccion a2, int costoPaquete) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2 };
		super.duracionPromocion();
		this.costoPaquete = costoPaquete;
		this.costoPromocion();
	}

	public PromocionAbsoluta(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, int costoPaquete) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, a3 };
		super.duracionPromocion();
		this.costoPaquete = costoPaquete;
		this.costoPromocion();
	}

	@Override
	protected int costoPromocion() {
		return this.costoPaquete;
	}
}
