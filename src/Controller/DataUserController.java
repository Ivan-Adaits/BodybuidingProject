/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UserModel;
import Service.DataUserService;
import java.sql.*;

public class DataUserController {

    private DataUserService dataUserService;

    public DataUserController() {
        dataUserService = new DataUserService();
    }

    public ResultSet showDataUser(String consulta) {
        return dataUserService.showDataUser(consulta);
    }

    public boolean deleteUser(String id) {
        return dataUserService.deleteUser(id);
    }

    public boolean updateUser(UserModel user) {
        return dataUserService.updateUser(user);
    }

}
