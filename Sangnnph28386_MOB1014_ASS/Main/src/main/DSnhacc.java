/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DSnhacc {

    ArrayList<Nhacc> list = new ArrayList<>();

    public void nhaptt() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("MỜi bạn nhập vào thông tin: ");
            Nhacc ds = new Nhacc();
            ds.nhap();
            list.add(ds);
            System.out.println("Bạn có muốn tiếp chọn Y thoát chọn N: ");
            String chon = sc.nextLine();
            if (chon.equals("N")) {
                break;
            }
        }
    }

    public void xuattt() {
        for (Nhacc df : list) {
            df.xuat();
        }
    }

    public void demnhcc() {
        for (Nhacc ds : list) {
            if (ds.getDientich() > 50 && ds.getDientich() < 80) {
                ds.xuat();
            }
        }
    }

    public void xuatttchuho() {
        for (Nhacc ds : list) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời nhập tên chủ hộ dể xuất: ");
            String ten = sc.nextLine();
            if (ten.equals(ds.getTenchuho())) {
                ds.nhap();
            }
        }
    }
    public void sapxep(){
        list.sort( new Comparator<Nhacc>(){
            public int compare(Nhacc o1,Nhacc o2){
                return o1.getTenchuho().compareTo(o2.getTenchuho());
            }
        }
        );
        xuattt();
    }

}