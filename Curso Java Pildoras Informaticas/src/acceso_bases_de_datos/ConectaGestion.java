package acceso_bases_de_datos;

import java.sql.*;

public class ConectaGestion {

	public static void main(String[] args) {
		
		
		
		try {
			
			//1. CREAR CONEXION
			Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "0035");
			
			//2. CREAR STATEMENT
			Statement miSt = miCon.createStatement();
			
			//3. EJECUTAR INSTRUCION SQL
			
			ResultSet miRs = miSt.executeQuery("SELECT * FROM PRODUCTOS");
			

			//4. LEER EL RESULT REST
			
			while(miRs.next()) {
				
				System.out.println(miRs.getString("codigoarticulo") + " " + miRs.getString(3) + " " + miRs.getString("precio"));
			}
			
			miCon.close();
			miRs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
