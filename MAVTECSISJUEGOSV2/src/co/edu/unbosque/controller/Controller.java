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
		v.getpCrudPartida().getBotonAp().addActionListener(this);
		v.getpCrudPartida().getBotonBp().addActionListener(this);
		v.getpCrudPartida().getBotonLp().addActionListener(this);
		v.getpCrudPartida().getRegresarCrud().addActionListener(this);
		v.getpMP().getBrMostrar().addActionListener(this);
		v.getpBJ().getbBjuego().addActionListener(this);
		v.getpBJ().getbRcrudJuego().addActionListener(this);
		v.getpAJ().getCargarDatosJuego().addActionListener(this);
		v.getpAJ().getRegresarJ().addActionListener(this);
		v.getpJuego().getbGuardar().addActionListener(this);
		v.getpJuego().getbRegresar().addActionListener(this);
		v.getpMJ().getbMJuego().addActionListener(this);
		v.getpCrudJuego().getBotonAj().addActionListener(this);
		v.getpCrudJuego().getBotonMj().addActionListener(this);
		v.getpCrudJuego().getBotonBj().addActionListener(this);
		v.getpCrudJuego().getRegresarCrudp().addActionListener(this);
		v.getpOpciones().getBotonRegistro().addActionListener(this);
		v.getpOpciones().getBotonBjugador().addActionListener(this);
		v.getpOpciones().getBotonRegresarInicial().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("PARTIDAS")) {
			v.getContentPane().remove(v.getpInicio());
			v.getContentPane().add(v.getpCrudPartida());
			v.getpCrudPartida().setVisible(true);

		}
		else if(comando.equals("JUEGOS")) {

			v.getContentPane().remove(v.getpInicio());
			v.getContentPane().add(v.getpCrudJuego());
			v.getpCrudJuego().setVisible(true);

		}
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
		else if(comando.equals("REGRESAR")) {
			v.getpAP().setVisible(false);
			v.getContentPane().remove(v.getpAP());
			v.getContentPane().add(v.getpCrudPartida());
		}
		else if(comando.equals("REGRESAR PARTIDA")) {
			v.getpBP().setVisible(false);
			v.getContentPane().remove(v.getpBP());
			v.getContentPane().add(v.getpCrudPartida());
		}
		else if(comando.equals("MOSTRAR PARTIDAS")) {
			v.getpMP().gettPartidas().setText("");
			v.getContentPane().remove(v.getpCrudPartida());
			v.getContentPane().add(v.getpMP());
			v.getpMP().gettPartidas().append(s.getPdao().mostrarPartidas());
			v.getpMP().setVisible(true);
		}
		else if(comando.equals("REGRESAR MOSTRAR")) {
			v.getpMP().setVisible(false);
			v.getContentPane().remove(v.getpMP());
			v.getContentPane().add(v.getpCrudPartida());
		}
		else if(comando.equals("AGREGAR JUEGO")) {	
			v.getpCrudJuego().setVisible(false);
			v.getContentPane().remove(v.getpCrudJuego());
			v.getContentPane().add(v.getpAJ());
			v.getpAJ().setVisible(true);	
		}
		else if(comando.equals("CARGAR DATOS JUEGO")) {
			v.MostrarMensaje(s.getJu().agregarJuego(s.crearOJuego(v.getpAJ().getTnomJu().getText(),v.getpAJ().getTtipJu().getText(),Integer.parseInt(v.getpAJ().getTidJu().getText()))));	
		}
		else if(comando.equals("REGRESAR MENU")) {
			v.getpAJ().setVisible(false);
			v.getContentPane().remove(v.getpAJ());
			v.getContentPane().add(v.getpCrudJuego());
			v.getpCrudJuego().setVisible(true);	
			
		}else if(comando.equals("BUSCAR JUEGO")) {
			v.getpCrudJuego().setVisible(false);
			v.getContentPane().remove(v.getpCrudJuego());
			v.getContentPane().add(v.getpBJ());
			v.getpBJ().setVisible(true);
		
		}else if(comando.equals("BUSCAR POR ID JUEGO")) {
			v.getpBJ().getlPEncontradaJuego().setText((s.getJu().buscarJuego(Integer.parseInt(v.getpBJ().gettIdJuego().getText().toString()))));
		}
		else if(comando.equals("REGRESAR JUEGO")) {
			v.getpBJ().setVisible(false);
			v.getContentPane().remove(v.getpBJ());
			v.getContentPane().add(v.getpCrudJuego());
			v.getpCrudJuego().setVisible(true);
		}
		else if(comando.equals("REGRESAR CRUDP")) {
			v.getpCrudJuego().setVisible(false);
			v.getContentPane().remove(v.getpCrudJuego());
			v.getContentPane().add(v.getpInicio());
			v.getpInicio().setVisible(true);
		}
		else if(comando.equals("MOSTRAR JUEGO")) {
			v.getpMJ().gettJuego().setText("");
			v.getpCrudJuego().setVisible(false);
			v.getContentPane().remove(v.getpCrudJuego());
			v.getContentPane().add(v.getpMJ());
			v.getpMJ().gettJuego().append(s.getJu().mostrarJuego());
			v.getpMJ().setVisible(true);
		}
		else if(comando.equals("REGRESAR A JUEGO")) {
			v.getpMJ().setVisible(false);
			v.getContentPane().remove(v.getpMJ());
			v.getContentPane().add(v.getpCrudJuego());
			v.getpCrudJuego().setVisible(true);
		}
		
		else if(comando.equals("REGRESAR CRUD")) {
			v.getpCrudPartida().setVisible(false);
			v.getContentPane().remove(v.getpCrudPartida());
			v.getContentPane().add(v.getpInicio());
			v.getpInicio().setVisible(true);
		}
		
		
		
	}
}
