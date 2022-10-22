/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sangnnph28386_mob1014_ass;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sangnnph28386_MOB1014_ASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Thuchiendanhsach ds = new Thuchiendanhsach();
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn đã chọn chương trình 1:");
                    ds.Nhapdanhsach();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn chương trình 2:");
                    ds.xuatdanhsach();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn chương trình 3:");
                    ds.timnhanvien();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn chương trình 4:");
                    ds.xoanhanvien();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn chương trình 5:");
                    ds.capnhapnhanvien();
                    break;
                case 6:
                    System.out.println("Bạn đã chọn chương trình 6:");
                    ds.timnhanvientheoluong();
                    break;
                case 7:
                    System.out.println("Bạn đã chọn chương trình 7:");
                    ds.sapxeptheoten();
                    break;
                case 8:
                    System.out.println("Bạn đã chọn chương trình 8:");
                    ds.sapxeptheothunhap();
                    break;
                case 9:
                    System.out.println("Bạn đã chọn chương trình 9:");
                    ds.top5();
                    break;
                case 0:
                    System.out.println("Bạn đã thoát chương trình:");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn chọn lại:");
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("1. Nhập danh sách nhân viên .");
        System.out.println("2. Xuất danh sách nhân viên .");
        System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập .");
        System.out.println("4. Xóa nhân viên theo mã nhập từ .");
        System.out.println("5. Cập nhật thông tin nhân viên theo mã ");
        System.out.println("6. Tìm các nhân viên theo khoảng lương ");
        System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
        System.out.println("0.Thoát chương trình");
        System.out.println("Mời bạn chọn: ");
    }

}
