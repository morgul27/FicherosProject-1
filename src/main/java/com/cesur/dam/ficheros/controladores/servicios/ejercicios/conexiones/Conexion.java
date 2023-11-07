package com.cesur.dam.ficheros.controladores.servicios.ejercicios.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexion {
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	public void administrarDatos() {
		String db = "bbddnueva";
		String login_ = "root";
		String password_ = "";
		String connectionUrl = "jdbc:mysql://127.0.0.1/" + db;
		Connection conn = null;
		Statement stmt = null;
		
		Properties configuracion = new Properties();
		Statement st_ = null;
		ResultSet rs_ = null;
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(connectionUrl,"root","");
            
            PreparedStatement ps = conn.prepareStatement("INSERT INTO PACIENTES" +
                    "(Apellidos,Nombre,DNI,FechaNacimiento,Genero,Direccion,CP,CodProvincia,email,Telefono1,Telefono2)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, "nombre de cosas");
            ps.setInt(2, 4); //"esto es para int"
       
            ps.executeUpdate();
            ps.close();
            
            
            
			stmt.close();
			conn.close();
            
            
		}catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	
	public void datosConexion() {
		String db = "bbddnueva";
		String login_ = "root";
		String password_ = "";
		String connectionUrl = "jdbc:mysql://127.0.0.1/" + db;
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(
					connectionUrl,"root","");
			System.out.println("Conectado..");
			
			String sql = "SELECT * FROM test";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("titulo"));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException | ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
	}
	
}








