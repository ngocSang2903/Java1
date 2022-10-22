/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class danhsachsinhvien {
    private ArrayList<Sinhvien> list=new ArrayList<Sinhvien>();
    public void nhap(){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++){
            Sinhvien sv=new Sinhvien();
            sv.nhap();
            list.add(sv);
        }
    }
    public void xuat(){
        System.out.println("---------------------------");
        System.out.println("Danh sách sinh viên");
        for(Sinhvien item:list){
            item.xuat();
        }
    }
}
