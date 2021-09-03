package tierraMedia;

public class PromocionPorcentual extends Promocion {
	private double descuento;

	public PromocionPorcentual(String nombrePromocion, TipoAtraccion tipoAtraccion,
			Atraccion a1, Atraccion a2, Atraccion a3, double descuento) {
		super(nombrePromocion, tipoAtraccion);
		super.atraccionesEnPromocion = new Atraccion[]{a1, a2, a3};
		this.descuento = descuento / 100;
		super.costoPromocion = this.costoPromocion();
		super.duracionPromocion = this.duracionPromocion();
	}

	@Override
	protected int costoPromocion() {
		int costo = 0;
		for (int i = 0; i < super.atracciones.length; i++) {
			costo += super.atraccionesEnPromocion[i].getCosto();
		}
		return (int) (costo * (1 - this.descuento));
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
