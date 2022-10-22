/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anhmhpph28353;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class Nhanvien {
    String Ma, hoTen, Loai;
    double luong;
    
    
    public Nhanvien() {
    }

    
    public Nhanvien(String Ma, String hoTen, String Loai, double luong) {
        this.Ma = Ma;
        this.hoTen = hoTen;
        this.Loai = Loai;
        this.luong = luong;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public abstract double getThuNhap();
        
    public void NhapTT(Scanner so){
       
        System.out.println("Mã:");
        this.Ma = so.nextLine();
        System.out.println("Họ tên:");
        this.hoTen = so.nextLine();
        System.out.println("Lương:");
        this.luong = so.nextDouble();
        so.nextLine();
    }
    public void XuatTT() {
        System.out.println("Mã:"+Ma);
        System.out.println("Họ và tên:"+hoTen);
        System.out.printf("Loại: %s\n",Loai);
        System.out.println("Lương:"+luong);
        System.out.println("Thu nhập:"+getThuNhap());
    }


}