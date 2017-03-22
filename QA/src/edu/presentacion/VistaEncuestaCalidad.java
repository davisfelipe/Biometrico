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

public class VistaEncuestaCalidad extends JFrame {	

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
	private ControladorEncuestaCalidad controladorEncuestaCalidad;
	private Modelo modelo;
	
	public VistaEncuestaCalidad(Modelo modelo){
		this.modelo=modelo;
		generarComponentes();
		//capturarEventos();
	
	}
	
	public void generarVentana(){
		//generarComponentes();
		//this.setVisible(true);//pasar al modelo
		//JOptionPane.showMessageDialog(new JFrame(), "Encuesta Calidad");
	}
	public void generarComponentes(){
		this.setTitle("Encuesta Calidad");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 360);
		contenidoEncuesta = new JPanel();
		contenidoEncuesta.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenidoEncuesta.setBackground(Color.white);
		setContentPane(contenidoEncuesta);
		contenidoEncuesta.setLayout(null);
		
		LbTitulo= new JLabel("ENCUESTA DE CALIDAD");
		LbTitulo.setBounds(180,10,150,40);
		contenidoEncuesta.add(LbTitulo);
		
		LbPreguntas= new JLabel("Siendo 1 la peor calidad y 5 la mejor calidad, "
				+ "evalue los siguiente aspectos:");
		LbPreguntas.setBounds(10,50,470,40);
		contenidoEncuesta.add(LbPreguntas);
		
		
		LbPreguntaUno= new JLabel("Cantidad de porción de cada uno de los alimentos");
		LbPreguntaUno.setBounds(50,100,300,50);
		contenidoEncuesta.add(LbPreguntaUno);
		
		LbPreguntaDos= new JLabel("Variedad de alimentos a lo largo de la semana");
		LbPreguntaDos.setBounds(50, 150, 300, 50);
		contenidoEncuesta.add(LbPreguntaDos);
		
		LbPreguntaTres= new JLabel("Sabor y textura de los alimentos");
		LbPreguntaTres.setBounds(50, 200, 300, 50);
		contenidoEncuesta.add(LbPreguntaTres);
		
		evaluacionUno = new JComboBox();
		evaluacionUno.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(evaluacionUno);
        evaluacionUno.setBounds(370, 105, 100, 40);
        
        evaluacionDos = new JComboBox();
		evaluacionDos.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(evaluacionDos);
        evaluacionDos.setBounds(370, 155, 100, 40);
        
        evaluacionTres = new JComboBox();
		evaluacionTres.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(evaluacionTres);
        evaluacionTres.setBounds(370, 205, 100, 40);
        
        btnEnviar = new JButton();
		btnEnviar.setText("Enviar");
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(200, 260, 80, 40);
        
		
		
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
