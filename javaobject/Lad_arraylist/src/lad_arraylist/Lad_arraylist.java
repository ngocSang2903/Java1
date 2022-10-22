/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lad_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lad_arraylist {

    private ArrayList<Double> list = new ArrayList<>();
    
    public void nhap(){
        System.out.println("Nhập danh sách số thực");
        int yes=1;
        Scanner s= new Scanner(System.in);
        do{
            System.out.print("Nhập số: ");
            double num=s.nextDouble();
            
            list.add(num);
            System.out.println("Bạn có muốn nhập tiếp chọn 1,thoát ra chọn 0: ");
            yes=s.nextInt();
        }while(yes == 1);
    }
    
    public void hienthi(){
        System.out.println("-----------------");
        for (Double item : list) {
            System.out.print(" "+ item);
        } 
        System.out.println("");
    }
    public void tinhtong(){
        double sum=0;
        for (Double item : list) {
            sum+=item;
        }
        System.out.println("tính tổng: "+sum);
    }
}
