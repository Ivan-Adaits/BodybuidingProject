package Conexion;
import java.sql.*;

public class conex {
Connection connection;
public Connection ConectarBD(){
        String url = "jdbc:mysql://localhost:3306/trabajofinalprogramacion";
        String user = "root";
        String password = "";
    try {
        //Carga el Driver
         Class.forName("com.mysql.cj.jdbc.Driver");
            //Conectamos
             connection = DriverManager.getConnection(url, user, password);
        System.err.println("Conexion exitosa");
    } catch (Exception e) {
        System.out.println("Coneexion fallida");
    }
    return connection;
}
}
