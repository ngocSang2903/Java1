/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baithemm;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baithemm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double banKinh,chuVi,dienTich;
        System.out.println("Nhập bán: ");
        banKinh=sc.nextDouble();
        chuVi=2*Math.PI*banKinh;
        dienTich=Math.PI*Math.pow(banKinh, 2);
        System.out.println("chu vi là:"+chuVi);
        System.out.println("diện tích là:"+dienTich);
    }
    
}
