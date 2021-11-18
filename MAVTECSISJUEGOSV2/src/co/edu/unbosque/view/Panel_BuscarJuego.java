package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Panel_BuscarJuego extends JPanel{
	
	private JLabel lBuscarIdJuego;
	private JTextField tIdJuego;
	private JLabel lPEncontradaJuego;
	private JTextArea tPEncontradaJuego;
	private JButton bBjuego;
	private JButton bRcrudJuego;
	
	
	public Panel_BuscarJuego() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		
		Border border = new LineBorder(Color.black, 1, true);
		lBuscarIdJuego = new JLabel(" Ingrese el Id del juego:");
		lBuscarIdJuego.setBounds(10,30,300,100);
		add(lBuscarIdJuego);
		tIdJuego = new JTextField();
		tIdJuego.setBounds(160,60,280,40);
		tIdJuego.setBorder(border);
		add(tIdJuego);
		lPEncontradaJuego= new JLabel(" Juego encontrado:");
		lPEncontradaJuego.setBounds(10,130,400,100);
		add(lPEncontradaJuego);
		tPEncontradaJuego = new JTextArea();
		tPEncontradaJuego.setBorder(border);
		add(tPEncontradaJuego);
		
		bBjuego = new JButton("Buscar Juego");
		bBjuego.setActionCommand("BUSCAR POR ID JUEGO");
		bBjuego.setBounds(30,260,200,70);
		add(bBjuego);
		bRcrudJuego= new JButton("Menú Juego");
		bRcrudJuego.setActionCommand("REGRESAR JUEGO");
		bRcrudJuego.setBounds(250,260,200,70);
		add(bRcrudJuego);
	}

	public JLabel getlBuscarIdJuego() {
		return lBuscarIdJuego;
	}

	public void setlBuscarIdJuego(JLabel lBuscarIdJuego) {
		this.lBuscarIdJuego = lBuscarIdJuego;
	}

	public JTextField gettIdJuego() {
		return tIdJuego;
	}

	public void settIdJuego(JTextField tIdJuego) {
		this.tIdJuego = tIdJuego;
	}

	public JLabel getlPEncontradaJuego() {
		return lPEncontradaJuego;
	}

	public void setlPEncontradaJuego(JLabel lPEncontradaJuego) {
		this.lPEncontradaJuego = lPEncontradaJuego;
	}

	public JTextArea gettPEncontradaJuego() {
		return tPEncontradaJuego;
	}

	public void settPEncontradaJuego(JTextArea tPEncontradaJuego) {
		this.tPEncontradaJuego = tPEncontradaJuego;
	}

	public JButton getbBjuego() {
		return bBjuego;
	}

	public void setbBjuego(JButton bBjuego) {
		this.bBjuego = bBjuego;
	}

	public JButton getbRcrudJuego() {
		return bRcrudJuego;
	}

	public void setbRcrudJuego(JButton bRcrudJuego) {
		this.bRcrudJuego = bRcrudJuego;
	}

}
