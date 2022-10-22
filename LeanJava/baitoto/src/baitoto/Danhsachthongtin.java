/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Danhsachthongtin {

    ArrayList<Thongtin> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập lớp: ");
            String clas = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            Double tuoi = Double.parseDouble(sc.nextLine());
            Thongtin ds = new Thongtin(name, clas, tuoi);
            
            System.out.println("Bạn có muốn tiếp tục nhập Y kết thúc nhập N: ");
            String chon=sc.nextLine();
            list.add(ds);
            if (chon.equals("N")) {
                break;
            }
        } while (true);
    }
    public void xuat(){
        for(Thongtin sa:list){
            sa.xuat();
        }
    }
}
