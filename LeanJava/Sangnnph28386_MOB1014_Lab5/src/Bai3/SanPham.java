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
class SanPham {

    private Object[] getTenSP;

    SanPham(String ten, Double gia) {
    }
        private ArrayList<SanPham> list=new ArrayList<>();

    SanPham() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void nhap(){
        System.out.println("Nhập danh sách sản phẩm: ");
int i=1;
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhập tên sản phẩm %d"+i);
            String ten=sc.nextLine();
            if(equals("")){
                break;
            }
            i++;
            System.out.println("Mời bạn nhập giá: ");
            Double gia=sc.nextDouble();
                    list.add(new SanPham(ten,gia ));
        } while (true);
    }
    public void xuat(){
        System.out.println("xuất danh sách sản phẩm");
        for(SanPham sp: list){
            System.out.printf("%f | %d",getTenSP);
        }
    }
}
