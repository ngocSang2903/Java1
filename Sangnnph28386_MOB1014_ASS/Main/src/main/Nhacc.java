/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Nhacc {
    String tenphong;
    private String tenchuho;
    private Double dientich;

    public Nhacc() {
    }

    public Nhacc(String tenphong, String tenchuho, Double dientich) {
        this.tenphong = tenphong;
        this.tenchuho = tenchuho;
        this.dientich = dientich;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getTenchuho() {
        return tenchuho;
    }

    public void setTenchuho(String tenchuho) {
        this.tenchuho = tenchuho;
    }

    public Double getDientich() {
        return dientich;
    }

    public void setDientich(Double dientich) {
        this.dientich = dientich;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập vào tên phòng: ");
        tenphong=sc.nextLine();
        System.out.print("Nhập tên chủ hộ: ");
        tenchuho=sc.nextLine();
        System.out.print("Nhập diện tích: ");
        dientich=Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Tên phòng: "+tenphong+"\nTên chủ hộ: "+tenchuho+"\nDiện tích hộ: "+dientich);
    }
}