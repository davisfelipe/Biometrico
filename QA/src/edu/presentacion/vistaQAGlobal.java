package edu.presentacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class vistaQAGlobal extends JFrame{
	private JPanel contenido;
	private JButton btnEncCalidad; 
	private JButton btnEncServicio; 
	private Modelo modelo;
	private ControladorQAGlobal controladorQAGlobal;
	
	public vistaQAGlobal(Modelo modelo){
		this.modelo=modelo;
		cargarComponentes();
		capturarEventos();
	}
	
	public void cargarComponentes(){
		this.setTitle("ENCUESTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contenido = new JPanel();
		contenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenido.setBackground(Color.white);
		setContentPane(contenido);
		contenido.setLayout(null);
		
		btnEncCalidad = new JButton();
		btnEncCalidad.setText("Encuesta Calidad");
        getContentPane().add(btnEncCalidad);
        btnEncCalidad.setBounds(50, 50, 200, 30);
        
        btnEncServicio = new JButton();
		btnEncServicio.setText("Encuesta Servicio");
        getContentPane().add(btnEncServicio);
        btnEncServicio.setBounds(50, 120, 200, 30);
        
	}
	
	public ControladorQAGlobal getControladorQAGlobal(){
		if(controladorQAGlobal==null){
			controladorQAGlobal= new ControladorQAGlobal(this);
		}
		return controladorQAGlobal;
	}
	
	public void capturarEventos(){
		btnEncCalidad.addActionListener(getControladorQAGlobal());
		btnEncServicio.addActionListener(getControladorQAGlobal());
	}

	public JPanel getContenido() {
		return contenido;
	}

	public JButton getBtnEncCalidad() {
		return btnEncCalidad;
	}

	public JButton getBtnEncServicio() {
		return btnEncServicio;
	}

	public Modelo getModelo() {
		return modelo;
	}
	
	

}
