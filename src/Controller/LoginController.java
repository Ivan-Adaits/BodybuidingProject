/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UserModel;
import Service.LoginService;

public class LoginController {

    private LoginService loginService;

    public LoginController() {
        loginService = new LoginService();

    }

    public String checkLogin(UserModel user) {
        return loginService.checkLogin(user);
    }

}
