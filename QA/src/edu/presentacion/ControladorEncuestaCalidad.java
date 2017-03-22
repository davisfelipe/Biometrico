package edu.presentacion;

import java.awt.event.*;

import javax.swing.JButton;
public class ControladorEncuestaCalidad implements ActionListener {
	private VistaEncuestaCalidad ventana;
	
	public ControladorEncuestaCalidad(VistaEncuestaCalidad v) {
		this.ventana = v;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton boton= (JButton)e.getSource();
		if(boton.equals(ventana.getBtnEnviar())){
			//utilizar la logica para armar el archivo plano con la encuesta
		}
		
	}

}
