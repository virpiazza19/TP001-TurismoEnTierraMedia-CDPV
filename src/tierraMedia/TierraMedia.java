package tierraMedia;

public class TierraMedia {
	public Atraccion [] atracciones;
	
	protected TipoAtraccion atraccion; //NO SE SI VA ASI

	public int compareTo(Atraccion A1, Atraccion A2) {
		return A1.getAtraccion().compareTo(A2.getAtraccion());	
	}
	
}
