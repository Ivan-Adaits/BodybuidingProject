/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BodybuilderModel;
import Service.DataBodybuilderService;
import java.sql.*;

public class DataBodybuilderController {

    private DataBodybuilderService dataBodybuilderService;

    public DataBodybuilderController() {
        dataBodybuilderService = new DataBodybuilderService();
    }

    public ResultSet showDataBodybuilder(String consulta) {
        return dataBodybuilderService.showDataBodybuilder(consulta);
    }

    public boolean deleteBodybuilder(String id) {
        return dataBodybuilderService.deleteBodybuilder(id);
    }

    public boolean updateBodybuilder(BodybuilderModel bodybuilder) {
        return dataBodybuilderService.updateBodybuilder(bodybuilder);
    }

}
