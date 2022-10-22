/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sangnnph28386_mob1014_ass;

import java.util.Scanner;

public class Nhanvientiepthi extends Nhanvien{
    private double hoahong;
    private double luongkd;

    public Nhanvientiepthi() {
    }

    public Nhanvientiepthi(double hoahong, double luongkd, String masv, String tensv, Double luongCB) {
        super(masv, tensv, luongCB);
        this.hoahong = hoahong;
        this.luongkd = luongkd;
    }

    public double getHoahong() {
        return hoahong;
    }

    public void setHoahong(double hoahong) {
        this.hoahong = hoahong;
    }

    public double getLuongkd() {
        return luongkd;
    }

    public void setLuongkd(double luongkd) {
        this.luongkd = luongkd;
    }
      
    public void nhaptt(){
        super.nhaptt();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhâp hoa hồng: ");
        hoahong=Double.parseDouble(sc.nextLine());
        System.out.print("Nhập lương kd: ");
        luongkd=Double.parseDouble(sc.nextLine());
    }
    public void xuattt(){
        super.xuattt();
        System.out.print("-LKD: "+luongkd+"-hoa hồng"+hoahong);
    }     
    
    public double getThuNhap(){
        return super.getLuongCB()+hoahong+luongkd;
    }

    @Override
    public double getThunhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
