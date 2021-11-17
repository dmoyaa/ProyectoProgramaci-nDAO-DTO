package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.text.*;

public class PJugador2 extends JPanel{

	private JButton Bregresar;
	private JButton BguardarJ2;
	
	private JLabel nom ;
	private JLabel gen ;
	private JLabel edad ; 
	
	private JTextField nom1;
	private JTextField gen1 ;
	private JTextField edad1;
	

	
	
	
	public PJugador2 () {
		
		initializeComponent();
			setVisible(false);
	}
	
	

	public void initializeComponent() {
		setLayout(new GridLayout(3,2));
		nom = new JLabel("Nombre:");
		add(nom);
		nom1=new JTextField();
		add(nom1);
		gen = new JLabel("Genero:");
		add(gen);
		gen1=new JTextField();
		add(gen1);
		edad = new JLabel("Edad:");
		add(edad);
		edad1=new JTextField();
		add(edad1);
		
		Bregresar=new JButton ("Regresar al menú");
		add(Bregresar);
		
		BguardarJ2 =new JButton ("Guardar Datos J2");
		add(BguardarJ2);
		
		setBackground(Color.LIGHT_GRAY);
		setLayout( new GridLayout(4,2) );
    	Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~JUGADOR 2 ~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
	}
	

public JButton getBregresar() {
		return Bregresar;
	}


	public JButton getBguardarJ2() {
	return BguardarJ2;
}

public void setBguardarJ2(JButton bguardarJ2) {
	BguardarJ2 = bguardarJ2;
}

	public void setBregresar(JButton bregresar) {
		Bregresar = bregresar;
	}


	public JLabel getNom() {
		return nom;
	}

	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	public JLabel getGen() {
		return gen;
	}

	public void setGen(JLabel gen) {
		this.gen = gen;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JTextField getNom1() {
		return nom1;
	}

	public void setNom1(JTextField nom1) {
		this.nom1 = nom1;
	}

	public JTextField getGen1() {
		return gen1;
	}

	public void setGen1(JTextField gen1) {
		this.gen1 = gen1;
	}

	public JTextField getEdad1() {
		return edad1;
	}

	public void setEdad1(JTextField edad1) {
		this.edad1 = edad1;
	}
	
	
}
