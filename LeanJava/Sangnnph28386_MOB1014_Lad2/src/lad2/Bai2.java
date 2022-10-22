/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        if (a == 0) {
            double x = -b / a;
            System.out.printf("phương trình có ngiệm x=%f", x);
        } else {
            double denta = b * b - 4 * a * c;
            if (denta < 0) {
                System.out.println("vô ngiệm");
            } else if (denta == 0) {
                double x = -b / a;
                System.out.printf("phương trình có ngiệm x=%f", x);
            } else if (denta > 0) {
                double x1 = (-b + Math.sqrt(denta)) * (2 * a);
                double x2 = (b + Math.sqrt(denta)) * (2 * a);
                System.out.printf("phương trình có ngiệm x1=%f\n", x1);
                System.out.printf("phương trình có ngiệm x2=%f", x2);
            }
        }
    }
}
