/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String tenSP;
    private Double gia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public void nhap(){
        Scanner ue=new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        tenSP=ue.nextLine();
        System.out.println("Nhập giá: ");
        gia=Double.parseDouble(ue.nextLine());
        System.out.println("Nhập hãng: ");
        hang=ue.nextLine();
    }
    public void xuat(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Giá: "+gia);
        System.out.println("Hãng: "+hang);
    }
}
