/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.BodybuilderModel;
import java.sql.*;

public class DataBodybuilderService {

    public static ResultSet showDataBodybuilder(String consulta) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();
        Statement sql;
        ResultSet datos = null;
        try {
            sql = connection.createStatement();
            datos = sql.executeQuery(consulta);
        } catch (Exception e) {
            System.out.println(e);
        }
        return datos;
    }

    public static boolean deleteBodybuilder(String id) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();

        PreparedStatement ps = null;

        String sql = "delete from bodybuilder where id= " + id;

        try {
            ps = connection.prepareStatement(sql);

            ps.execute();
            connection.close();
            return true;
        } catch (Exception e) {

            System.out.println(e.toString());
            return false;

        }
    }

    public static boolean updateBodybuilder(BodybuilderModel bodybuilder) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();

        PreparedStatement ps = null;

        String sql = "update bodybuilder set Name='" + bodybuilder.getName() + "',Age= '" + bodybuilder.getAge() + "',Height='" + bodybuilder.getHeight() + "',Weight='" + bodybuilder.getWeight() + "' where Id='" + bodybuilder.getId() + "'";
        System.out.println(sql);

        try {
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            connection.close();
            return true;
        } catch (Exception e) {

            System.out.println(e.toString());
            return false;

        }
    }

}
