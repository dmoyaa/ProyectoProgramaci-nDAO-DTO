package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDTO implements Serializable {

	private String nombreJuego;
	private String tipoJuego;
	
	public JuegoDTO (String nombreJuego, String tipoJuego) {
		
		this.nombreJuego=nombreJuego;
		this.tipoJuego=tipoJuego;
		
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
