package tierraMedia;

import java.util.Comparator;

public class ComparadorPorTipoAtraccion implements Comparator<Atraccion>{
	
	@Override
	public int compare(Atraccion A1, Atraccion A2) {
		return A1.getAtraccion().compareTo(A2.getAtraccion()); 
	}

}
