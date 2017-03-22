package edu.presentacion;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaEncuestaServicio extends javax.swing.JFrame{
	
	private JPanel contenidoEncuesta;
	private JLabel LbTitulo;
	private JLabel LbPreguntas;
	private JLabel LbPreguntaUno;
	private JLabel LbPreguntaDos;
	private JLabel LbPreguntaTres;
	private JComboBox evaluacionUno;
	private JComboBox evaluacionDos;
	private JComboBox evaluacionTres;
	private JButton btnEnviar;
	private Modelo modelo;
	
	public VistaEncuestaServicio(){
	
	}
	
	public VistaEncuestaServicio(Modelo modelo){
		this.modelo=modelo;
		generarComponentes();
	
	}
	public void generarVentana(){
		//generarComponentes();
		//this.setVisible(true);//pasar al modelo
		//JOptionPane.showMessageDialog(new JFrame(), "Encuesta Calidad");
	}
	public void generarComponentes(){
		this.setTitle("Encuesta Servicio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 570, 360);
		contenidoEncuesta = new JPanel();
		contenidoEncuesta.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenidoEncuesta.setBackground(Color.white);
		setContentPane(contenidoEncuesta);
		contenidoEncuesta.setLayout(null);
		
		LbTitulo= new JLabel("ENCUESTA DE SERVICIO");
		LbTitulo.setBounds(280,10,200,40);
		contenidoEncuesta.add(LbTitulo);
		
		LbPreguntas= new JLabel("Siendo 1 el peor nivel servicio y 5 el mejor nivel de servicio, "
				+ "evalue los siguiente aspectos:");
		LbPreguntas.setBounds(10,50,550,40);
		contenidoEncuesta.add(LbPreguntas);
		
		LbPreguntaUno= new JLabel("Amabilidad de las personas que entregan el almuerzo");
		LbPreguntaUno.setBounds(50,100,400,50);
		contenidoEncuesta.add(LbPreguntaUno);
		
		LbPreguntaDos= new JLabel("Tiempo utilizado en el proceso de ingreso y despacho del almuerzo");
		LbPreguntaDos.setBounds(50, 150, 400, 50);
		contenidoEncuesta.add(LbPreguntaDos);
		
		LbPreguntaTres= new JLabel("Limpieza en la zona de despacho");
		LbPreguntaTres.setBounds(50, 200, 400, 50);
		contenidoEncuesta.add(LbPreguntaTres);
		
		evaluacionUno = new JComboBox();
		evaluacionUno.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(evaluacionUno);
        evaluacionUno.setBounds(440, 105, 100, 40);
        
        evaluacionDos = new JComboBox();
		evaluacionDos.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(evaluacionDos);
        evaluacionDos.setBounds(440, 155, 100, 40);
        
        evaluacionTres = new JComboBox();
		evaluacionTres.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(evaluacionTres);
        evaluacionTres.setBounds(440, 205, 100, 40);
        
        btnEnviar = new JButton();
		btnEnviar.setText("Enviar");
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(300, 260, 80, 40);
        
	}
	
	public JPanel getContenidoEncuesta() {
		return contenidoEncuesta;
	}
	public JLabel getLbTitulo() {
		return LbTitulo;
	}
	public JLabel getLbPreguntaUno() {
		return LbPreguntaUno;
	}
	public JLabel getLbPreguntaDos() {
		return LbPreguntaDos;
	}
	public JLabel getLbPreguntaTres() {
		return LbPreguntaTres;
	}
	public JComboBox getEvaluacionUno() {
		return evaluacionUno;
	}
	public JComboBox getEvaluacionDos() {
		return evaluacionDos;
	}
	public JComboBox getEvaluacionTres() {
		return evaluacionTres;
	}
	public JButton getBtnEnviar() {
		return btnEnviar;
	}
	

}
