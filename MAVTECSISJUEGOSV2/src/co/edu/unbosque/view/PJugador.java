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

public class PJugador extends JPanel{

	//private JLabel labEntrada;
	private JButton Botonsig;
	private JButton BotonguardarJ1;
	

	private JLabel nom ;
	private JLabel gen ;
	private JLabel edad ; 
	
	private JTextField nom1;
	private JTextField gen1 ;
	private JTextField edad1;
	
	
	
	public PJugador () {
	//	setLayout(null);
		
		initializeComponent();
			setVisible(false);
	}
	
	//private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	

	//private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	

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
		
		Botonsig=new JButton ("SIGUIENTE JUGADOR");
		add(Botonsig);
		BotonguardarJ1=new JButton ("Guardar Datos J1");
		add(BotonguardarJ1);

		
		setBackground(Color.LIGHT_GRAY);
		setLayout( new GridLayout(4,2) );
    	Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~JUGADOR 1 ~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
	
	}
	
	public JButton getBotonguardarJ1() {
		return BotonguardarJ1;
	}

	public void setBotonguardarJ1(JButton botonguardarJ1) {
		BotonguardarJ1 = botonguardarJ1;
	}
	public JButton getBotonsig() {
		return Botonsig;
	}

	public void setBotonsig(JButton botonsig) {
		this.Botonsig = botonsig;
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