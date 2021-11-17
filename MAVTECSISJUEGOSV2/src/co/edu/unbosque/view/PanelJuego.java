package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.colorchooser.ColorChooserComponentFactory;

public class PanelJuego extends JPanel{

	private JLabel tIntro;
	private JLabel tNombreJuego;
	private JLabel tTipoJuego;
	private JTextField tNomJuego;
	private JTextField tTipJuego;
	private JButton bGuardar;
	private JButton bRegresar;
	
	public PanelJuego() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.lightGray);
		
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " INTRODUCCIÓN");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		
		tIntro = new JLabel(" Bienvenido a nuestro Arcade ");
		tIntro.setBounds(150, 15, 1000, 30);
		add(tIntro);
		
		tNombreJuego = new JLabel(" Nombre del juego ");
		tNombreJuego.setBounds(30,70,520,30);
		add(tNombreJuego);
		
		tTipoJuego = new JLabel(" Tipo del juego ");
		tTipoJuego.setBounds(30,140,520,30);
		add(tTipoJuego);
		
		tNomJuego = new JTextField();
		tNomJuego.setBounds(150,70,300,30);
		add(tNomJuego);
		
		tTipJuego = new JTextField();	
		tTipJuego.setBounds(150,140,300,30);
		add(tTipJuego);
		
		bGuardar = new JButton("Guardar");
		bGuardar.setBounds(30,230,200,100);
		bGuardar.setActionCommand("GUARDAR DATOS");
		add(bGuardar);
		
		bRegresar = new JButton("Regresar");
		bRegresar.setBounds(250,230,200,100);
		bRegresar.setActionCommand("REGRESAR AL INICIO");
		add(bRegresar);
	}

	
	
	public JButton getbRegresar() {
		return bRegresar;
	}

	public void setbRegresar(JButton bRegresar) {
		this.bRegresar = bRegresar;
	}

	public JLabel gettIntro() {
		return tIntro;
	}

	public void settIntro(JLabel tIntro) {
		this.tIntro = tIntro;
	}

	public JLabel gettNombreJuego() {
		return tNombreJuego;
	}

	public void settNombreJuego(JLabel tNombreJuego) {
		this.tNombreJuego = tNombreJuego;
	}

	public JLabel gettTipoJuego() {
		return tTipoJuego;
	}

	public void settTipoJuego(JLabel tTipoJuego) {
		this.tTipoJuego = tTipoJuego;
	}

	public JTextField gettNomJuego() {
		return tNomJuego;
	}

	public void settNomJuego(JTextField tNomJuego) {
		this.tNomJuego = tNomJuego;
	}

	public JTextField gettTipJuego() {
		return tTipJuego;
	}

	public void settTipJuego(JTextField tTipJuego) {
		this.tTipJuego = tTipJuego;
	}

	public JButton getbGuardar() {
		return bGuardar;
	}

	public void setbGuardar(JButton bGuardar) {
		this.bGuardar = bGuardar;
	}

}
