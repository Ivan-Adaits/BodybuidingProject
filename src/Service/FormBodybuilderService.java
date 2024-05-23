/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.BodybuilderModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FormBodybuilderService {

    public String addBodybuilder(BodybuilderModel bodybuilder) {
        Conexion.conex con = new Conexion.conex();
        Connection connection = con.ConectarBD();
        String result = "";
        if (bodybuilder.getName().isBlank() || bodybuilder.getAge() <= 0 || bodybuilder.getAge() > 110 || bodybuilder.getHeight() <= 100 || bodybuilder.getHeight() > 300 || bodybuilder.getWeight() <= 40 || bodybuilder.getWeight() > 150) {
            result = "ErrorBlanco";
        }
        if (String.valueOf(bodybuilder.getCategory()).equalsIgnoreCase("Select")) {
            result = "ErrorCategoria";
        }
        try {
            String sql = "insert into bodybuilder(Name,Age,Height,Weight,Category)values('" + bodybuilder.getName() + "','" + bodybuilder.getAge() + "','" + bodybuilder.getHeight() + "','" + bodybuilder.getWeight() + "','" + bodybuilder.getCategory() + "')";
            PreparedStatement ps;
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "THE DATA COULD NOT BE RECORDED " + e);
        }
        return result;
    }
}
