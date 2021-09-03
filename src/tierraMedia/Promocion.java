package tierraMedia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Promocion extends Producto {
	
  private String nombrePromocion;
	private TipoAtraccion tipoAtraccion;
	protected Atraccion[] atraccionesEnPromocion;
	protected int costoPromocion;
	protected double duracionPromocion;
  
  protected abstract int costoPromocion();
	protected abstract double duracionPromocion();
	
	
	protected Promocion(String nombrePromocion, TipoAtraccion tipoAtraccion) {
		this.nombrePromocion = nombrePromocion;
		this.tipoAtraccion = tipoAtraccion;
	}

	public int getCostoPromocion() {
		return costoPromocion;
	}

	public double getDuracionPromocion() {
		return duracionPromocion;
	}
	
	public Atraccion[] getAtraccionesEnPromocion() {
		return this.atraccionesEnPromocion;
	}

	private List <Atraccion> atracciones = new LinkedList <Atraccion>();
	private List <Promocion> promociones = new ArrayList <Promocion>();
	TipoPromocion promo;
	
	public Promocion(TipoAtraccion tipoDeAtraccion, int costo, int duracion) {
		super(tipoDeAtraccion, costo, duracion);
	}

	@Override
	protected boolean esPromo() {
		return true;
	}
	
	public void agregarAtraccion(Atraccion A) {
		atracciones.add(A);
	}
	
	
	protected abstract int calcularPromocion(Atraccion A1, Atraccion A2, TipoPromocion promo); 
	//Hay que cambiar para que tome como parametro la lista de atracciones
	
}
