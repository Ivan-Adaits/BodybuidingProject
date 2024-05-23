/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CommentService {

    public void addComment(String comentario) {
        Path relativePath = Paths.get("src/Ficheros");
        Path absolutePath = relativePath.toAbsolutePath();

        try {
            String ruta = absolutePath.toString() + "/Comentario.txt";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {
                bw.write(comentario + "\n");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> showComment() {
        Path relativePath = Paths.get("src/Ficheros");
        Path absolutePath = relativePath.toAbsolutePath();

        String ruta = absolutePath.toString() + "/Comentario.txt";
        ArrayList<String> array = new ArrayList<>();
        File file = new File(ruta);

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                array.add(line + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return array;
    }

}
