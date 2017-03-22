package edu.logica;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Administrador implements IAdministrador {

	@Override
	public void administrar() {
		JOptionPane.showMessageDialog(new Frame(),"ejecutando "+getClass().getSimpleName());
		
	}

}
