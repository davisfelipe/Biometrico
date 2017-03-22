package edu.presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControladorEncuestaServicio implements ActionListener {
	private VistaEncuestaServicio ventana;
	
	public ControladorEncuestaServicio(VistaEncuestaServicio v) {
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
