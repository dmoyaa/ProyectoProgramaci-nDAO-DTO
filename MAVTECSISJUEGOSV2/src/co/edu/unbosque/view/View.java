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
	private Panel_CrudPartida pCrudPartida;
	private Panel_BuscarJuego pBJ;
	private Panel_MostrarJuego pMJ;
	private Panel_AgregarJuego pAJ;
	private Panel_CrudJuego pCrudJuego;
	private PJugador pjugador;
	private PanelOpciones pOpciones;
	
	
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

		pAJ= new Panel_AgregarJuego();
		pAJ.setBounds(10, 10, 200, 200);
		getContentPane().add(pAJ);		
		
		pBP= new Panel_BucarPartida();
		pBP.setBounds(10, 10, 200, 200);
		getContentPane().add(pBP);

		pBJ = new Panel_BuscarJuego();
		pBJ.setBounds(10, 10, 200, 200);
		getContentPane().add(pBJ);
		
		pMJ = new Panel_MostrarJuego();
		pMJ.setBounds(10, 10, 200, 200);
		getContentPane().add(pMJ);
		
		pJuego = new PanelJuego();
		pJuego.setBounds(10, 10, 200, 200);
		getContentPane().add(pJuego);

		pjugador= new PJugador();
		pjugador.setBounds(10,10,500,500);
		getContentPane().add(pjugador);

		
		
		pCrudPartida = new Panel_CrudPartida();
		pCrudPartida.setBounds(10,10,500,500);
		getContentPane().add(pCrudPartida);
		
		pMP = new Panel_MostrarPartida();
		pMP.setBounds(10,10,500,500);
		getContentPane().add(pMP);

		pCrudJuego = new Panel_CrudJuego();
		pCrudJuego.setBounds(10,10,500,500);
		getContentPane().add(pCrudJuego);
		
		pjugador= new PJugador();
		pjugador.setBounds(10,10,500,500);
		getContentPane().add(pjugador);

		
		pOpciones= new PanelOpciones();
		pOpciones.setBounds(10,10,500,500);
		getContentPane().add(pOpciones);
		
		
	}

	public Panel_BuscarJuego getpBJ() {
		return pBJ;
	}

	public void setpBJ(Panel_BuscarJuego pBJ) {
		this.pBJ = pBJ;
	}

	public Panel_MostrarJuego getpMJ() {
		return pMJ;
	}

	public void setpMJ(Panel_MostrarJuego pMJ) {
		this.pMJ = pMJ;
	}

	public Panel_AgregarJuego getpAJ() {
		return pAJ;
	}

	public void setpAJ(Panel_AgregarJuego pAJ) {
		this.pAJ = pAJ;
	}

	public Panel_CrudJuego getpCrudJuego() {
		return pCrudJuego;
	}

	public void setpCrudJuego(Panel_CrudJuego pCrudJuego) {
		this.pCrudJuego = pCrudJuego;
	}

	public Panel_CrudPartida getpCrudPartida() {
		return pCrudPartida;
	}

	public void setpCrudPartida(Panel_CrudPartida pCrudPartida) {
		this.pCrudPartida = pCrudPartida;
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

	public PanelOpciones getpOpciones() {
		return pOpciones;
	}

	public void setpOpciones(PanelOpciones pOpciones) {
		this.pOpciones = pOpciones;
	}
	

}
