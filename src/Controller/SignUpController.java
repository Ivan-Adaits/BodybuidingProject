/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.UserModel;
import Service.SignUpService;

public class SignUpController {

    private SignUpService signUpService;

    public SignUpController() {
        signUpService = new SignUpService();
    }

    public String signup(UserModel user) {
        return signUpService.signup(user);
    }
}
