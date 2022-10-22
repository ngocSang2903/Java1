/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiontapthi.monjava1;

/**
 *
 * @author Admin
 */
public class Nhanvien {
    private String manv;
    private String tennv;
    private double luong;
    private int namsinh;

    public Nhanvien() {
    }

    public Nhanvien(String manv, String tennv, double luong, int namsinh) {
        this.manv = manv;
        this.tennv = tennv;
        this.luong = luong;
        this.namsinh = namsinh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public int tuoi(){
        return 2022-namsinh;
    }
    public String getTrangthai(){
        if(getLuong()>5000){
            return "Tốt";
        }else{
            return "Bình thường";
        }
    }
    public void inthongtin(){
        int tuoi=2022-namsinh;
        System.out.println("Mã nhân viên: "+manv);
        System.out.println("Tên nhân viên: "+tennv);
        System.out.println("Luong nhân viên nhận: "+luong);
        System.out.println("Năm sinh nhân viên: "+namsinh);
        System.out.println("Trạng thái: "+getTrangthai());
        System.out.println("Tuổi là: "+tuoi);
    }
}
