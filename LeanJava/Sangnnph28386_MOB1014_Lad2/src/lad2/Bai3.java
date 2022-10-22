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
public class Bai3 {

    public static void main(String[] args) {
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
