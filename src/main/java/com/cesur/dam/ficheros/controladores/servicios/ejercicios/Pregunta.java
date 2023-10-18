package com.cesur.dam.ficheros.controladores.servicios.ejercicios;

import java.util.ArrayList;

public class Pregunta {
	protected String preguntas;
	protected ArrayList<Respuesta> respuestas = new ArrayList <Respuesta>();
	protected boolean multiple;
	
	

	
	
	public String getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}
	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
	public boolean isMultiple() {
		return multiple;
	}
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}

	
	
	public Pregunta(String preguntas, ArrayList<Respuesta> respuestas, boolean multiple) {
		super();
		this.preguntas = preguntas;
		this.respuestas = respuestas;
		this.multiple = multiple;
	}
	public Pregunta() {
		// TODO Auto-generated constructor stub
		
	}

	
}






