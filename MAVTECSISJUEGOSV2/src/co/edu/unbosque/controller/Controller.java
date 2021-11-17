	package co.edu.unbosque.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import co.edu.unbosque.model.SistemaDeInformación;
import co.edu.unbosque.model.persistence.ArchivosBinarios;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View v;
	private SistemaDeInformación s;

	public Controller() {
		v = new View();
		v.setVisible(true);
		s = new SistemaDeInformación();
		asignarOyentes();

	}

	public void asignarOyentes() {

		v.getpInicio().getBotonPartidas().addActionListener(this);
		v.getpInicio().getBotonJugador().addActionListener(this);
		v.getpInicio().getBotonPartidas().addActionListener(this);
		v.getpInicio().getBotonJuegos().addActionListener(this);
		v.getpBP().getbBpartida().addActionListener(this);
		v.getpBP().getbRcrud().addActionListener(this);
		v.getpAP().getRegresar().addActionListener(this);
		v.getpAP().getCargarDatos().addActionListener(this);
		v.getpJuego().getbGuardar().addActionListener(this);
		v.getpJuego().getbRegresar().addActionListener(this);
		v.getPjugador().getBotonsig().addActionListener(this);
		v.getPjugador().getBotonguardarJ1().addActionListener(this);
		v.getPjugador2().getBregresar().addActionListener(this);
		v.getPjugador2().getBguardarJ2().addActionListener(this);
		v.getpCrudPartida().getBotonAp().addActionListener(this);
		v.getpCrudPartida().getBotonBp().addActionListener(this);
		v.getpCrudPartida().getBotonLp().addActionListener(this);
		v.getpCrudPartida().getRegresarCrud().addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("PARTIDAS")) {
			v.getContentPane().remove(v.getpInicio());
			v.getContentPane().add(v.getpCrudPartida());
			v.getpCrudPartida().setVisible(true);

		}
//		else if(comando.equals("JUEGOS")) {
//
//			v.getContentPane().remove(v.getpInicio());
//			v.getContentPane().add(v.getpJuego());
//			v.getpJuego().setVisible(true);
//
//		}
//		else if(comando.equals("JUGADOR")) {
//			v.getContentPane().remove(v.getpInicio());
//			v.getContentPane().add(v.getPjugador());
//			v.getPjugador().setVisible(true);
//		}
//		else if(comando.equals("SIGUIENTE JUGADOR")) {
//
//			v.getContentPane().remove(v.getPjugador());
//			v.getContentPane().add(v.getPjugador2());
//			v.getPjugador2().setVisible(true);
//		}
//		else if(comando.equals("Regresar al menú")) {
//			v.getPjugador2().setVisible(false);
//			v.getContentPane().remove(v.getPjugador2());
//			v.getContentPane().add(v.getpInicio());
//			v.getpInicio().setVisible(true);
//		}
//		else if(comando.equals("Guardar Datos J1")) {
//			s.getJugadores().setEdad(Integer.parseInt(v.getPjugador().getEdad1().getText()));
//			s.getJugadores().setGenero(v.getPjugador().getGen1().getText());
//			s.getJugadores().setNombre(v.getPjugador().getNom1().getText());
//
//
//		}
//		else if(comando.equals("Guardar Datos J2")) {
//			s.getJugadores().setEdad2(Integer.parseInt(v.getPjugador2().getEdad1().getText()));
//			s.getJugadores().setGenero2(v.getPjugador2().getGen1().getText());
//			s.getJugadores().setNombre2(v.getPjugador2().getNom1().getText()); 
//
//		}
//
//		else if (comando.equals("GUARDAR DATOS")) {
//
//			s.getJuegos().setNombreJuego(v.getpJuego().gettTipJuego().getText());
//			s.getJuegos().setTipoJuego(v.getpJuego().gettNomJuego().getText());
//
//		}
//		else if (comando.equals("REGRESAR AL INICIO")){
//			v.getpJuego().setVisible(false);
//			v.getContentPane().remove(v.getpJuego());
//			v.getContentPane().add(v.getpInicio());
//			v.getpInicio().setVisible(true);
//
//		}
//		else if(comando.equals("REGRESAR")){
//			v.getPpartida().setVisible(false);
//			v.getContentPane().remove(v.getPpartida2());
//			v.getContentPane().add(v.getpInicio());
//			v.getpInicio().setVisible(true);
//		}
		else if(comando.equals("BUSCAR PARTIDA")) {
			v.getContentPane().remove(v.getpCrudPartida());
			v.getContentPane().add(v.getpBP());
			v.getpBP().setVisible(true);
		}
		else if (comando.equals("AGREGAR PARTIDA")) {
			v.getContentPane().remove(v.getpCrudPartida());
			v.getContentPane().add(v.getpAP());
			v.getpAP().setVisible(true);
		}

		else if(comando.equals("CARGAR")) {
			v.MostrarMensaje(s.getPdao().agregarPartida(s.crearOPartida(v.getpAP().getTtpar().getText(), v.getpAP().getTnom1().getText(), v.getpAP().getTnom2().getText(), Math.random()* (10-0)+0, Math.random()* (10-0)+0,Integer.parseInt(v.getpAP().getTid().getText()))));
		}
		else if(comando.equals("BUSCAR POR ID")){
			s.getPdao().buscarPartida(Integer.parseInt(v.getpBP().gettId().getText()));
			v.getpBP().gettPEncontrada().setText((s.getPdao().buscarPartida(Integer.parseInt(v.getpBP().gettId().getText()))).toString());
		}
	}
}
