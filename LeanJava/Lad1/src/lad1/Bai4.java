/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a=sc.nextDouble();
        System.out.print("Nhập b: ");
        double b=sc.nextDouble();
        System.out.print("Nhập c: ");
        double c=sc.nextDouble();
        double delta=Math.pow(b,2)-4*a*c;
        System.out.printf("delta là: %f",delta);
    }
}
