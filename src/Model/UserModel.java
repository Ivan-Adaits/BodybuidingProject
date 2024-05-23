/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class UserModel {

    private int Uid;
    private String UserName;
    private String UserSurName;
    private String Email;
    private String Password;
    private String Role;

    public UserModel(int uid, String userName, String userSurName, String email, String password, String role) {
        Uid = uid;
        UserName = userName;
        UserSurName = userSurName;
        Email = email;
        Password = password;
        Role = role;
    }

    public UserModel(String userName, String userSurName, String email, String password, String role) {
        UserName = userName;
        UserSurName = userSurName;
        Email = email;
        Password = password;
        Role = role;
    }

    public UserModel(String userName, String password) {
        UserName = userName;
        Password = password;

    }

    public UserModel() {

    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        this.Uid = uid;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getUserSurName() {
        return UserSurName;
    }

    public void setUserSurName(String userSurName) {
        this.UserSurName = userSurName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        this.Role = role;
    }

}
