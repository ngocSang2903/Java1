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
public class Tiepthi extends Nhanvien{
    private double doanhSo;
    private double hueHong;

    public Tiepthi() {
    }

    public Tiepthi(String Ma, String hoTen, double luong, double doanhSo, double hueHong) {
        super(Ma, hoTen, "Tiếp thị", luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    
    public void NhapTT(Scanner so){
        super.NhapTT(so);
        System.out.println("Tiền doanh số:");
        doanhSo = so.nextDouble();
        System.out.println("Tiền huê hồng");
        hueHong = so.nextDouble();
        so.nextLine();
    }
    public void XuatTT(){
        super.XuatTT();
        System.out.printf("Doanh số: %f",doanhSo);
        System.out.printf("\nTiền huê hồng: %f",hueHong);
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hueHong / 100;
    }
}