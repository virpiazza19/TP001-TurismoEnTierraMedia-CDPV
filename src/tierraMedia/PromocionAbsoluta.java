package tierraMedia;

public class PromocionAbsoluta extends Promocion {
    private int costoPaquete;
	
	protected PromocionAbsoluta(TipoPromocion tipoPromocion, String nombrePromocion, TipoAtraccion tipoAtraccion,
			int cantidadAtraccionesEnPromocion, Atraccion a1, Atraccion a2, Atraccion a3, int costo) {
		super(tipoPromocion, nombrePromocion, tipoAtraccion, cantidadAtraccionesEnPromocion);
		this.añadirAtracciones(a1, a2, a3);
		this.costoPromocion();
	}

	private void añadirAtracciones(Atraccion a1, Atraccion a2, Atraccion a3) {
    	for (int i = 0; i < super.atracciones.length; i++) {
			super.atracciones[i] = a1;
		}
    }
	
	@Override
	protected int costoPromocion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double duracionPromocion() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
