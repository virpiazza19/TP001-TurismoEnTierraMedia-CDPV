package tierraMedia;

public class PromocionPorcentual extends Promocion {
	
	private static final int PROCENTAJE_PROMOCION = 30;
	private static final int CIEN = 100;
	
	@Override
	public int calcularPromocion(Atraccion A1, Atraccion A2) {
		int precioFinal = A1.getCosto()+A2.getCosto(); 
		int promo = (int) (A1.getCosto()+A2.getCosto()) * PROCENTAJE_PROMOCION /CIEN;
		
		return precioFinal - promo;
	}

}
