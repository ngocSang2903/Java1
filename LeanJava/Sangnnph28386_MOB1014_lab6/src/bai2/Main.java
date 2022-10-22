/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> list=new ArrayList<SanPham>();
        for(int i=0;i<=3;i++){
            SanPham sp=new SanPham();
            sp.nhap();
            list.add(sp);
        }
        for(SanPham sp:list){
            if(sp.getTenSP().equalsIgnoreCase("nokia")){
            sp.xuat();
                System.out.println("");
        }
        }
    }
}
