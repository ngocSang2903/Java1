/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baituluyen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLsinhvien {

    ArrayList<Sinhvien> list = new ArrayList<>();

    public void nhaptt() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập mã sinh viên: ");
            String masv = sc.nextLine();
            System.out.print("Nhập tên sinh viên: ");
            String ten = sc.nextLine();
            System.out.print("Nhập vào năm sinh: ");
            int namsinh = Integer.parseInt(sc.nextLine());
            Sinhvien ds = new Sinhvien(masv, ten, namsinh);
            list.add(ds);
            System.out.print("Bạn muốn tiếp tục chon y thoát chọn n: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
    }

    public void xuat() {
        for (Sinhvien df : list) {
            df.xuat();
        }
    }

    public void timsv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập mã sinh viên cần tìm: ");
        String ma = sc.nextLine();
        for (Sinhvien df : list) {
            if (df.getMasv().equalsIgnoreCase(ma)) {
                df.xuat();
                break;
            }
        }
    }
    
    public void tinhtuoi(){
        System.out.println("Xuất ra thông tin sinh viên có tuổi trên 20: ");
        for(Sinhvien x:list){
            if(2022-x.getNamsinh()>=20){
                x.xuat();
            }
        }
    }
    public void sinhvienudpm(){
        SinhvienUDPM ds=new SinhvienUDPM();
        ds.xuatudpm();
        list.add(ds);
    }
}
