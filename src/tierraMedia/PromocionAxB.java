package tierraMedia;

public class PromocionAxB extends Promocion {

	private Atraccion atraccionBonificada;

	public PromocionAxB(String nombre, Atraccion a1, Atraccion a2, Atraccion atraccionBonificada) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, atraccionBonificada };
		this.atraccionBonificada = atraccionBonificada;
	}

	public PromocionAxB(String nombre, Atraccion a1, Atraccion atraccionBonificada) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, atraccionBonificada };
		this.atraccionBonificada = atraccionBonificada;
	}

	@Override
	protected void costoPromocion() {
		int costo = 0;
		for (int i = 0; i < super.atraccionesEnPromocion.length - 1; i++) {
			costo += super.atraccionesEnPromocion[i].costo;
		}
		super.costo = costo - this.atraccionBonificada.costo;
	}
}
