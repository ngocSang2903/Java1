/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikiemtra;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cat {
    private String name;
    private Double age;
    private Double weight;

    public Cat() {
    }

    public Cat(String name, Double age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        name=sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age=Double.parseDouble(sc.nextLine());
        System.out.print("Nhập cân nặng: ");
        weight=Double.parseDouble(sc.nextLine());
        
    }
    public void getStatus(){
        if(weight<=1){
            System.out.println("Còi xương");
        }else{
            System.out.println("Bình thường");
        }
    }
    public void output(){
        System.out.println("Tên: "+name+"-Tuổi: "+age+"-Cân nặng: "+weight);
        getStatus();
    }
}
