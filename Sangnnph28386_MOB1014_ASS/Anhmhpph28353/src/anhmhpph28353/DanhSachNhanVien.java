/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anhmhpph28353;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DanhSachNhanVien {

    private ArrayList<Nhanvien> arr = new ArrayList<>();

    public void NhapTT() {
        Scanner so = new Scanner(System.in);
        arr.clear();
        do {
            System.out.println("Nhập loại nhân viên:");
            System.out.println("1.Hành chính");
            System.out.println("2.Trưởng phòng");
            System.out.println("3.Tiếp thị");
            System.out.println("4.Thoát");

            String loai = so.nextLine();

            if (loai == null || loai.equals("4")) {
                break;
            }

            int Loai = Integer.parseInt(loai);

            switch (Loai) {
                case 1:
                    Hanhchinh hc = new Hanhchinh();
                    hc.NhapTT(so);
                    arr.add(hc);
                    break;
                case 2:
                    Truongphong tp = new Truongphong();
                    tp.NhapTT(so);
                    arr.add(tp);
                    break;
                case 3:
                    Tiepthi tt = new Tiepthi();
                    tt.NhapTT(so);
                    arr.add(tt);
                    break;
            }
        } while (true);
    }

    public void XuatTT() {
        System.out.println("Danh sách nhân viên:");
        for (Nhanvien nv : arr) {
            if (nv instanceof Hanhchinh) {
                ((Hanhchinh) nv).XuatTT();
            } else if (nv instanceof Tiepthi) {
                ((Tiepthi) nv).XuatTT();
            } else if (nv instanceof Truongphong) {
                ((Truongphong) nv).XuatTT();
            }
            System.out.println("\n================");
        }
    }

    public void TimMa() {
        try {
            Scanner so = new Scanner(System.in);
            System.out.println("Mã cần tìm là:");
            String ma = so.nextLine();
            Nhanvien nvFound = null;
            for (Nhanvien nv : arr) {
                if (nv.getMa().equalsIgnoreCase(ma)) {
                    nvFound = nv;
                    break;
                }
            }
            if (nvFound != null) {
                System.out.println("Thông tin nhân viên được tìm thấy là:");
                nvFound.XuatTT();
            } else {
                System.out.println("Bạn nhập mã sai!" + ma);
            }

        } catch (Exception e) {
            System.out.println("Bạn nhập sai!");
            System.out.println("Lỗi ở:" + e);
        }
    }

    public void XoaMa() {
        try {
            Scanner so = new Scanner(System.in);
            System.out.println("Xóa nhân viên theo mã");
            System.out.print("Mã nhân viên cần xóa là:");
            String ma = so.nextLine();
            Nhanvien nvFound = null;
            for (Nhanvien nv : arr) {
                if (nv.getMa().equalsIgnoreCase(ma)) {
                    nvFound = nv;
                    break;
                }
            }
            if (nvFound != null) {
                arr.remove(nvFound);
                System.out.println("Nhân viên hiện đã được xóa!");
            } else {
                System.out.println("Không tìm thấy mã trong danh sách nhân viên" + ma);
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai!");
            System.out.println("Lỗi ở:" + e);
        }

    }

    public void CapNhat(Scanner so) {
        System.out.println("Cập nhật thông tin theo mã");
        System.out.println("Nhập mã nhân viên là:");
        String ma = so.nextLine();
        Nhanvien nvFound = null;

        for (Nhanvien cn : arr) {
            if (cn.getMa().equalsIgnoreCase(ma)) {
                nvFound = cn;
                break;
            }
        }
        if (nvFound != null) {
            System.out.println("Thông tin cập nhật cho nhân viên:");
            if (nvFound instanceof Hanhchinh) {
                ((Hanhchinh) nvFound).NhapTT(so);
            } else if (nvFound instanceof Truongphong) {
                ((Truongphong) nvFound).NhapTT(so);
            } else if (nvFound instanceof Tiepthi) {
                ((Tiepthi) nvFound).NhapTT(so);
            }
        } else {
            System.out.println("Bạn nhập sai mã nhân viên:" + ma);
        }
    }

    public void KhoanLuong(Scanner so) {
        try {
            System.out.println("Tìm nhân viên theo khoản lương");
            System.out.println("Nhập khoản lương bé nhất:");
            double Min = Double.parseDouble(so.nextLine());
            System.out.println("Nhập khoản lương lớn nhất:");
            double Max = Double.parseDouble(so.nextLine());
            boolean found = false;
            for (Nhanvien nv : arr) {
                if (Min <= nv.getLuong() && nv.getLuong() <= Max) {
                    nv.XuatTT();
                    System.out.println();
                }
            }
            if (found == false) {
                System.out.println("Không tìm thấy khoản lương cần tìm!");
            }
        } catch (Exception e) {
            System.out.println("Bạn nhập sai!");
            System.out.println("Lỗi ở:" + e);
        }

    }

    public void SapXepTen(){
        Collections.sort(arr, (a,b)->a.getHoTen().compareTo(b.getHoTen()));
    }
    public void SapXepThuNhap(){
        Collections.sort(arr, (a,b)->(int) (a.getThuNhap()- b.getThuNhap()));
    }
    public void Xuat5NV() {
        Collections.sort(arr, (a,b)->(int) (b.getThuNhap()- a.getThuNhap()));
        System.out.println("Danh sách nhân viên có thu nhập cao nhất là");
        for (int i = 0; i < 5 && i < arr.size(); i++) {
            arr.get(i).XuatTT();
        }
    }
}