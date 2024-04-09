import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class TestBDD{ 

    public static void main(String[] args) {
        try{
            //Conexión con la BD
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33006/Chinook", "root", "RootPass");
            // // Creamos un objeto para enviar sentencias SQL a la BD
            Statement st = con.createStatement();
            // // Ejecutamos la consulta SQL y obtenemos el resultado en ResultSet
            ResultSet rs = st.executeQuery("SELECT * FROM Employee AS E");
            // // Recorremos los resultados obtenidos y mostramos sus campos
            while (rs.next()) {
                String city = rs.getString("City");
                int EmployeesID = rs.getInt("EmployeeId");
                System.out.println("ID: " + EmployeesID + " Ciudad " + city);
            // int edad = rs.getInt("edad");
            // System.out.println(nombre + ": " + edad);
            }
            // // Cerramos la conexión
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd: " + e.getErrorCode() + "-" + e.getMessage());
        } catch (Exception e){
                e.printStackTrace();
        }
    }
    

}