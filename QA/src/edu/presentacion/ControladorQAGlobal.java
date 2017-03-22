package edu.presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControladorQAGlobal implements ActionListener {
	
	private vistaQAGlobal vistaQAGlobal;
	
	public ControladorQAGlobal(vistaQAGlobal vistaQAGlobal) {
		this.vistaQAGlobal=vistaQAGlobal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton boton= (JButton)e.getSource();
		if(boton.equals(vistaQAGlobal.getBtnEncCalidad())){
			//vistaQAGlobal.getModelo().getLogica().metodo(string 1)
			vistaQAGlobal.getModelo().levantarVistaEncuestaCalidad();
		}
		if(boton.equals(vistaQAGlobal.getBtnEncServicio())){
			vistaQAGlobal.getModelo().levantarVistaEncuestaServicio();
		}
	}
	

}
