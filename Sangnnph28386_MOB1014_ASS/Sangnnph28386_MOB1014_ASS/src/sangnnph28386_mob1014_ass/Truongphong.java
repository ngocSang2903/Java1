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
public class Truongphong extends Nhanvien{
    private double luongTN;

    public Truongphong() {
    }
    
    public Truongphong(double luongTN, String masv, String tensv, Double luongCB) {
        super(masv, tensv, luongCB);
        this.luongTN = luongTN;
    }

    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }
    
    public void nhaptt(){
        super.nhaptt();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập lương trách nhiệm: ");
        luongTN=Double.parseDouble(sc.nextLine());
    }
    public void xuattt(){
        super.xuattt();
        System.out.println("-luongTN"+luongTN);
    }

    @Override
    public double getThunhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
