/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad1;

import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Admin
 */
public class Btthem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập name: ");
        String name=sc.nextLine();
        System.out.print("Nhập age: ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.print("nhâp weight: ");
        double weight=Double..parseDouble(sc.nextLine());
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("weight: "+weight);
        System.out.printf("name: %s\n",name);
        System.out.printf("age: %d\n",age);
        System.out.printf("weight: %f\n",weight);
    }
}
