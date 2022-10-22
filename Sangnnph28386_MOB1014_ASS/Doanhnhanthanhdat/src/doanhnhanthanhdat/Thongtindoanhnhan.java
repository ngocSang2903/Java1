/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanhnhanthanhdat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Thongtindoanhnhan {
    private String madn;
    private String Ten;
    private String Gioitinh;
    private Double tuoi;
    private Double luong;
    private Double songaylam;

    public Thongtindoanhnhan() {
    }

    public Thongtindoanhnhan(String madn, String Ten, String Gioitinh, Double tuoi, Double luong, Double songaylam) {
        this.madn = madn;
        this.Ten = Ten;
        this.Gioitinh = Gioitinh;
        this.tuoi = tuoi;
        this.luong = luong;
        this.songaylam = songaylam;
    }

    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public Double getTuoi() {
        return tuoi;
    }

    public void setTuoi(Double tuoi) {
        this.tuoi = tuoi;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public Double getSongaylam() {
        return songaylam;
    }

    public void setSongaylam(Double songaylam) {
        this.songaylam = songaylam;
    }
    

    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã doanh nhân: ");
        madn=sc.nextLine();
        System.out.print("Nhập họ tên doanh nhân: ");
        Ten=sc.nextLine();
        System.out.print("Nhập giới tính: ");
        Gioitinh=sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi=Double.parseDouble(sc.nextLine());
        System.out.print("Nhập lương: ");
        luong=Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số ngày làm: ");
        songaylam=Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Mã doanh nhân là: "+madn+"\nTên là: "+Ten+"\n Giới tính: "+Gioitinh+"\nTuổi: "+tuoi+"\nLương: "+luong+"\nSố ngày làm: "+songaylam);
    }
}
