/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sangnnph28386_mob1014_ass;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class Nhanvien {
    private String masv;
    private String tensv;
    private Double luongCB;

    public Nhanvien() {
    }

    public Nhanvien(String masv, String tensv, Double luongCB) {
        this.masv = masv;
        this.tensv = tensv;
        this.luongCB = luongCB;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public Double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(Double luongCB) {
        this.luongCB = luongCB;
    }
    
    public void nhaptt(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã sv: ");
        masv=sc.nextLine();
        System.out.print("Nhập tên sv: ");
        tensv=sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCB=Double.parseDouble(sc.nextLine());
    }
    public void xuattt(){
        System.out.println(masv+"--"+tensv+"--"+luongCB);
    }
    public abstract double getThunhap();
    
    public double getthueTN(){
        double thue=0;
        if(getThunhap()<9000000){
            thue=0;
        }else if(getThunhap()>=9000000 && getThunhap()<15000000){
            thue = getThunhap()*0.1;
        }else if(getThunhap()>=15000000){
            thue=getThunhap()*0.12;
        }
        return thue;
    }
}
