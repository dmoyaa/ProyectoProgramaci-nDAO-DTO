package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_MostrarPartida extends JPanel{
	
	private JLabel lPartidas;
	private JTextArea tPartidas;
	private JButton brMostrar;
	
	public Panel_MostrarPartida() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~Mostrar Partidas~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		lPartidas = new JLabel(" Las partidas registradas son: ");
		lPartidas.setBounds(150,15 , 250, 40);
		add(lPartidas);
		tPartidas = new JTextArea();
		tPartidas.setBounds(30,50,430,230);
		add(tPartidas);
		brMostrar= new JButton("Menú Partidas");
		brMostrar.setBounds(300, 300, 150, 40);
		brMostrar.setActionCommand("REGRESAR MOSTRAR");
		add(brMostrar);
	}

	public JLabel getlPartidas() {
		return lPartidas;
	}

	public void setlPartidas(JLabel lPartidas) {
		this.lPartidas = lPartidas;
	}

	public JTextArea gettPartidas() {
		return tPartidas;
	}

	public void settPartidas(JTextArea tPartidas) {
		this.tPartidas = tPartidas;
	}

	public JButton getBrMostrar() {
		return brMostrar;
	}

	public void setBrMostrar(JButton brMostrar) {
		this.brMostrar = brMostrar;
	}

}
