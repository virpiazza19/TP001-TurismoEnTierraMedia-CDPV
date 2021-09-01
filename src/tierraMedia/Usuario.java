package tierraMedia;

import java.util.Arrays;

public class Usuario extends TierraMedia { //PUSE QUE EXTIENDE SOLO PARA QUE NO ME MARQUE ERROR EL ORDENADOR
	private String nombre;
	private int presupuesto;
	private double tiempoDisponible;
	private TipoAtraccion atraccionPreferida;
	private String []itinerario;
	
	
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
	public String[] getItinerario() {
		return itinerario;
	}

	public void ordenarPorTipoAtraccion() {
		Arrays.sort(atracciones, new ComparadorPorTipoAtraccion()); // HAY QUE CORREGIR ESTO
	}

	public void contratarPromocion() {
		//FALTA		
		
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", presupuesto=" + presupuesto + ", tiempoDisponible="
				+ tiempoDisponible + ", atraccionPreferida=" + atraccionPreferida + "]";
	}
	
	
	
	
}
