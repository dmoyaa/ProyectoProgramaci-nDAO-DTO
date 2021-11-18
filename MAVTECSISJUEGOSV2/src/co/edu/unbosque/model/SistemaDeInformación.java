package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;
import co.edu.unbosque.model.JuegoDAO;
import co.edu.unbosque.model.JuegoDTO;

public class SistemaDeInformación {
	
	private PartidaDTO partida;
	private PartidaDAO pdao;
	private JuegoDAO ju;
	private JuegoDTO juego;
	private  ArrayList <PartidaDTO> partidas;
	private ArchivosBinarios ab;
	
	public SistemaDeInformación() {
		pdao = new PartidaDAO();
		partidas = new ArrayList<PartidaDTO>(); 
		ab = new ArchivosBinarios();
		ju = new JuegoDAO();
		
	}
	
	public PartidaDTO crearOPartida(String t, String n1, String n2, double p1, double p2, int id) {
		return partida = new PartidaDTO(t, n1, n2, p1, p2,id);
	}

	public JuegoDTO crearOJuego(String nom, String tip, int id) {
		return juego = new JuegoDTO(nom,tip,id);
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

	public ArrayList<PartidaDTO> getPartidas() {
		return partidas;
	}



	public void setPartidas(ArrayList<PartidaDTO> partidas) {
		this.partidas = partidas;
	}



	public ArchivosBinarios getAb() {
		return ab;
	}

	public void setAb(ArchivosBinarios ab) {
		this.ab = ab;
	}


	public JuegoDAO getJu() {
		return ju;
	}

	public void setJu(JuegoDAO ju) {
		this.ju = ju;
	}

	public JuegoDTO getJuego() {
		return juego;
	}

	public void setJuego(JuegoDTO juego) {
		this.juego = juego;
	}


	
	

}
