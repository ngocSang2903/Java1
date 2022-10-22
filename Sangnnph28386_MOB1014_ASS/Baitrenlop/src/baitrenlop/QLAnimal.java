/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLAnimal {

    ArrayList<Animal> list = new ArrayList<>();

    public void nhapdt() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập name: ");
            String name = sc.nextLine();
            System.out.println("Nhập age: ");
            double age = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập color: ");
            String color = sc.nextLine();
            Animal ds = new Animal(name, age, color);
            list.add(ds);
            System.out.println("Bạn có muốn tiếp tục chọn Y/N: ");
            String chon = sc.nextLine();
            if(chon.equalsIgnoreCase("N")){
                break;
            }
        } while (true);
    }
    
    public void xuatdt(){
        for (Animal animal : list) {
            animal.inThongtin();
        }
    }
    
    public void tuoitu(){
        for (Animal animal : list) {
            if(animal.getAge()>=3&&animal.getAge()<=5){
                animal.inThongtin();
            }
        }
    }
    public void xoa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập name cần xóa: ");
        String name = sc.nextLine();
        for (Animal animal : list) {
            if(animal.getName().equalsIgnoreCase(name)){
                list.remove(animal);
                break;
            }
        }
    }
    public void sapxep(){
        list.sort( new Comparator<Animal>(){
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
            
        }
        );
        xuatdt();
    }
}
