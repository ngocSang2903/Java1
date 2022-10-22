/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lad3;

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
        System.out.println("Nhập số là: ");
        int so = sc.nextInt();
        boolean ok = true;
        for (int i = 2;i<so; i++) {
            if (so % i == 0) {
                ok = false;
                break;
            }

        }
        if (ok == true) {
            System.out.printf("%d là số nguyên tố", so);
        } else {
            System.out.printf("%d không là số nguyên tố", so);
        }
    }

}
