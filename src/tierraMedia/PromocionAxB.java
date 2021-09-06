package tierraMedia;

public class PromocionAxB extends Promocion {

	private Atraccion atraccionBonificada;

	public PromocionAxB(String nombre, Atraccion a1, Atraccion a2, Atraccion atraccionBonificada) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, atraccionBonificada };
		super.duracionPromocion();
		this.atraccionBonificada = atraccionBonificada;
		this.costoPromocion();
	}

	public PromocionAxB(String nombre, Atraccion a1, Atraccion atraccionBonificada) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, atraccionBonificada };
		super.duracionPromocion();
		this.atraccionBonificada = atraccionBonificada;
		this.costoPromocion();
	}

	@Override
	protected int costoPromocion() {
		int costo = 0;
		for (int i = 0; i < super.atraccionesEnPromocion.length - 1; i++) {
			costo += super.atraccionesEnPromocion[i].costo;
		}
		return costo;
	}
	
	
	// agregar to string en atraccion
	protected Atraccion getAtraccionBonificada() {
		return this.atraccionBonificada;
	}
}
