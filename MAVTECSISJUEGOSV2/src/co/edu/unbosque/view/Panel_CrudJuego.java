package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_CrudJuego extends JPanel {

	private JButton botonAj;
	private JButton botonMj;
	private JButton botonBj;
	private JButton regresarCrudp;
	
	public Panel_CrudJuego() {
		
		inicializarComponentes();
		setVisible(false);
		
	}
	
	public void inicializarComponentes() {
		setLayout(new GridLayout(2,2));
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~SISTEMA DE JUEGO~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		
		botonAj = new JButton("Agregar Juego");
		botonAj.setFont(fuente);
		botonAj.setBackground(Color.black);
		botonAj.setForeground(Color.white);
		botonAj.setActionCommand("AGREGAR JUEGO");
		add(botonAj);
		
		botonMj = new JButton("Mostrar Juego");
		botonMj.setFont(fuente);
		botonMj.setForeground(Color.white);
		botonMj.setBackground(Color.black);
		botonMj.setActionCommand("MOSTRAR JUEGO");
		add(botonMj);
		
		botonBj = new JButton("Buscar Juego");
		botonBj.setFont(fuente);
		botonBj.setForeground(Color.white);
		botonBj.setBackground(Color.black);
		botonBj.setActionCommand("BUSCAR JUEGO");
		add(botonBj);
		
		regresarCrudp = new JButton("Regresar");
		regresarCrudp.setActionCommand("REGRESAR CRUDP");
		add(regresarCrudp);
	}

	public JButton getBotonAj() {
		return botonAj;
	}

	public void setBotonAj(JButton botonAj) {
		this.botonAj = botonAj;
	}

	public JButton getBotonMj() {
		return botonMj;
	}

	public void setBotonMj(JButton botonMj) {
		this.botonMj = botonMj;
	}

	public JButton getBotonBj() {
		return botonBj;
	}

	public void setBotonBj(JButton botonBj) {
		this.botonBj = botonBj;
	}

	public JButton getRegresarCrudp() {
		return regresarCrudp;
	}

	public void setRegresarCrudp(JButton regresarCrudp) {
		this.regresarCrudp = regresarCrudp;
	}
	
	
}
