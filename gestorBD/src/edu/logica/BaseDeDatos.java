package edu.logica;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class BaseDeDatos implements IControlBD {

	@Override
	public void controlarBD() {
		JOptionPane.showMessageDialog(new Frame(),"ejecutando "+getClass().getSimpleName());
		
	}
	
}
