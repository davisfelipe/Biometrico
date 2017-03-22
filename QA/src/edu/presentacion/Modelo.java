package edu.presentacion;

import java.io.ObjectInputStream.GetField;

import edu.logica.IControlCalidad;

public class Modelo implements IControlCalidad {
	private VistaEncuestaCalidad vistaEncuestaCalidad;
	private VistaEncuestaServicio vistaEncuestaServicio;
	private vistaQAGlobal vistaQAGlobal;
	
	
	
	public Modelo(){
		
	}
	public void levantarVistaEncuestaCalidad(){
		getVistaEncuestaCalidad().setVisible(true);
	}
	
	public VistaEncuestaCalidad getVistaEncuestaCalidad(){
		
		if(vistaEncuestaCalidad == null){
			vistaEncuestaCalidad = new VistaEncuestaCalidad(this);
			vistaEncuestaCalidad.setLocation(10, 10);
		}
		return vistaEncuestaCalidad;
	}
	
	public void levantarVistaEncuestaServicio(){
		getVistaEncuestaServicio().setVisible(true);
	}
	
	public VistaEncuestaServicio getVistaEncuestaServicio(){
		
		if(vistaEncuestaServicio == null){
			vistaEncuestaServicio = new VistaEncuestaServicio(this);
			vistaEncuestaServicio.setLocation(10, 10);
		}
		return vistaEncuestaServicio;
	}
	
	public vistaQAGlobal getVistaQAGlobal(){
		if(vistaQAGlobal == null){
			vistaQAGlobal = new vistaQAGlobal(this);
			vistaQAGlobal.setLocation(10, 10);
		}
		return vistaQAGlobal;
	}
	public void levantarVistaGlobal(){
		getVistaQAGlobal().setVisible(true);
	}
	@Override
	public void controlarCalidad() {
		// TODO Auto-generated method stub
		levantarVistaGlobal();
		
		
	}
	

}
