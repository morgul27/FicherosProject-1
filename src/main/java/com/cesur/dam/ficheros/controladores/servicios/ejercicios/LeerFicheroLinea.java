package com.cesur.dam.ficheros.controladores.servicios.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerFicheroLinea {

	public static void main(String[] args) {
		File preguntas = new File ("C:\\Users\\JoséMiguelNavarroDeA\\Desktop\\AD\\Preguntas.txt");
		//crear una clase Respuesta, con un boolean si es correcta o no. Clase pregunta con texto de pregunta con todas las respuestas
		char l;
		
		try {
		FileReader fr = new FileReader (preguntas);
		BufferedReader br = new BufferedReader(fr);
		Pregunta listasP = new Pregunta();
		ArrayList<String> respuestas = new ArrayList <String>();
		
		
		 // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null) {
           System.out.println(linea);
           l = linea.charAt(0);
           if(l == '+') {
        	   listasP.setPreguntas(linea);
           }else if(l == '-') {
        	   respuestas.add(linea);
        	   listasP.setPreguntas(listasP.respuestas.add(respuestas));
        	   
           }else if(l == '*'){
        	   
           }else{
        	   
           }
        }
        
        
        
        
        
        
        fr.close();

		}catch(Exception e){ 
            e.printStackTrace();
        }
		
		
		
	}

}
