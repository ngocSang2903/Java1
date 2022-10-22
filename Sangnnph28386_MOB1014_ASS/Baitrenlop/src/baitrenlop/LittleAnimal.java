/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

/**
 *
 * @author Admin
 */
public class LittleAnimal extends Animal {
    private Double weight;

    public LittleAnimal() {
    }

    public LittleAnimal( String name, Double age, String color,Double weight) {
        super(name, age, color);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    
    public void intt(){
        super.inThongtin();
        System.out.println("Weight: "+weight);
    }
}
