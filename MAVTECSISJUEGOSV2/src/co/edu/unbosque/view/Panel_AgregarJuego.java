package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_AgregarJuego extends JPanel {

	private JLabel nomJu;
	private JLabel tipJu;
	private JLabel idJu;
	private JButton regresarJ;
	private JButton cargarDatosJuego;
	private JTextField tnomJu;
	private JTextField ttipJu;
	private JTextField tidJu;
	
	public Panel_AgregarJuego() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.LIGHT_GRAY);
		setLayout( new GridLayout(4,2) );
    	Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~JUEGO~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		
		nomJu = new JLabel (" Nombre del juego :");
		add(nomJu);
		tnomJu = new JTextField();
		add(tnomJu);
		tipJu= new JLabel(" Ingrese el tipo de juego :");
		add(tipJu);
		ttipJu= new JTextField();
		add(ttipJu);
		idJu = new JLabel(" Ingrese el número del juego: ");	
		add(idJu);
		tidJu = new JTextField();
		add(tidJu);
		
		cargarDatosJuego=new JButton("Cargar Datos");
		cargarDatosJuego.setFont(fuente);
		cargarDatosJuego.setForeground(Color.white);
		cargarDatosJuego.setBackground(Color.black);
		cargarDatosJuego.setActionCommand("CARGAR DATOS JUEGO");
		add(cargarDatosJuego);
		
		regresarJ= new JButton("Regresar");
		regresarJ.setFont(fuente);
		regresarJ.setForeground(Color.white);
		regresarJ.setBackground(Color.black);
		regresarJ.setActionCommand("REGRESAR MENU");
		regresarJ.setBounds(250,250,220,100);
		add(regresarJ);
	}

	
	public JLabel getIdJu() {
		return idJu;
	}

	public void setIdJu(JLabel idJu) {
		this.idJu = idJu;
	}

	public JButton getRegresarJ() {
		return regresarJ;
	}

	public void setRegresarJ(JButton regresarJ) {
		this.regresarJ = regresarJ;
	}

	public JTextField getTidJu() {
		return tidJu;
	}

	public void setTidJu(JTextField tidJu) {
		this.tidJu = tidJu;
	}

	public JLabel getNomJu() {
		return nomJu;
	}

	public void setNomJu(JLabel nomJu) {
		this.nomJu = nomJu;
	}

	public JLabel getTipJu() {
		return tipJu;
	}

	public void setTipJu(JLabel tipJu) {
		this.tipJu = tipJu;
	}

	public JButton getRegresar() {
		return regresarJ;
	}

	public void setRegresar(JButton regresar) {
		this.regresarJ = regresar;
	}

	public JButton getCargarDatosJuego() {
		return cargarDatosJuego;
	}

	public void setCargarDatosJuego(JButton cargarDatosJuego) {
		this.cargarDatosJuego = cargarDatosJuego;
	}

	public JTextField getTnomJu() {
		return tnomJu;
	}

	public void setTnomJu(JTextField tnomJu) {
		this.tnomJu = tnomJu;
	}

	public JTextField getTtipJu() {
		return ttipJu;
	}

	public void setTtipJu(JTextField ttipJu) {
		this.ttipJu = ttipJu;
	}

	
}
