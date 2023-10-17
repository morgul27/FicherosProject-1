package com.cesur.dam.ficheros.controladores.servicios.ejercicios;

import java.util.ArrayList;

public class Pregunta {
	protected ArrayList<String> preguntas = new ArrayList <String>();
	protected ArrayList<Respuesta> respuestas = new ArrayList <Respuesta>();
	protected boolean multiple;
	
	
	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<String> preguntas) {
		this.preguntas = preguntas;
	}


	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}


	public Pregunta() {
		// TODO Auto-generated constructor stub
		
	}


	public Pregunta(ArrayList<String> preguntas, ArrayList<Respuesta> respuestas, boolean multiple) {
		this.preguntas = preguntas;
		this.respuestas = respuestas;
		this.multiple = multiple;
	}

	
}






