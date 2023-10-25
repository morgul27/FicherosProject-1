package com.cesur.dam.ficheros.controladores.servicios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cesur.dam.ficheros.controladores.servicios.ejercicios.ficheros.Fichero;

@Service
public class FicheroServicios {
	@ResponseBody
	@GetMapping("abrirFichero") // localhost:8080/abrirfichero, este es el url

	public static String abrirFichero(String nombre) {

		File fichero = new File("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\AD\\" + nombre);

		if (fichero.exists()) {
			if (fichero.isDirectory()) {
				return "Es directorio";

			} else {
				return "Es fichero";
			}

		} else {
			try {
				fichero.createNewFile(); //esto es para crear el archivo en el caso de que no exista
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return "se ha creado el archivo";

		}

	}
	
	@ResponseBody
	@GetMapping("listarFichero")
	public static String listarFichero(String nombre) {
		File fichero = new File("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\"+nombre);
		String listaficheros = "";
		File array[] = fichero.listFiles();
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i].getName());
			listaficheros=listaficheros + array[i].getName() + ", ";
		}
		
		return listaficheros;
	}
	
	
	@ResponseBody
	@GetMapping("listarFichero2")
	public ArrayList<Fichero> listarFichero2(String nombre) {
		ArrayList<Fichero>listaficheros=new ArrayList<Fichero>();
		File f = new File("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\" + nombre);
		
		File[] flista = f.listFiles();
		String cadena = "Es un directorio y cntiene: ";
		String nombres;
		boolean esdirectorio;
		String rutaabs;
		for (int x = 0; x < flista.length; x++) {
			
			nombres=flista[x].getName();
			esdirectorio=flista[x].isDirectory();
			rutaabs=flista[x].getAbsolutePath();
			
			listaficheros.add(new Fichero(nombres,esdirectorio,rutaabs));
		
		}
		return listaficheros;
	}
	
	@ResponseBody
	@GetMapping("listarFicheroMap")
	public HashMap <String, Fichero> listarFicheroMap(String nombre) {
		ArrayList<Fichero>listaficheros=new ArrayList<Fichero>();
		HashMap <String, Fichero> mapafichero = new HashMap<String,Fichero>();
		File f = new File("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\" + nombre);
		
		File[] flista = f.listFiles();
		String cadena = "Es un directorio y contiene: ";
		String nombres = "";
		boolean esdirectorio = false;
		String rutaabs = "";
		
		for (int x = 0; x < flista.length; x++) {
			
			nombres=flista[x].getName();
			esdirectorio=flista[x].isDirectory();
			rutaabs=flista[x].getAbsolutePath();
			
			mapafichero.put(nombres,new Fichero(nombres,esdirectorio,rutaabs));
		
		}
		
		return mapafichero;
	}
	
	
	@ResponseBody
	@GetMapping("MostrarHashMap")
	public HashMap <String, Fichero> MostrarHashMap(String nombre) {
		ArrayList<Fichero>listaficheros=new ArrayList<Fichero>();
		HashMap <String, Fichero> mapafichero = new HashMap<String,Fichero>();
		File f = new File("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\" + nombre);
		
		File[] flista = f.listFiles();
		String cadena = "Es un directorio y contiene: ";
		String nombres = "";
		boolean esdirectorio = false;
		String rutaabs = "";
		
		for (int x = 0; x < flista.length; x++) {
			
			nombres=flista[x].getName();
			esdirectorio=flista[x].isDirectory();
			rutaabs=flista[x].getAbsolutePath();
			
			mapafichero.put(nombres,new Fichero(nombres,esdirectorio,rutaabs));
			
			
		}
		
		return mapafichero;
	}
	/*
	@ResponseBody
	@GetMapping("RellenarFichero")
	public HashMap <String, ArrayList<Fichero>> RellenarFichero(String nombre) {
		ArrayList<Fichero>listaficheros=new ArrayList<Fichero>();
		HashMap <String, Fichero> mapafichero = new HashMap<String,Fichero>();
		File f = new File("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\" + nombre);
		
		File[] flista = f.listFiles();
		String cadena = "Es un directorio y contiene: ";
		String nombres = "";
		boolean esdirectorio = false;
		String rutaabs = "";
		
		for (int x = 0; x < flista.length; x++) {
			
			nombres=flista[x].getName();
			esdirectorio=flista[x].isDirectory();
			rutaabs=flista[x].getAbsolutePath();
			
			mapafichero.put(nombres,new Fichero(nombres,esdirectorio,rutaabs));
			

		}

		return mapafichero;
	}
	 */

}








