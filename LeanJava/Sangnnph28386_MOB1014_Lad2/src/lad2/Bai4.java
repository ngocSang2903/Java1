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
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("1.Giải phương bậc nhất");
        System.out.println("2.Giải phương bậc hai");
        System.out.println("3.Tính tiền điện");
        System.out.println("----------------------");
        int choise;
        System.out.print("mời bạn chọn: ");
        choise = sc.nextInt();
        switch (choise) {
            case 1:
                bai1();
                break;
            case 2:
                Bai2();
                break;
            case 3:
                Bai3();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("vô số ngiệm");
            } else {
                System.out.println("vô ngiệm");
            }
        } else {
            double x = -b / a;
            System.out.printf("phương trình có ngiệm x=%f", x);
        }
    }

    public static void Bai2() {
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

    public static void Bai3() {
        Scanner sc = new Scanner(System.in);
        int soDien, tien;
        System.out.print("Nhập vào số điện: ");
        soDien = sc.nextInt();
        if (soDien < 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("so tien phai tra la: " + tien + "VND");
    }
}
