package com.cesur.dam.ficheros.controladores.servicios.ejercicios.ficheros;



public class Fichero {

	String nombre;
	boolean esdirectorio;
	String absolutepath;

	public Fichero(String nombre, boolean esdirectorio, String absolutepath) {
		super();
		this.nombre = nombre;
		this.esdirectorio = esdirectorio;
		this.absolutepath = absolutepath;
	}

	public Fichero() {
		super();
	}

 

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsdirectorio() {
		return esdirectorio;
	}
	public void setEsdirectorio(boolean esdirectorio) {
		this.esdirectorio = esdirectorio;
	}

	public String getAbsolutepath() {
		return absolutepath;
	}
	public void setAbsolutepath(String absolutepath) {
		this.absolutepath = absolutepath;
	}


}


