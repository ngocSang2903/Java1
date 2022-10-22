/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ass1_gđ1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ASS1_GĐ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        menu();
        chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                System.out.println("Bạn đã chọn chương trình 1:");
                Y1();
                break;
            case 2:
                System.out.println("Bạn đã chọn chương trình 2:");
                Y2();
                break;
            case 3:
                System.out.println("Bạn đã chọn chương trình 3:");
                Y3();
                break;
            case 4:
                System.out.println("Bạn đã chọn chương trình 4:");
                Y4();
                break;
            case 5:
                System.out.println("Bạn đã chọn chương trình 5:");
                Y5();
                break;
            case 6:
                System.out.println("Bạn đã chọn chương trình 6:");
                Y6();
                break;
            case 7:
                System.out.println("Bạn đã chọn chương trình 7:");
                Y7();
                break;
            case 8:
                System.out.println("Bạn đã chọn chương trình 8:");
                Y8();
                break;
            case 9:
                System.out.println("Bạn đã chọn chương trình 9:");
                Y9();
                break;
            case 0:
                System.out.println("Bạn đã thoát chương trình:");
                System.exit(0);
                break;
            default:
                System.out.println("Mời bạn chọn lại:");
        }

    }

    public static void menu() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
        System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
        System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
        System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
        System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
        System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
        System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
        System.out.println("0.Thoát chương trình");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Mời bạn chọn: ");
    }

    public static void Y1() {
        System.out.println("Bạn đã chọn chương trình 1");
    }

    public static void Y2() {
        System.out.println("Bạn đã chọn chương trình 2");
    }

    public static void Y3() {
        System.out.println("Bạn đã chọn chương trình 3");
    }

    public static void Y4() {
        System.out.println("Bạn đã chọn chương trình 4");
    }

    public static void Y5() {
        System.out.println("Bạn đã chọn chương trình 5");
    }

    public static void Y6() {
        System.out.println("Bạn đã chọn chương trình 6");
    }

    public static void Y7() {
        System.out.println("Bạn đã chọn chương trình 7");
    }

    public static void Y8() {
        System.out.println("Bạn đã chọn chương trình 8");
    }

    public static void Y9() {
        System.out.println("Bạn đã chọn chương trình 9");
    }

}
