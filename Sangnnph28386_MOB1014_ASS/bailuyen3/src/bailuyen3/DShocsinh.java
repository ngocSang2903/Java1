/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyen3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DShocsinh {

    ArrayList<Hocsinh> list = new ArrayList<>();

    public void nhaptt() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập mã học sinh: ");
            String mahs = sc.nextLine();
            System.out.println("Nhập tên học sinh: ");
            String tenhs = sc.nextLine();
            System.out.println("Nhập điểm: ");
            Double diem = Double.parseDouble(sc.nextLine());
            Hocsinh dc = new Hocsinh(mahs, tenhs, diem);
            list.add(dc);
            System.out.println("Bạn có muốn tiếp tục nhập chọn Y/N: ");
            String chon = sc.nextLine();
            if (chon.equals("N")) {
                break;
            }
        } while (true);
    }

    public void xuattt() {
        for (Hocsinh hocsinh : list) {
            hocsinh.xuat();
        }
    }

    public void timhs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã học sinh cần tìm: ");
        String mahs = sc.nextLine();
        boolean flag = true;
        for (Hocsinh hocsinh : list) {
            if (hocsinh.getMahs().equalsIgnoreCase(mahs)) {
                flag = false;
                hocsinh.xuat();
            }
        }
        if (flag == true) {
            System.out.println("Không có sinh viên này");
        }
    }

    public void sapxep() {
        list.sort(new Comparator<Hocsinh>() {
            @Override
            public int compare(Hocsinh o1, Hocsinh o2) {
                return o1.getTenhs().compareTo(o2.getTenhs());
            }
        }
        );
        xuattt();
    }

    public void xuatdiemtheokhoang() {
        Scanner sc = new Scanner(System.in);
        double min=0;
        double max=0;
        do {
            System.out.println("Nhập khoảng điểm bé: ");
            min = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập khoảng điểm lớn: ");
            max = Double.parseDouble(sc.nextLine());
            if(min>max){
                System.out.println("Mời bạn nhập lại");
            }else{
                break;
            }
        } while (true);
        boolean flag=true;
        for (Hocsinh hocsinh : list) {
            if(hocsinh.getDiem()>=min&&hocsinh.getDiem()>=max){
                flag=false;
                hocsinh.xuat();
            }
        }
        if(flag==true){
            System.out.println("Không có dữ liệu");
        }
    }
}
