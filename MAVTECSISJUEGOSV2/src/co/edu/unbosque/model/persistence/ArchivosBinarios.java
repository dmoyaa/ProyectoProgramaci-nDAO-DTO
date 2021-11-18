package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;

import co.edu.unbosque.model.PartidaDTO;


public class ArchivosBinarios {

	private String rutaJuego = "./data/juegos.out";
	private String rutaJugadores = "./data/jugadores.out";
	private String rutaPartida = "./data/partidas.out";
	private ArrayList<PartidaDTO> partidas;
	private ArrayList<JuegoDTO> juego;


	public ArchivosBinarios() {
		partidas = new ArrayList<PartidaDTO>();
		juego = new ArrayList<JuegoDTO>();
	}

	public String escribirPartidas(ArrayList<PartidaDTO> partidas) {
		String respuesta = "Se ha agregado exitosamente la partida.";		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaPartida));
			out.writeObject(partidas);	
			out.close();
		}
		catch (IOException e) {
			respuesta = "Error de IO"; 
		}
		System.out.println(respuesta);
		return respuesta;
	}
	
	public ArrayList<PartidaDTO> leerPartidas() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaPartida));
			partidas = (ArrayList<PartidaDTO>)in.readObject();
			in.close();
		}
		catch(IOException|ClassNotFoundException e) {
		}
		return partidas;
	}
	
	public String escribirJuego(ArrayList<JuegoDTO> juegos) {
		String respuesta = "Se ha agregado exitosamente el juego.";		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaJuego));
			out.writeObject(juegos);	
			out.close();
		}
		catch (IOException e) {
			respuesta = "Error de IO"; 
		}
		System.out.println(respuesta);
		return respuesta;
	}

	public ArrayList<JuegoDTO> leerJuego() {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaJuego));
			juego = (ArrayList<JuegoDTO>)in.readObject();
			in.close();
		}
		catch(IOException|ClassNotFoundException e) {
		}
		return juego;
	}


}
