/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baituluyen;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baituluyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        QLsinhvien ds=new QLsinhvien();
        do {
            menu();
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    ds.nhaptt();
                    break;
                case 2:
                    ds.xuat();
                    break;
                case 3:
                    ds.tinhtuoi();
                    break;
                case 4:
                    ds.timsv();
                    break;
                case 5:
                    ds.sinhvienudpm();
                    break;
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("1.Nhập thông tin sinh viên");
        System.out.println("2.Xuất thông tin sinh viên");
        System.out.println("3.Xuất danh sách sv có tuổi từ 20 trở lên");
        System.out.println("4.Tìm sv theo mã");
        System.out.println("0.Thoát");
        System.out.println("Mời bạn chọn chương trình: ");
    }

}
