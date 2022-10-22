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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập cạnh: ");
        double canh=sc.nextDouble();
        double thetich=Math.pow(canh,3);
        System.out.printf("thể tích là: %f",thetich);
    }
}
