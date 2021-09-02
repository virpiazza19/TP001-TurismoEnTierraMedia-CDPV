package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Promocion extends TierraMedia {
	
	List <Atraccion> atracciones;
	List <Promocion> promociones = new ArrayList <Promocion>();
	TipoAtraccion atraccion;
	TipoPromocion promo;
	
	protected int costoPromocion(List <Atraccion> atracciones, TipoAtraccion atraccion) {
		// Realizar calculo con atracciones del mismo TipoAtraccion
		// Para cada atraccion dentro de la promo, sumar los costos
		//if TipoPromocion promo=AxB no sumar costo de última atraccion;

		int suma = 0;
		for (Atraccion A: atracciones) {
			if(A.atraccion == ) {
			suma += A.getCosto();
		}
		}
			return suma;
	}
	protected int duracionPromocion(List <Atraccion> atracciones, TipoAtraccion atraccion) {
		// Realizar calculo con atracciones del mismo TipoAtraccion
		// Para cada atraccion dentro de la promo, sumar las duraciones

		int suma = 0;
		for (Atraccion A.atraccion: atracciones) {
			suma += A.getDuracion();
		}
		return suma;
	}

	protected abstract int calcularPromocion(Atraccion A1, Atraccion A2, TipoPromocion promo); 
	//Hay que cambiar para que tome como parametro la lista de atracciones
	

}
