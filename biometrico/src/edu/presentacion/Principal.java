package edu.presentacion;

import edu.cableado.Biometrico;
import edu.logica.IControlCalidad;

public class Principal {

	public static void main(String[] args) {
		
		//Biometrico biometrico = new Biometrico();
		Cargador cargador = new Cargador();
		cargador.cargar(new String[]{"componente/capaPresentacion","componente/capaReglaNegocio","componente/capaRepositorio"});
		try {
			new Biometrico((IControlCalidad)cargador.cargarComponente("edu.presentacion.Modelo").newInstance()).biometrico();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
