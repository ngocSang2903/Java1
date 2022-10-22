/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sinhvien {

    private String hoTen, email, sdt, cmnd;

    public Sinhvien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public Sinhvien() {
    }
    
    public void xuat(){
        System.out.printf("họ tên: %s - Email: %s - SĐT: %s - CMND: %s",hoTen,email,sdt,cmnd);
    }
    public void nhap() {
        Scanner ew = new Scanner(System.in);
        do {
            System.out.print("Nhập họ và tên: ");
            hoTen = ew.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                System.out.println("họ tên không hợp lệ. vui lòng nhập lại");
            } else {
                break;
            }
        } while (true);
        databole ds = new databole();
        do {
            System.out.print("Nhập email: ");
            email = ew.nextLine();
            if (ds.isEmail(email)) {
                break;
            }
            System.out.println("Email không hợp lệ. vui lòng nhập lại");
        } while (true);

        do {
            System.out.print("Nhập sđt: ");
            sdt = ew.nextLine();
            if (ds.isSDT(sdt)) {
                break;
            }
            System.out.println("SĐT không hợp lệ. vui lòng nhập lại");
        } while (true);
        do {
            System.out.print("Nhập cmnd: ");
            cmnd = ew.nextLine();
            if (ds.isCMND(cmnd)) {
                break;
            }
            System.out.println("cmnd không hợp lệ. vui lòng nhập lại");
        } while (true);

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

}
