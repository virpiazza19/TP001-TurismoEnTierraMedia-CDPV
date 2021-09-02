package tierraMedia;

public class PromocionAxB extends Promocion {
	private Atraccion atraccionBonificada;
	
	protected PromocionAxB(String nombrePromocion, TipoAtraccion tipoAtraccion, Atraccion a1, Atraccion a2, Atraccion aBonificada) {
		super(nombrePromocion, tipoAtraccion);
		super.atraccionesEnPromocion = new Atraccion[]{a1, a2, aBonificada};
		this.atraccionBonificada = aBonificada;
		super.costoPromocion = this.costoPromocion();
		super.duracionPromocion = this.duracionPromocion();
	}

	@Override
	protected int costoPromocion() {
		int costo = 0;
		for (int i = 0; i < super.atraccionesEnPromocion.length-1; i++) {
			costo += super.atraccionesEnPromocion[i].getCosto();
		}
		return costo;
	}

	@Override
	protected double duracionPromocion() {
		double duracion = 0;
		for (Atraccion atraccion : super.atraccionesEnPromocion) {
			duracion += atraccion.getDuracion();
		}
		return duracion;
	}
}
