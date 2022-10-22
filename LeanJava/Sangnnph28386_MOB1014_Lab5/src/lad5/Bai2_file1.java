/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2_file1 {

    private ArrayList<String> list = new ArrayList<String>();
    

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách họ và tên: ");
        while (true) {
            System.out.print("Nhập học và tên: ");
            String name = sc.nextLine();
            list.add(name);
            System.out.println("Nhập thêm Y/N:");
            if(sc.nextLine().equals("N")){ break;}
        }
        
    }
    public void xuat(){
        System.out.println("---------------------------------");
        for(String item:list){
            System.out.println(" "+item);
        }
    }
    public void xuatngaunhien(){
        Collections.shuffle(list);
        xuat();
    }
    public void xeptangdan(){
        Collections.sort(list);
        xuat();
    }
    public void xoahoten(){
        Scanner sa=new Scanner(System.in);
        System.out.print("Mời nhập họteenn cần xóa: ");
        String hoten= sa.nextLine();
        for(String item:list){
                list.remove(hoten);
                System.out.println("bạn đã xóa thành công");
            
        }
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int chon=0;
            System.out.println("Menu chương trình");
            System.out.println("1.Nhập danh sách họ tên");
            System.out.println("2.Hiển thị danh sách họ tên");
            System.out.println("3.sắp xếp ngẫu nhiên");
            System.out.println("4.sắp xếp");
            System.out.println("5.xóa");
            System.out.println("0.thoat");
            System.out.print("Mời bạn chọn: ");
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatngaunhien();
                    break;
                case 4:
                    xeptangdan();
                    break;
                case 5:
                    xoahoten();
                    break;
            }
        }
    }

    private static class Arrayslist<T> {

        public Arrayslist() {
        }
   }
    }
