/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lad1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String name=sc.nextLine();
        System.out.println("Điểm TB: ");
        double diem=sc.nextDouble();
        System.out.printf("%s %f điểm",name,diem);  
    }
    
}
