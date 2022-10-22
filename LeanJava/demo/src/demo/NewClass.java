/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NewClass {
    String name;
    Double diem;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        name=sc.nextLine();
        System.out.println("Nhập điểm:");
        diem=Double.parseDouble(sc.nextLine());
    }
    public  void xuat(){
        System.out.println(name +"\t"+diem);   }   
}
