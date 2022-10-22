/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baituluyen;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    private String masv;
    private String Ten;
    private int Namsinh;

    public Sinhvien() {
    }

    public Sinhvien(String masv, String Ten, int Namsinh) {
        this.masv = masv;
        this.Ten = Ten;
        this.Namsinh = Namsinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }
    
    public void xuat(){
        System.out.println("Mã sinh viên: "+masv+"\nTên sinh viên: "+Ten+"\nNăm sinh: "+Namsinh);
    }
}
