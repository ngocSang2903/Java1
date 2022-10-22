/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyen2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLGiaovien {

    ArrayList<Giaovien> list = new ArrayList<>();

    public void nhaptt() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------Nhập thông tin giáo viên------");
            System.out.println("Nhập ID: ");
            String ID = sc.nextLine();
            System.out.println("Nhập tên giáo viên: ");
            String ten = sc.nextLine();
            System.out.println("Nhập vào số giờ làm: ");
            Double sogiolam = Double.parseDouble(sc.nextLine());
            Giaovien ds = new Giaovien(ID, ten, sogiolam);
            list.add(ds);
            System.out.println("Bạn có muốn tiếp tục chọn y thoát chọn n: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
    }

    public void xuattt() {
        for (Giaovien x : list) {
            x.xuat();
        }
    }

    public void xuatgvsogioday() {
        Scanner sc = new Scanner(System.in);
        double min=0;
        double max=0;
        do {
            System.out.println("Nhập khoảng giờ từ: ");
            min = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập khoảng giờ đến: ");
            max = Double.parseDouble(sc.nextLine());
            if(min>max){
                System.out.println("Nhập lại");
            }else{
                break;
            }
        } while (true);
        boolean flag=false;
        for (Giaovien giaovien : list) {
            if(giaovien.getSogioday()>=min && giaovien.getSogioday()<=max){
                flag =true;
                giaovien.xuat();
                break;
            }
        }
        if(flag==false){
            System.out.println("Không có dữ liệu");
        }

    }

    public void timgiaovien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã giáo viên cần tìm: ");
        String ID = sc.nextLine();
        for (Giaovien giaovien : list) {
            if (giaovien.getID().equalsIgnoreCase(ID)) {
                giaovien.xuat();
                break;
            }
        }
    }

    public void sapxep() {
        list.sort(new Comparator<Giaovien>() {
            public int compare(Giaovien o1, Giaovien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        }
        );
        xuattt();
    }
}
