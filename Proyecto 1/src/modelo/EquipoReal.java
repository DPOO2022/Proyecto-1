package modelo;

import java.util.ArrayList;

public class EquipoReal {

	private String nombre;
	private ArrayList<Jugador> jugadores;
	private ArrayList<String> resultadoPartido; // Puede tener como valor "SI" o "NO"
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
}
