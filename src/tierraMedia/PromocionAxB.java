package tierraMedia;

public class PromocionAxB extends Promocion {
	
	@Override
	public int calcularPromocion(Atraccion A1, Atraccion A2) {
		return A1.getCosto()+A2.getCosto();
	}
}
