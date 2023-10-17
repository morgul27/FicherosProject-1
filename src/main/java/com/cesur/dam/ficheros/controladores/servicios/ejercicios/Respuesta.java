package com.cesur.dam.ficheros.controladores.servicios.ejercicios;


public class Respuesta {
	protected String respuestas;
	boolean correcta;
	
	
	public String getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}
	

	public Respuesta(String respuestas, boolean correcta) {
		this.respuestas = respuestas;
		this.correcta = correcta;
	}


	public Respuesta() {
			
	}

	
}
