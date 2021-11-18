package co.edu.unbosque.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;

public class JuegoDAO {

	private ArrayList<JuegoDTO> juegos = new ArrayList<JuegoDTO>();
	private ArchivosBinarios ab;


	public JuegoDAO() {
		juegos = new ArrayList<JuegoDTO>();
		ab = new ArchivosBinarios();
	}

	public String agregarJuego(JuegoDTO juego) {
		String mensaje;
		try {
			juegos = ab.leerJuego();
			juegos.add(juego);
			mensaje = ab.escribirJuego(juegos);
			
		}
		catch(Exception e){
			mensaje = "No se pudo crear el juego";
			e.printStackTrace();
		}
		return mensaje;
	}

	public String buscarJuego(int id) {
		juegos = ab.leerJuego();
		String mensaje = "El juego no existe";
		for (JuegoDTO juegoDTO : juegos){
			System.out.println(juegoDTO.getID());
			if(juegoDTO.getID()== id) {
				mensaje = " Nombre del juego: " +juegoDTO.getNombreJuego() + "\n" 
						+"\n" + " -Tipo de juego : "+ juegoDTO.getTipoJuego()
						+"\n" + " -Id : "+juegoDTO.getID();
				
			}
		}
		return mensaje;
	}

	public String mostrarJuego() {

		String mensaje = "";
		juegos = ab.leerJuego();
		for (JuegoDTO juegoDTO : juegos) {
			mensaje += juegoDTO.getID()+" "+juegoDTO.getNombreJuego()+" "+juegoDTO.getTipoJuego()+"\n";
		}

		return mensaje;
	}

}

