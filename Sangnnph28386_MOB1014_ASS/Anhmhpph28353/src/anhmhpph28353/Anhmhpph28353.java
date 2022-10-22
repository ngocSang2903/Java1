/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Anhmhpph28353;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Anhmhpph28353 {
    public static Scanner so = new Scanner(System.in);
    public static DanhSachNhanVien ds = new DanhSachNhanVien();
    /**
     * @param args the command line arguments
     */
    public static void menu() {
        try {
            
            System.out.println("========Menu======");
            System.out.println("1.Nhập thông tin");
            System.out.println("2.Xuất thông tin");
            System.out.println("3.Tìm thông tin");
            System.out.println("4.Xóa nhân viên theo mã");
            System.out.println("5.Cập nhật thông tin nhân viên");
            System.out.println("6.Tìm các nhân viên theo khoản lương");
            System.out.println("7.Sắp xếp nhân viên theo họ và tên");
            System.out.println("8.Sắp xếp nhân viên theo thu nhập");
            System.out.println("9.Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("0.Kết thúc");
            System.out.println("Mời bạn nhập lựa chọn:");
            int luachon = Integer.parseInt(so.nextLine());
            switch (luachon) {
                case 1:
                    Y1();
                    break;
                case 2:
                    Y2();
                    break;
                case 3:
                    Y3();
                    break;
                case 4:
                    Y4();
                    break;
                case 5:
                    Y5();
                    break;
                case 6:
                    Y6();
                    break;
                case 7:
                    Y7();
                    break;
                case 8:
                    Y8();
                    break;
                case 9:
                    Y9();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn chọn sai chức năng!");
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai, mời bạn nhập lại");
            System.out.println("Lỗi ở:" + e);
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
    public static void Y1() {
        // TODO code application logic here
        ds.NhapTT();
    }
    public static void Y2() {
        ds.XuatTT();
    }
    public static void Y3() {
        ds.TimMa();
        System.out.println("\n===========");  
    }
    public static void Y4() {
        ds.XoaMa();
        System.out.println("==============");
        ds.XuatTT();
    }
    public static void Y5() {
        ds.CapNhat(so);
        System.out.println("==============");
        ds.XuatTT();
    }
    public static void Y6() {
        ds.KhoanLuong(so);
    }
    public static void Y7() {
        ds.SapXepTen();
        System.out.println("===============");
        ds.XuatTT();
    }
    public static void Y8(){
        ds.SapXepThuNhap();
        System.out.println("================");
        ds.XuatTT();
    }
    public static void Y9(){
        ds.Xuat5NV();
    }
    }