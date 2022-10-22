/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiontapthi.monjava1;

import java.awt.image.MultiResolutionImage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DSNhanvien {

    ArrayList<Nhanvien> list = new ArrayList<>();

    public void nhapdt() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập mã nv: ");
            String manv = sc.nextLine();
            System.out.println("Nhập tên nhân viên: ");
            String tennv = sc.nextLine();
            System.out.println("Nhập lương nhân viên: ");
            double luong = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập năm sinh nhân viên: ");
            int namsinh = Integer.parseInt(sc.nextLine());
            Nhanvien ds = new Nhanvien(manv, tennv, luong, namsinh);
            list.add(ds);
            System.out.println("Bạn có muốn tiếp tục chọn Y/N: ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

    public void xuatdscatuoi() {
        for (Nhanvien nhanvien : list) {
            nhanvien.inthongtin();
        }
    }

    public void xuatnvluong500() {
        for (Nhanvien nhanvien : list) {
            if (nhanvien.getLuong() >= 500) {
                nhanvien.inthongtin();
            }
        }
    }

    public void xuatkhoangluong() {
        double min = 0;
        double max = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập khoảng min lương: ");
            min = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập khoảng maxv lương: ");
            max = Double.parseDouble(sc.nextLine());
            for (Nhanvien nhanvien : list) {
                if (nhanvien.getLuong() >= min && nhanvien.getLuong() <= max) {
                    nhanvien.inthongtin();
                    break;
                }
            }
        } while (true);
    }

    public void timnvma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần tìm: ");
        String ma = sc.nextLine();
        for (Nhanvien nhanvien : list) {
            if (nhanvien.getManv().equalsIgnoreCase(ma)) {
                nhanvien.inthongtin();
            }
        }
    }

    public void xuattuoi1830() {
        for (Nhanvien nhanvien : list) {
            if ((2022 - nhanvien.getNamsinh()) <= 18 && (2022 - nhanvien.getNamsinh()) >= 30) {
                nhanvien.inthongtin();
            }
        }
    }

    public void demnv18() {
        int count = 0;
        for (Nhanvien nhanvien : list) {
            if ((2022 - nhanvien.getNamsinh()) >= 18) {
                count++;
            }
        }
        System.out.println("Nhân viên trên 18 tuổi là: " + count);
    }

    public void tengiam() {
        list.sort(new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien o1, Nhanvien o2) {
                return o2.getTennv().compareTo(o1.getTennv());
            }
        }
        );
        xuatdscatuoi();
    }

    public void luonggiam() {
        list.sort(new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien o1, Nhanvien o2) {
                if (o1.getLuong() < o2.getLuong()) {
                    return 1;
                }else{
                    return -1;
                }
            }
        }
        );
        xuatdscatuoi();
    }

    public void tuoitang() {
        list.sort(new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien o1, Nhanvien o2) {
                return o2.tuoi()-o1.tuoi();
            }
        }
        );
        xuatdscatuoi();
    }
    
    public void sapxeptrangthai(){
        luonggiam();
        for (Nhanvien nhanvien : list) {
            nhanvien.inthongtin();
        }
    }
    public void tuoichan(){
        for (Nhanvien nhanvien : list) {
            if(nhanvien.tuoi()%2==0){
                nhanvien.inthongtin();
            }
        }
    }
}
