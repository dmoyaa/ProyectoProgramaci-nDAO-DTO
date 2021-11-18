package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class PartidaDAO {

	private ArrayList<PartidaDTO> partidas;
	private ArchivosBinarios ab;
	
	public PartidaDAO() {
		partidas = new ArrayList<PartidaDTO>();
		ab = new ArchivosBinarios();
	}
	
	public String agregarPartida(PartidaDTO partida) {
		String mensaje;
		try {
		partidas = ab.leerPartidas();
		partidas.add(partida);
		mensaje = ab.escribirPartidas(partidas);
		ab.leerPartidas();
		}
		catch(Exception e){
		mensaje = "No se pudo crear Partida";
		e.printStackTrace();
		}
		return mensaje;
	}
	
	public String buscarPartida(int id) {
		partidas = ab.leerPartidas();
		String mensaje = "La partida no existe";
		for (PartidaDTO partidaDTO : partidas) {
			if(partidaDTO.getID()== id) {
				mensaje = "Jugador 1: "+partidaDTO.getJugador1()
				+"\nJugador 2: "+ partidaDTO.getJugador2()
				+"\nPuntaje J1: "+ partidaDTO.getPuntaje1()
				+"\nPuntaje J2: "+ partidaDTO.getPuntaje2()
				+"\nTipo de partida: "+ partidaDTO.getTipoPartida()
				+"\nId: "+partidaDTO.getID();
			}
		}
		return mensaje;
	}
public String mostrarPartidas() {
		String mensaje = "";
		partidas = ab.leerPartidas();
		for (PartidaDTO partidaDTO : partidas) {
			mensaje += partidaDTO.getID()+": "+partidaDTO.getJugador1()+", "+partidaDTO.getJugador2()+", "+partidaDTO.getPuntaje1()+", "+partidaDTO.getPuntaje2()+", "+partidaDTO.getTipoPartida()+"\n";
		}
		return mensaje;
	}
}
