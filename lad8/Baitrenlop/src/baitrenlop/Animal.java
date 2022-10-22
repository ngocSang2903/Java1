/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

/**
 *
 * @author Admin
 */
public class Animal {
    private String name;
    private Double age;
    private String color;

    public Animal() {
    }

    public Animal(String name, Double age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void inThongtin(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nColor: "+color);
    }
    
}
