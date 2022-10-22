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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai=sc.nextDouble();
        System.out.print("Nhập chiều rông: ");
        double rong=sc.nextDouble();
        double chuvi=(dai+rong)*2;
        double dientich=dai*rong;
        double nho=Math.min(rong, dai);
        System.out.printf("chuvi: %f \n",chuvi);
        System.out.printf("dientich: %f \n",dientich);
        System.out.printf("canhnhonhat: %f \n",nho);
    }
}
