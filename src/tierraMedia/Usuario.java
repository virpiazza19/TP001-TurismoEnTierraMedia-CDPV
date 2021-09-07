package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private int presupuesto;
	private double tiempoDisponible;
	private TipoAtraccion atraccionPreferida;
	private List <Producto> itinerario = new ArrayList<Producto>(); 
	
	
	public Usuario(String nombre, int presupuesto, double tiempoDisponible, TipoAtraccion atraccionPreferida) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public double getTiempoDisponible() {
		return tiempoDisponible;
	}
	public TipoAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}
	public List <Producto> getItinerario() {
		return itinerario;
	}

	public void sugerirOfertas(List <Producto> ofertas) {
		ofertas.sort(new ComparadorPorTipoAtraccion(atraccionPreferida));
		for(Producto O: ofertas) {
			if(this.atraccionPreferida == O.tipoAtraccion && this.presupuesto >= O.costo && this.tiempoDisponible >= O.duracion) {
				System.out.println(O);
			} else {
				while(this.presupuesto >= O.costo && this.tiempoDisponible >= O.duracion) {
					System.out.println(O);
				}
			}
		}
		
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", presupuesto=" + presupuesto + ", tiempoDisponible="
				+ tiempoDisponible + ", atraccionPreferida=" + atraccionPreferida + "]";
	}
	
}
