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
public class Truongphong extends Nhanvien{
    private double luongTrachnhiem;

    public Truongphong() {
    }

    public Truongphong(String Ma, String hoTen, double luong, double luongTrachnhiem) {
        super(Ma, hoTen,"Trưởng phòng", luong);
        this.luongTrachnhiem = luongTrachnhiem;
    }

    public double getLuongTrachnhiem() {
        return luongTrachnhiem;
    }

    public void setLuongTrachnhiem(double luongTrachnhiem) {
        this.luongTrachnhiem = luongTrachnhiem;
    }
    
    public void NhapTT(Scanner so) {
        super.NhapTT(so);
        System.out.println("Lương trách nhiệm");
        luongTrachnhiem = so.nextDouble();
        so.nextLine();
    }
    public void XuatTT(){
        super.XuatTT();
        System.out.printf("Lương trách nhiệm: %f",luongTrachnhiem);
    }

    @Override
    public double getThuNhap() {
        return getLuong() + luongTrachnhiem;
    }
}