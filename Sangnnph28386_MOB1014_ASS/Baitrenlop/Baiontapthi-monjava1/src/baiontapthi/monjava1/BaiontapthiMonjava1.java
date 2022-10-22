/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baiontapthi.monjava1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiontapthiMonjava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DSNhanvien ds = new DSNhanvien();
        int chon;
        do {
            menu();
            System.out.println("Mời chọn chương trình: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ds.nhapdt();
                    break;
                case 2:
                    ds.xuatdscatuoi();
                    break;
                case 3:
                    ds.demnv18();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    ds.luonggiam();
                    break;
                case 10:
                    ds.tuoitang();
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    ds.tuoichan();
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("1.Nhập 1 đối tượng hoặc danh sách đối tượng\n"
                + "2. Xuất danh sách đối tượng (xuất cả tuổi). Tuổi =2021- namsinh\n"
                + "3. Xuất danh sách các NhanVien có luong>500\n"
                + "4. Xuất danh sách các NhanVien theo khoảng lương nhập từ bàn phím\n"
                + "5. Tìm NhanVien theo mã nhập từ bàn phím\n"
                + "6. Xuất các NhanVien có tuổi từ 18 đến 30\n"
                + "7. Đếm số NhanVien có tuổi >18\n"
                + "8. Sắp danh sách các NhanVien theo tenNV giảm dần\n"
                + "9. Sắp danh sách các NhanVien theo lương giảm dần\n"
                + "10. Sắp danh sách các NhanVien theo tuổi tăng dần\n"
                + "11. Tìm theo MaNV\n"
                + "12. Tìm theo TenNV\n"
                + "13. Xuất Danh sách Nhân Viên theo Trạng Thái\n"
                + "14. Xóa đối tượng theo MaNV\n"
                + "15. Xuất Danh sách NhanVien có tuổi chẵn\n"
                + "16. Xuất Danh sách Nhân Viên có tuổi lẻ\n"
                + "17. Xuất danh sách Nhân viên có tên bắt đầu với từ hoặc chữ cái (do\n"
                + "người dùng nhập)");
    }

}
