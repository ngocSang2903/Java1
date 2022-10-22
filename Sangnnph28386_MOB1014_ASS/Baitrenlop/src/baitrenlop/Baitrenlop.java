/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitrenlop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baitrenlop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int chon;
        QLAnimal ds=new QLAnimal();
        LittleAnimal df=new LittleAnimal();
        do {
            menu();
            System.out.println("Mời chọn chương trình: ");
            chon=sc.nextInt();
            switch(chon){
                case 1: ds.nhapdt();
                break;
                case 2: ds.xuatdt();
                break;
                case 3: ds.tuoitu();
                break;
                case 4: ds.xoa();
                break;
                case 5: ds.sapxep();
                break;
                case 6: 
                    LittleAnimal a=new LittleAnimal("sang";4;"xanh";6);
                break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("1.Nhập");
        System.out.println("2.xuất");
        System.out.println("3.in tuổi từ 3 đến 5");
        System.out.println("4.xóa");
        System.out.println("5.sắp xếp");
        System.out.println("6.kế thừa");
        System.out.println("0.thoát");
    }
}
