/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataUserService {

    public static ResultSet showDataUser(String consulta) {
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

    public static boolean deleteUser(String id) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();

        PreparedStatement ps = null;

        String sql = "delete from user where Uid= " + id;

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

    public static boolean updateUser(UserModel user) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();

        PreparedStatement ps = null;

        String sql = "update user set Username='" + user.getUserName() + "',UserSurName= '" + user.getUserSurName() + "',Email='" + user.getEmail() + "',Password='" + user.getPassword() + "' where Uid='" + user.getUid() + "'";
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
