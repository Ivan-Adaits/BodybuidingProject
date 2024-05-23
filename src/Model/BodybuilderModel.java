/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class BodybuilderModel {

    private int Id;
    private String Name;
    private int Age;
    private int Height;
    private double Weight;
    private int Category;

    public BodybuilderModel(String name, int age, int height, double weight, int category) {
        this.Name = name;
        this.Age = age;
        this.Height = height;
        this.Weight = weight;
        this.Category = category;
    }

    public BodybuilderModel(int id, String name, int age, int height, double weight, int category) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Height = height;
        this.Weight = weight;
        this.Category = category;
    }

    public BodybuilderModel(int id, String name, int age, int height, double weight) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Height = height;
        this.Weight = weight;
    }

    public BodybuilderModel(int id) {
        this.Id = id;
    }

    public BodybuilderModel() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        this.Height = height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        this.Weight = weight;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        this.Category = category;
    }
}
