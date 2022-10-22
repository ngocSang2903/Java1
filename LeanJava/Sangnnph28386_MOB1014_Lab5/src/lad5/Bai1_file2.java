/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Mangsothuc {

    private ArrayList<Double> list = new ArrayList<Double>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các số thực : ");
        while (true) {
            System.out.println("Nhập số");
            double n = Double.parseDouble(sc.nextLine());
            list.add(n);
            System.out.println("Dể nhập tiếp bạn chọn Y/N");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("---------------------");
        for (Double item : list) {
            System.out.println("  " + item);
        }
    }
    public void tinhtong(){
        double tong=0;
        for(Double item : list){
            tong+=item;
        }
        System.out.println("Tong: "+tong);
    }
}
    
