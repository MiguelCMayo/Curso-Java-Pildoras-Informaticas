package acceso_bases_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		
		try {
			
			//1. CREAR CONEXION
			Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "0035");
			
			//2. CREAR PREPAREDSTATEMENT		
			String sentencia = "SELECT nombrearticulo, seccion, precio, paisorigen FROM PRODUCTOS "
								+ "WHERE seccion = ? AND paisorigen = ?";
			
			PreparedStatement miPst = miCon.prepareStatement(sentencia);
			
			miPst.setString(1, "confeccion");
			
			miPst.setString(2, "España");
			
			//3. EJECUTAR INSTRUCION SQL
			ResultSet miRs = miPst.executeQuery();
			
			//4. LEER EL RESULT REST
			while(miRs.next()) {
				
				System.out.println(miRs.getString(1) + " " + miRs.getString(2) + " " + miRs.getString(3)+ " " + miRs.getString(4));
			}
			
			miRs.close();
			
			//REUTILIZACION DE CONSULTA PREPARADA
			System.out.println();
			System.out.println();
			
			miPst.setString(1, "deportes");
			miPst.setString(2, "usa");
			
			ResultSet miRs2 = miPst.executeQuery();
			while(miRs2.next()) {
				System.out.println(miRs2.getString(1) + " " + miRs2.getString(2) + " " + miRs2.getString(3)+ " " + miRs2.getString(4));
			}

			miCon.close();
			miRs2.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
