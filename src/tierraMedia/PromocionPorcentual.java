package tierraMedia;

public class PromocionPorcentual extends Promocion {
	private double descuento;
	
	public PromocionPorcentual(TipoPromocion tipoPromocion, String nombrePromocion, TipoAtraccion tipoAtraccion,
			int cantidadAtraccionesEnPromocion, Atraccion a1, Atraccion a2, Atraccion a3, double descuento) {
		super(tipoPromocion, nombrePromocion, tipoAtraccion, cantidadAtraccionesEnPromocion);
		this.añadirAtracciones(a1, a2, a3);
		this.descuento = descuento/100;
		super.costoPromocion = this.costoPromocion();
		super.duracionPromocion = this.duracionPromocion();
	}

    private void añadirAtracciones(Atraccion a1, Atraccion a2, Atraccion a3) {
    	for (int i = 0; i < super.atracciones.length; i++) {
			super.atracciones[i] = a1;
		}
    }

	@Override
	protected int costoPromocion() {
		int costo = 0;
		for (int i = 0; i < super.atracciones.length; i++) {
			costo += super.atracciones[i].getCosto();
		}
		return (int) (costo*(1-this.descuento));
	}

	@Override
	protected double duracionPromocion() {
		double duracion = 0;
		for (int i = 0; i < super.atracciones.length; i++) {
			duracion += super.atracciones[i].getDuracion();
		}
		return duracion;
	}

}
