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

public class Panel_AgregarPartida extends JPanel{

	private JLabel ltpar;
	private JLabel lnom1;
	private JLabel lnom2;
	private JLabel lid;
	private JButton regresar;
	private JTextField ttpar;
	private JTextField tnom1;
	private JTextField tnom2;
	private JTextField tid;
	private JButton cargarDatos;
	
	
	public Panel_AgregarPartida() {
		setLayout(null);

		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.LIGHT_GRAY);
		setLayout( new GridLayout(5,2) );
    	Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " ~PARTIDA~ ");
		Font fuente = new Font("Tahoma", Font.BOLD, 11);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		lnom1 = new JLabel (" Nombre jugador 1:");
		add(lnom1);
		tnom1 = new JTextField();
		add(tnom1);
		lnom2 = new JLabel (" Nombre jugador 2:");
		add(lnom2);
		tnom2 = new JTextField();
		add(tnom2);
		ltpar= new JLabel(" Ingrese el tipo de partida:");
		add(ltpar);
		ttpar= new JTextField();
		add(ttpar);
		lid = new JLabel(" Ingrese el número de la partida: ");
		add(lid);
		tid = new JTextField();
		add(tid);
		cargarDatos=new JButton("Agregar Partida");
		cargarDatos.setFont(fuente);
		cargarDatos.setForeground(Color.white);
		cargarDatos.setBackground(Color.black);
		cargarDatos.setActionCommand("CARGAR");
		add(cargarDatos);
		regresar= new JButton("Menú partidas");
		regresar.setFont(fuente);
		regresar.setForeground(Color.white);
		regresar.setBackground(Color.black);
		regresar.setActionCommand("REGRESAR");
		add(regresar);
	}

	public JLabel getLtpar() {
		return ltpar;
	}

	public void setLtpar(JLabel ltpar) {
		this.ltpar = ltpar;
	}

	public JLabel getLnom1() {
		return lnom1;
	}

	public void setLnom1(JLabel lnom1) {
		this.lnom1 = lnom1;
	}

	public JLabel getLnom2() {
		return lnom2;
	}

	public void setLnom2(JLabel lnom2) {
		this.lnom2 = lnom2;
	}

	public JLabel getLid() {
		return lid;
	}

	public void setLid(JLabel lid) {
		this.lid = lid;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
	}

	

	public JTextField getTtpar() {
		return ttpar;
	}

	public void setTtpar(JTextField ttpar) {
		this.ttpar = ttpar;
	}


	public JTextField getTnom1() {
		return tnom1;
	}

	public void setTnom1(JTextField tnom1) {
		this.tnom1 = tnom1;
	}

	public JTextField getTnom2() {
		return tnom2;
	}

	public void setTnom2(JTextField tnom2) {
		this.tnom2 = tnom2;
	}

	public JTextField getTid() {
		return tid;
	}

	public void setTid(JTextField tid) {
		this.tid = tid;
	}

	public JButton getCargarDatos() {
		return cargarDatos;
	}

	public void setCargarDatos(JButton cargarDatos) {
		this.cargarDatos = cargarDatos;
	}

	

}