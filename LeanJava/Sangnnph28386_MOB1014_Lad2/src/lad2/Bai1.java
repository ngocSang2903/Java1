/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lad2;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập b: ");
        int b=Integer.parseInt(sc.nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.println("vô số ngiệm");
            } else {
                System.out.println("vô ngiệm");
            }
        } else {
            double x =(double) -b / a;
            System.out.printf("phương trình có ngiệm x=%f", x);
        }
    }

}
