package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel {

	//private JLabel labEntrada;
	private JButton botonRegistro;
	private JButton botonBjugador;
	private JButton botonRegresarInicial;
	
	public PanelOpciones() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
    public void inicializarComponentes() {
    	
    	Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " OPCIONES ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
    	setBackground(Color.pink);
    	
    	
		botonRegistro = new JButton("REGISTRO");
		botonRegistro.setBounds(40, 20, 200, 150);
		add(botonRegistro);
		botonRegistro.setActionCommand("REGISTRO");
		
		botonBjugador = new JButton("BUSCAR JUGADORES");
		botonBjugador.setBounds(250, 20, 200, 150);
		add(botonBjugador);
		botonBjugador.setActionCommand("BUSCAR JUGADORES");
		
		botonRegresarInicial = new JButton("REGRESAR AL PANEL");
		botonRegresarInicial.setBounds(40, 190, 200, 150);
		add(botonRegresarInicial);
		botonRegresarInicial.setActionCommand("REGRESAR AL PANEL");
	
    }

	public JButton getBotonRegistro() {
		return botonRegistro;
	}

	public void setBotonRegistro(JButton botonRegistro) {
		this.botonRegistro = botonRegistro;
	}

	public JButton getBotonBjugador() {
		return botonBjugador;
	}

	public void setBotonBjugador(JButton botonBjugador) {
		this.botonBjugador = botonBjugador;
	}

	public JButton getBotonRegresarInicial() {
		return botonRegresarInicial;
	}

	public void setBotonRegresarInicial(JButton botonRegresarInicial) {
		this.botonRegresarInicial = botonRegresarInicial;
	}
    
}