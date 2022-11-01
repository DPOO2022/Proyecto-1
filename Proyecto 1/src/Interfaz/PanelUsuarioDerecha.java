package Interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelUsuarioDerecha extends JPanel{

	private VentanaUsuario padre;
	
	private JLabel presupuesto;
	private JLabel capitan;
	
	private JTextField campoPresupuesto;
	private JTextField campoCapitan;
	
	public PanelUsuarioDerecha(VentanaUsuario papa) {
		
		padre = papa;
		
		presupuesto = new JLabel("Presupuesto");
		presupuesto.setPreferredSize(new Dimension(70,50));
		capitan = new JLabel("Capitan");
		capitan.setPreferredSize(new Dimension(70,50));
		
		campoPresupuesto = new JTextField();
		campoPresupuesto.setPreferredSize(new Dimension(70,10));
		campoPresupuesto.setEditable(false);
		campoCapitan= new JTextField();
		campoCapitan.setPreferredSize(new Dimension(70,10));
		campoCapitan.setEditable(false);
		
		setLayout(new GridLayout(4,1));
		add(presupuesto);
		add(campoPresupuesto);
		add(capitan);
		add(campoCapitan);
		
	}
	
}
