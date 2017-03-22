package edu.repositorio;

import java.awt.Frame;

import javax.swing.JOptionPane;

import edu.logica.IConexion;

public class ConexionBD implements IConexion{

	@Override
	public void conectarDatos() {
		JOptionPane.showMessageDialog(new Frame(),"Conectando a los datos");
		
	}
	

}
