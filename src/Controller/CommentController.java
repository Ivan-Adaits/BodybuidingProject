package Controller;

import Service.CommentService;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class CommentController {

    CommentService comantarioService = new CommentService();

    public void addComment(String comentario) {
        comantarioService.addComment(comentario);
    }

    public ArrayList<String> showComment() {
        return comantarioService.showComment();
    }

}
