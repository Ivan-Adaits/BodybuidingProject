/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BodybuilderModel;
import Service.FormBodybuilderService;

/**
 *
 * @author farth
 */
public class FormBodybuilderController {

    private FormBodybuilderService formBodybuilderService;

    public FormBodybuilderController() {
        formBodybuilderService = new FormBodybuilderService();
    }

    public String addBodybuilder(BodybuilderModel bodybuilder) {
        return formBodybuilderService.addBodybuilder(bodybuilder);
    }
}
