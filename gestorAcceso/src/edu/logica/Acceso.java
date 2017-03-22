package edu.logica;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Acceso implements IControlAcceso{

	@Override
	public void controlarAcceso() {
		JOptionPane.showMessageDialog(new Frame(),"ejecutando "+getClass().getSimpleName());
		
	}
	

}
