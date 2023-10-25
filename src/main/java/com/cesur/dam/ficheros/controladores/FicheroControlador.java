package com.cesur.dam.ficheros.controladores;


import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cesur.dam.ficheros.controladores.servicios.FicheroServicios;
import com.cesur.dam.ficheros.controladores.servicios.ejercicios.ficheros.Fichero;

@Controller
public class FicheroControlador {
	
	@ResponseBody
	@GetMapping("abrirFichero") //localhost:8080/abrirfichero, este es el url
	public String abrirFichero(String nombre) {
		return FicheroServicios.abrirFichero(nombre);

	}
	
	@ResponseBody
	@GetMapping("listarFichero") //localhost:8080/listarfichero, este es el url
	public String listarFichero(String nombre) {
		return FicheroServicios.listarFichero(nombre);
	}
	
	@ResponseBody
	@GetMapping("listarFichero2")
	public ArrayList<Fichero> listarFichero2(String nombre) {
		System.out.println("listarFichero2");
		return new FicheroServicios().listarFichero2(nombre);
	}
	
	@ResponseBody
	@GetMapping("listarFicheroMap")
	public HashMap<String, Fichero> listarFicheroMap(String nombre) {
		return new FicheroServicios().listarFicheroMap(nombre);

	}
	
	@ResponseBody
	@GetMapping("MostrarHashMap")
	public HashMap<String, Fichero> MostrarHashMap(String nombre) {
		HashMap<String, Fichero> verhashmap = new FicheroServicios().MostrarHashMap(nombre);
		
		for(String i: verhashmap.keySet()) {
			System.out.println("---------------------------------------");
			System.out.println(verhashmap.get(i).getNombre()+": {");
			System.out.println("   Nombre: "+verhashmap.get(i).getNombre());
			System.out.println("   Directorio: "+verhashmap.get(i).isEsdirectorio());
			System.out.println("   Ruta: "+verhashmap.get(i).getAbsolutepath());
			System.out.println("}");
		}
		
		return new FicheroServicios().listarFicheroMap(nombre);

	}
	
	
	//ver el fichero de un fichero
	@ResponseBody
	@GetMapping("RellenarFichero")
	public HashMap<String, Fichero> RellenarFichero(String nombre) {
		HashMap<String, Fichero> verhashmap = new FicheroServicios().MostrarHashMap(nombre);
		
		for(String i: verhashmap.keySet()) {
			System.out.println("---------------------------------------");
			System.out.println(verhashmap.get(i).getNombre()+": {");
			System.out.println("   Nombre: "+verhashmap.get(i).getNombre());
			System.out.println("   Directorio: "+verhashmap.get(i).isEsdirectorio());
			System.out.println("   Ruta: "+verhashmap.get(i).getAbsolutepath());
			System.out.println("}");
		}
		
		return new FicheroServicios().listarFicheroMap(nombre);

	}
}















