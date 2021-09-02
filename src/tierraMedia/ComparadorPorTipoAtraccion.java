package tierraMedia;

import java.util.Comparator;

public class ComparadorPorTipoAtraccion implements Comparator<Atraccion> { // no implementa solo atraccion

	private TipoAtraccion atraccion;

	public ComparadorPorTipoAtraccion(TipoAtraccion atraccion) {
		this.atraccion = atraccion;
	}

	@Override
	public int compare(Atraccion A1, Atraccion A2) {
		if(A1.atraccion == this.atraccion && A2.atraccion == this.atraccion) {
			if()
		}
		return A1.getAtraccion().compareTo(A2.getAtraccion());
	}

}
