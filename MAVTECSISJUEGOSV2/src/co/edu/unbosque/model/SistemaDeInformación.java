package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class SistemaDeInformación {
	
	private PartidaDTO partida;
	private PartidaDAO pdao;
	private ArchivosBinarios ab;
	private JuegoDTO juegos;
	private JugadorDTO jugadores;
	
	public SistemaDeInformación() {
		pdao = new PartidaDAO();
		ab = new ArchivosBinarios();
		juegos=new JuegoDTO(null, null);
		jugadores = new JugadorDTO(null, 0, null, 0);
	}
	
	public PartidaDTO crearOPartida(String t, String n1, String n2, double p1, double p2, int id) {
		return partida = new PartidaDTO(t, n1, n2, p1, p2,id);
	}

	public PartidaDTO getPartida() {
		return partida;
	}

	public void setPartida(PartidaDTO partida) {
		this.partida = partida;
	}

	public PartidaDAO getPdao() {
		return pdao;
	}

	public void setPdao(PartidaDAO pdao) {
		this.pdao = pdao;
	}

	public void crearPartida(PartidaDTO partida) {
		
	}

	
	public ArchivosBinarios getAb() {
		return ab;
	}

	public void setAb(ArchivosBinarios ab) {
		this.ab = ab;
	}

	public JuegoDTO getJuegos() {
		return juegos;
	}

	public void setJuegos(JuegoDTO juegos) {
		this.juegos = juegos;
	}

	public JugadorDTO getJugadores() {
		return jugadores;
	}

	public void setJugadores(JugadorDTO jugadores) {
		this.jugadores = jugadores;
	}
	

}
