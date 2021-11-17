package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class PanelInicio extends JPanel {

	private JLabel labEntrada;
	private JButton botonJugador;
	private JButton botonJuegos;
	private JButton botonPartidas;
	private JButton botonTorneos;

	public PanelInicio() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
    public void inicializarComponentes() {
    	
    	Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~INICIO~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
    	
    	
		botonJugador = new JButton("Jugador");
		botonJugador.setBounds(40, 20, 200, 150);
		add(botonJugador);
		botonJugador.setActionCommand("JUGADOR");
		
		botonJuegos = new JButton("Juegos");
		botonJuegos.setBounds(250, 20, 200, 150);
		add(botonJuegos);
		botonJuegos.setActionCommand("JUEGOS");
		
		botonPartidas = new JButton("Partidas");
		botonPartidas.setBounds(40, 190, 200, 150);
		add(botonPartidas);
		botonPartidas.setActionCommand("PARTIDAS");
		
		botonTorneos = new JButton("Torneos");
		botonTorneos.setBounds(250, 190, 200, 150);
		add(botonTorneos);
		botonTorneos.setActionCommand("TORNEOS");
			
    	
    }

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JButton getBotonJugador() {
		return botonJugador;
	}

	public void setBotonJugador(JButton botonJugador) {
		this.botonJugador = botonJugador;
	}

	public JButton getBotonJuegos() {
		return botonJuegos;
	}

	public void setBotonJuegos(JButton botonJuegos) {
		this.botonJuegos = botonJuegos;
	}

	public JButton getBotonPartidas() {
		return botonPartidas;
	}

	public void setBotonPartidas(JButton botonPartidas) {
		this.botonPartidas = botonPartidas;
	}

	public JButton getBotonTorneos() {
		return botonTorneos;
	}

	public void setBotonTorneos(JButton botonTorneos) {
		this.botonTorneos = botonTorneos;
	}
	
    
}