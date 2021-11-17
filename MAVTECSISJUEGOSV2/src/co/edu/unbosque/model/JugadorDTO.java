package co.edu.unbosque.model;

import java.io.Serializable;

public class JugadorDTO  implements Serializable {

	private String nombre;
	private int edad;
	private String genero;
	private double puntaje;
	private String nombre2;
	private int edad2;
	private String genero2;
	private double puntaje2;

	public JugadorDTO (String nombre,int edad,String genero, double puntaje){
		this.edad= edad;
		this.genero = genero;
		this.nombre = nombre;
		this.puntaje = puntaje;
	}


	public String getNombre2() {
		return nombre2;
	}


	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}


	public int getEdad2() {
		return edad2;
	}


	public void setEdad2(int edad2) {
		this.edad2 = edad2;
	}


	public String getGenero2() {
		return genero2;
	}


	public void setGenero2(String genero2) {
		this.genero2 = genero2;
	}


	public double getPuntaje2() {
		return puntaje2;
	}


	public void setPuntaje2(double puntaje2) {
		this.puntaje2 = puntaje2;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

}