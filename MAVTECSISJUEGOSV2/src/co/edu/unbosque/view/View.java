package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class View extends JFrame{


	private Panel_AgregarPartida pAP;
	private PanelInicio pInicio;
	private Panel_BucarPartida pBP;
	private PanelJuego pJuego;
	private PJugador pjugador;
	private PJugador2 pjugador2;
	private Panel_CrudPartida pCrudPartida;
	
	
	public Panel_MostrarPartida getpMP() {
		return pMP;
	}

	public void setpMP(Panel_MostrarPartida pMP) {
		this.pMP = pMP;
	}

	private Panel_MostrarPartida pMP;

	public PanelJuego getpJuego() {
		return pJuego;
	}

	public void setpJuego(PanelJuego pJuego) {
		this.pJuego = pJuego;
	}

	public View() {

		setSize(500,400);
		setResizable(false);
		setTitle("Sistema de información de juegos"); //tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
		setVisible(true);
		setLocationRelativeTo(null);
		inicializarComponentes();



	}
	public void MostrarMensaje(String Mensaje) {
		JOptionPane.showMessageDialog(null, Mensaje);
	}

	public void inicializarComponentes() {
		pInicio = new PanelInicio();
		pInicio.setBounds(0,0,500,500);
		getContentPane().add(pInicio);

		pAP= new Panel_AgregarPartida();
		pAP.setBounds(10, 10, 200, 200);
		getContentPane().add(pAP);

		pBP= new Panel_BucarPartida();
		pBP.setBounds(10, 10, 200, 200);
		getContentPane().add(pBP);

		pJuego = new PanelJuego();
		pJuego.setBounds(10, 10, 200, 200);
		getContentPane().add(pJuego);


		pjugador= new PJugador();
		pjugador.setBounds(10,10,500,500);
		getContentPane().add(pjugador);

		pjugador2= new PJugador2();
		pjugador2.setBounds(10,10,500,500);
		getContentPane().add(pjugador2);
		
		pCrudPartida = new Panel_CrudPartida();
		pCrudPartida.setBounds(10,10,500,500);
		getContentPane().add(pCrudPartida);
		
		pMP = new Panel_MostrarPartida();
		pMP.setBounds(10,10,500,500);
		getContentPane().add(pMP);

	}

	public Panel_CrudPartida getpCrudPartida() {
		return pCrudPartida;
	}

	public void setpCrudPartida(Panel_CrudPartida pCrudPartida) {
		this.pCrudPartida = pCrudPartida;
	}

	public PJugador2 getPjugador2() {
		return pjugador2;
	}

	public void setPjugador2(PJugador2 pjugador2) {
		this.pjugador2 = pjugador2;
	}


	public Panel_BucarPartida getpBP() {
		return pBP;
	}

	public void setpBP(Panel_BucarPartida pBP) {
		this.pBP = pBP;
	}

	public PJugador getPjugador() {
		return pjugador;
	}

	public void setPjugador(PJugador pjugador) {
		this.pjugador = pjugador;
	}

	public PanelInicio getpInicio() {
		return pInicio;
	}

	public void setpInicio(PanelInicio pInicio) {
		this.pInicio = pInicio;
	}

	public Panel_AgregarPartida getpAP() {
		return pAP;
	}

	public void setpAP(Panel_AgregarPartida pAP) {
		this.pAP = pAP;
	}

}
