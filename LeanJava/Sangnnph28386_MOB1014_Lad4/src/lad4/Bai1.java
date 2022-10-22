/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lad4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    private String Tensp;
    private double DonGia;
    private double GiamGia;

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Double getGiamGia() {
        return GiamGia;
    }

    /**
     * @param GiamGia
     */
    public void setGiamGia(Double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public Bai1() {
    }

    public void Bai1 (String Tensp, Double DonGia, Double GiamGia) {
        this.Tensp = Tensp;
        this.DonGia = DonGia;
        this.GiamGia = GiamGia;
    }

    private double getthuenhapkhau() {
        return DonGia * 0.1;
    }

    public void Xuat() {
        System.out.println("Tên sp: " + Tensp);
        System.out.println("Đơn giá: " + DonGia);
        System.out.println("Giảm giá: " + GiamGia);
        System.out.println("Thuế nhập khẩu: " + getthuenhapkhau());
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên sp: ");
        Tensp=sc.nextLine();
        System.out.println("Nhập đơn nhá: ");
        DonGia=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá giảm: ");
        GiamGia=Double.parseDouble(sc.nextLine());
    }
}
