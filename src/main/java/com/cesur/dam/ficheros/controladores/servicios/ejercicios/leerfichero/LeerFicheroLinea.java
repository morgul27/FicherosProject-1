package com.cesur.dam.ficheros.controladores.servicios.ejercicios.leerfichero;

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
		
		
		ArrayList<Pregunta> listasP = new ArrayList <Pregunta>();
		ArrayList<Respuesta> listasResp = new ArrayList <Respuesta>();
		Pregunta p = null;


		 // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null) {
           l = linea.charAt(0);
           
           if(l == '+' || l == '*') {
        	   p = new Pregunta();
    		   p.setPreguntas(linea);
        	   p.setMultiple(linea.startsWith("*"));
        	   p.setRespuestas(new ArrayList<Respuesta>());
        	   listasP.add(p);
        	   
           }else{
        	   Respuesta resp = new Respuesta();
    		   resp.setRespuestas(linea);
    		   resp.setCorrecta(linea.startsWith("-"));
        	   p.getRespuestas().add(resp);
           }
        }
        
        fr.close();

        System.out.println(listasP);
		}catch(Exception e){ 
            e.printStackTrace();
        }
	}

}
