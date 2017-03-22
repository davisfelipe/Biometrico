package edu.cableado;

import javax.swing.JOptionPane;

import edu.logica.IControlCalidad;

public abstract class ABiometrico{
	IControlCalidad calidad;
	
	public ABiometrico(IControlCalidad calidad){
		super();
		this.calidad=calidad;
	}
	
	public void biometrico(){
		calidad.controlarCalidad();
	}
}
