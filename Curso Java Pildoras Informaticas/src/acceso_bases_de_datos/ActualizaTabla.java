package acceso_bases_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizaTabla {
	
public static void main(String[] args) {
		
		
		
		try {
			
			//1. CREAR CONEXION
			Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/pildoras", "root", "0035");
			
			//2. CREAR STATEMENT
			Statement miSt = miCon.createStatement();
			
			//3. CREAR INSTRUCCION SQL
			
			//INSERTAR:
			//String inSQL = "INSERT INTO PRODUCTOS (`CÓDIGO ARTÍCULO`, `NOMBRE ARTÍCULO`, PRECIO) VALUES ('AR45','CAMISA FLORES',50)";

			//ACTUALIZAR
			//String inSQL = "UPDATE PRODUCTOS SET PRECIO=120 WHERE `CÓDIGO ARTÍCULO` = 'AR45'" ;
			
			// ELIMINAR:
			String inSQL = "DELETE FROM PRODUCTOS WHERE `CÓDIGO ARTÍCULO` ='AR45'" ;

			//4. EJECUTAR SQL
			
			miSt.executeUpdate(inSQL);
			
			System.out.println("Registro insertado correctamente");
			
			miCon.close();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}



