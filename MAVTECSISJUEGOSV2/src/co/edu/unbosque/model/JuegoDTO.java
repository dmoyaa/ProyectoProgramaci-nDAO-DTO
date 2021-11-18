package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDTO implements Serializable {

	private String nombreJuego;
	private String tipoJuego;
	private int ID;
	
	public JuegoDTO (String nombreJuego, String tipoJuego, int id) {
		
		this.nombreJuego=nombreJuego;
		this.tipoJuego=tipoJuego;
		this.ID= id;
	}

	
	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public String getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}	
	
}
