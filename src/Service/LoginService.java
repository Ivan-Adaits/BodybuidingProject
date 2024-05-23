/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {

    public static String nombre;

    public String checkLogin(UserModel user) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();
        String result = "";

        try {
            String sql = "Select role, Username From user WHERE Username='" + user.getUserName() + "' and Password='" + user.getPassword() + "'";
            PreparedStatement ps;
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String role = rs.getString("Role");
                this.nombre = rs.getString("Username");
                result = role;
            }
        } catch (Exception e) {
            result = "";
            e.printStackTrace();
        }

        return result;
    }
}
