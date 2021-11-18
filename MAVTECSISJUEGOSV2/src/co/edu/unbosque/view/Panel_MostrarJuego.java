package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Panel_MostrarJuego extends JPanel{

	private JLabel lJuegos;
	private JTextArea tJuego;
	private JButton bMJuego;
	
	
	public Panel_MostrarJuego() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		Border border = new LineBorder(Color.BLACK, 2, true);
		TitledBorder tb = new TitledBorder(border, " Mostrar Juegos ");
		Font fuente = new Font("Tahoma", Font.BOLD, 10);
		tb.setTitleFont(fuente);
		tb.setTitleColor(Color.BLACK);
		setBorder(tb);
		lJuegos = new JLabel(" Las juegos registrad0s son: ");
		lJuegos.setBounds(150,15 , 250, 40);
		add(lJuegos);
		tJuego = new JTextArea();
		tJuego.setBounds(30,50,430,230);
		add(tJuego);
		bMJuego= new JButton("Menú Juego");
		bMJuego.setBounds(300, 300, 150, 40);
		bMJuego.setActionCommand("REGRESAR A JUEGO");
		add(bMJuego);
	}

	public JLabel getlJuegos() {
		return lJuegos;
	}

	public void setlJuegos(JLabel lJuegos) {
		this.lJuegos = lJuegos;
	}

	public JTextArea gettJuego() {
		return tJuego;
	}

	public void settJuego(JTextArea tJuego) {
		this.tJuego = tJuego;
	}

	public JButton getbMJuego() {
		return bMJuego;
	}

	public void setbMJuego(JButton bMJuego) {
		this.bMJuego = bMJuego;
	}
	
	
}
