package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Panel_BucarPartida extends JPanel{
	
	private JLabel lBuscarId;
	private JTextField tId;
	private JLabel lPEncontrada;
	private JTextArea tPEncontrada;
	private JButton bBpartida;
	private JButton bRcrud;
	
	
	public Panel_BucarPartida() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		setLayout(new GridLayout(3,3));
		Border border = new LineBorder(Color.black, 1, true);
		lBuscarId = new JLabel(" Ingrese el Id de la partida:");
		add(lBuscarId);
		tId = new JTextField();
		tId.setBorder(border);
		add(tId);
		lPEncontrada= new JLabel(" Partida encontrada:");
		add(lPEncontrada);
		tPEncontrada = new JTextArea();
		tPEncontrada.setBorder(border);
		add(tPEncontrada);
		bBpartida = new JButton("Buscar partida");
		bBpartida.setActionCommand("BUSCAR POR ID");
		add(bBpartida);
		bRcrud= new JButton("Menú Partidas");
		bRcrud.setActionCommand("REGRESAR PARTIDA");
		add(bRcrud);
	}

	public JLabel getlBuscarId() {
		return lBuscarId;
	}

	public void setlBuscarId(JLabel lBuscarId) {
		this.lBuscarId = lBuscarId;
	}

	public JTextField gettId() {
		return tId;
	}

	public void settId(JTextField tId) {
		this.tId = tId;
	}

	public JLabel getlPEncontrada() {
		return lPEncontrada;
	}

	public void setlPEncontrada(JLabel lPEncontrada) {
		this.lPEncontrada = lPEncontrada;
	}

	public JTextArea gettPEncontrada() {
		return tPEncontrada;
	}

	public void settPEncontrada(JTextArea tPEncontrada) {
		this.tPEncontrada = tPEncontrada;
	}

	public JButton getbBpartida() {
		return bBpartida;
	}

	public void setbBpartida(JButton bBpartida) {
		this.bBpartida = bBpartida;
	}

	public JButton getbRcrud() {
		return bRcrud;
	}

	public void setbRcrud(JButton bRcrud) {
		this.bRcrud = bRcrud;
	}

}
