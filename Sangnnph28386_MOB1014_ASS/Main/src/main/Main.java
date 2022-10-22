/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        DSnhacc ds=new DSnhacc();
        int chon;
        do {
            menu();
            System.out.println("Mời chọn chức năng: ");
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    ds.nhaptt();
                    break;
                case 2:
                    ds.xuattt();
                    break;
                case 3:
                    ds.demnhcc();
                    break;
                case 4:
                    ds.xuatttchuho();
                    break;
                case 5:
                    ds.sapxep();
                    break;
            }
        } while (true);
    }
    
    public static void menu(){
        System.out.println("------------------------");
        System.out.println("1.Nhập thông tin");
        System.out.println("2.xuất thông tin");
        System.out.println("3.Đếm căn hộ");
        System.out.println("4.Xuất chủ hộ");
        System.out.println("5.Sắp xếp");
        System.out.println("0.Thoát");
    }
    
}
