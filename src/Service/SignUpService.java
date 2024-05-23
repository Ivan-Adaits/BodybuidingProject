/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class SignUpService {

    public String signup(UserModel user) {

        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();
        String result = "";

        if (user.getUserName().isBlank() || user.getUserName().equals("Enter your name") ) {
            result = "ErrorName";
        } else if (user.getUserSurName().isBlank() || user.getUserSurName().equals("Enter your last name")) {
            result = "ErrorSurName";
        } else if (user.getEmail().isBlank() || user.getEmail().equals("Enter your email")) {
            result = "ErrorEmail";
        } else if (user.getPassword().isBlank() || user.getPassword().equals("********")) {
            result = "ErrorPassword";
        } else {
            if (user.getRole().equalsIgnoreCase("Select")) {
                result = "ErrorRole";
            } else {
                try {
                    String sql = "insert into user(Username,UserSurname,Email,Password,Role)values('" + user.getUserName() + "','" + user.getUserSurName() + "','" + user.getEmail() + "','" + user.getPassword() + "','" + user.getRole() + "')";
                    PreparedStatement ps;
                    ps = connection.prepareStatement(sql);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "DATA CORRECTLY RECORDED ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "THE DATA COULD NOT BE RECORDED " + e);
                }
            }
        }

        return result;

    }
}
