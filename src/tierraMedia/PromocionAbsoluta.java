package tierraMedia;

public class PromocionAbsoluta extends Promocion {
    private int costoPaquete;
	
	protected PromocionAbsoluta(String nombrePromocion, TipoAtraccion tipoAtraccion, Atraccion a1, Atraccion a2, Atraccion a3, int costoPaquete) {
		super(nombrePromocion, tipoAtraccion);
		super.atraccionesEnPromocion = new Atraccion[]{a1, a2, a3};
		this.costoPaquete = costoPaquete;
		super.costoPromocion = this.costoPromocion();
		super.duracionPromocion = this.duracionPromocion();
	}
	
	@Override
	protected int costoPromocion() {
		return this.costoPaquete;
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
