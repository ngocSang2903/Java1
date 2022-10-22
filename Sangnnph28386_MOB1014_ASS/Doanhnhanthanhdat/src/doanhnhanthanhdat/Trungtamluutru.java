/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanhnhanthanhdat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Trungtamluutru {

    ArrayList<Thongtindoanhnhan> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhaptt() {
        System.out.print("Số công nhân cần nhập thông tin là: ");
        int n = Integer.parseInt(this.sc.nextLine());
        for (int i = 0; i < n; i++) {
            Thongtindoanhnhan df = new Thongtindoanhnhan();
            df.nhap();
            list.add(df);
        }
    }

    public void xuattt() {
        for (Thongtindoanhnhan thongtindoanhnhan : list) {
            thongtindoanhnhan.xuat();
        }
    }

    public void timdntheoma() {
        System.out.print("Nhập mã doanh nhân cần tìm: ");
        String ma = sc.nextLine();
        boolean flag = true;
        for (Thongtindoanhnhan thongtindoanhnhan : list) {
            if (thongtindoanhnhan.getMadn().equalsIgnoreCase(ma)) {
                flag = true;
                thongtindoanhnhan.xuat();
                break;
            }
            if (flag == false) {
                System.out.println("Không có nhân nào");
            }
        }
    }

    public void xoanhanvien() {
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String ma = sc.nextLine();
        for (Thongtindoanhnhan thongtindoanhnhan : list) {
            if (thongtindoanhnhan.getMadn().equalsIgnoreCase(ma)) {
                list.remove(ma);
                break;
            }
        }
    }

    public void capnhapnhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã sinh viên cần cập nhập: ");
        String ma = sc.nextLine();
        boolean flag = true;
        for (Thongtindoanhnhan thongtindoanhnhan : list) {
            if (thongtindoanhnhan.getMadn().equalsIgnoreCase(ma)) {
                flag = true;
                thongtindoanhnhan.nhap();
            }
        }
        if (flag == false) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }
    public void sapxeptheoten(){
        Comparator<Thongtindoanhnhan> nv1=new Comparator<Thongtindoanhnhan>() {
            @Override
            public int compare(Thongtindoanhnhan o1, Thongtindoanhnhan o2) {
              return o1.getTen().compareTo(o2.getTen());
            }
        };
        Collections.sort(list,nv1);
        xuattt();
    }

    public Trungtamluutru() {
    }
    

}
