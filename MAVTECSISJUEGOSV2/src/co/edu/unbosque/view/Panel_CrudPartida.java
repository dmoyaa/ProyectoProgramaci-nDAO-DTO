package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_CrudPartida extends JPanel{
	
	private JButton botonAp;
	private JButton botonLp;
	private JButton botonBp;
	private JButton regresarCrud;
	
	public Panel_CrudPartida() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		setLayout(new GridLayout(2,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~SISTEMA DE PARTIDAS~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		botonAp = new JButton("Agregar Partida");
		botonAp.setFont(fuente);
		botonAp.setBackground(Color.black);
		botonAp.setForeground(Color.white);
		botonAp.setActionCommand("AGREGAR PARTIDA");
		add(botonAp);
		botonBp = new JButton("Buscar Partida");
		botonBp.setFont(fuente);
		botonBp.setForeground(Color.white);
		botonBp.setBackground(Color.black);
		botonBp.setActionCommand("BUSCAR PARTIDA");
		add(botonBp);
		botonLp = new JButton("Leer Partidas");
		botonLp.setFont(fuente);
		botonLp.setForeground(Color.white);
		botonLp.setBackground(Color.black);
		botonLp.setActionCommand("LEER PARTIDAS");
		add(botonLp);
		regresarCrud = new JButton("Regresar");
		regresarCrud.setActionCommand("REGRESAR CRUD");
		add(regresarCrud);
	}

	public JButton getBotonAp() {
		return botonAp;
	}

	public void setBotonAp(JButton botonAp) {
		this.botonAp = botonAp;
	}

	public JButton getBotonLp() {
		return botonLp;
	}

	public void setBotonLp(JButton botonLp) {
		this.botonLp = botonLp;
	}

	public JButton getBotonBp() {
		return botonBp;
	}

	public void setBotonBp(JButton botonBp) {
		this.botonBp = botonBp;
	}

	public JButton getRegresarCrud() {
		return regresarCrud;
	}

	public void setRegresarCrud(JButton regresarCrud) {
		this.regresarCrud = regresarCrud;
	}

}
