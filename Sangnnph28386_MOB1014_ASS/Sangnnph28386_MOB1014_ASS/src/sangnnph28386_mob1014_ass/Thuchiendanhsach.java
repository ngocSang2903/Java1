/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sangnnph28386_mob1014_ass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Thuchiendanhsach {

    public ArrayList<Nhanvien> list = new ArrayList<>();

    public void Nhapdanhsach() {
        int chon;
        do {
                 Scanner sc = new Scanner(System.in);
            System.out.println("----------------------");
            System.out.println("1,Nhan vien hanh chinh");
            System.out.println("2,Nhan vien tiep thi");
            System.out.println("3.truong phong");
            System.out.println("0.thoat");
            System.out.println("----------------------");
            System.out.println("Moi ban chon: ");

            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    Nhanvienhanhchinh newnvhc = new Nhanvienhanhchinh();
                    newnvhc.nhaptt();
                    list.add(newnvhc);
                    break;
                case 2:
                    Nhanvientiepthi nvtt = new Nhanvientiepthi();
                    nvtt.nhaptt();
                    list.add(nvtt);
                    break;
                case 3:
                    Truongphong tp = new Truongphong();
                    tp.nhaptt();
                    list.add(tp);
                    break;
            }
            
        } while (chon!=0);
        
        
    }

    public void xuatdanhsach() {
        for (Nhanvien nv : list) {
            if (nv instanceof Nhanvienhanhchinh) {
                ((Nhanvienhanhchinh) nv).xuattt();
            } else if (nv instanceof Truongphong) {
                ((Truongphong) nv).xuattt();
            } else if (nv instanceof Nhanvientiepthi) {
                ((Nhanvientiepthi) nv).xuattt();
            }
        }
    }

    public void timnhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh???p m?? nh??n vi??n c???n t??m: ");
        String ma = sc.nextLine();
        boolean flag = false;
        for (Nhanvien nv : list) {
            if (nv.getMasv().equalsIgnoreCase(ma)) {
                flag = true;
                if (nv instanceof Nhanvienhanhchinh) {
                    ((Nhanvienhanhchinh) nv).xuattt();
                } else if (nv instanceof Truongphong) {
                    ((Truongphong) nv).xuattt();
                } else if (nv instanceof Nhanvientiepthi) {
                    ((Nhanvientiepthi) nv).xuattt();
                }
                break;
            }
            if (flag == false) {
                System.out.println("kh??ng t??m th???y nh??n vi??n");
            }
        }
    }

    public void xoanhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh???p nh??n vi??n c???n x??a: ");
        String ma = sc.nextLine();
        boolean flag = false;
        for (Nhanvien nv : list) {
            if (nv.getMasv().equalsIgnoreCase(ma)) {
                flag = true;
                list.remove(nv);
                break;
            }
        }
        if (flag == false) {
            System.out.println("kh??ng t??m th???y nh??n vi??n");
        }
    }

    public void capnhapnhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh???p nh??n vi??n c???n c???p nh???p: ");
        String ma = sc.nextLine();
        boolean flag = false;
        for (Nhanvien nv : list) {
            if (nv.getMasv().equalsIgnoreCase(ma)) {
                flag = true;
                if (nv instanceof Nhanvienhanhchinh) {
                    ((Nhanvienhanhchinh) nv).nhaptt();
                } else if (nv instanceof Truongphong) {
                    ((Truongphong) nv).nhaptt();
                } else if (nv instanceof Nhanvientiepthi) {
                    ((Nhanvientiepthi) nv).nhaptt();
                }
                break;
            }
            if (flag == false) {
                System.out.println("kh??ng t??m th???y nh??n vi??n");
            }
        }
    }

    public void timnhanvientheoluong() {
        Scanner sc = new Scanner(System.in);
        double bd=0;
        double kt=0;
        do {
            System.out.print("Nh???p kho???ng l????ng b???t ?????u: ");
            bd = Double.parseDouble(sc.nextLine());
            System.out.println("Nh???p kho???ng l????ng k???t th??c");
            kt = Double.parseDouble(sc.nextLine());
            if (bd > kt) {
                System.out.println("Nh???p l???i");
            } else {
                break;
            }
        } while (true);

        boolean flag = false;
        for (Nhanvien nv : list) {
            if (nv.getThunhap()>=bd && nv.getThunhap()<=kt) {
                flag = true;
                if (nv instanceof Nhanvienhanhchinh) {
                    ((Nhanvienhanhchinh) nv).xuattt();
                } else if (nv instanceof Truongphong) {
                    ((Truongphong) nv).xuattt();
                } else if (nv instanceof Nhanvientiepthi) {
                    ((Nhanvientiepthi) nv).xuattt();
                }
                break;
            }
            if (flag == false) {
                System.out.println("kh??ng t??m th???y nh??n vi??n");
            }
        }
    }
    public void sapxeptheoten(){
        Collections.sort(list,(nv1,nv2)->(int)(nv1.getTensv().compareTo(nv2.getTensv())));
    }
    public void sapxeptheothunhap(){
        Collections.sort(list,(nv1,nv2)->(int)(nv2.getThunhap()-(nv1.getThunhap())));
    }
    public void top5(){
        sapxeptheothunhap();
        for(int i=0;i<=5;i++){
            if(list.get(i) instanceof Nhanvienhanhchinh){
                ((Nhanvienhanhchinh) list.get(i)).xuattt();
            }else if(list.get(i) instanceof Truongphong){
                ((Truongphong) list.get(i)).xuattt();
            }else if(list.get(i) instanceof Nhanvientiepthi){
                ((Nhanvientiepthi) list.get(i)).xuattt();
            }
        }
        int i=0;
        for(Nhanvien nv:list){
            if (nv instanceof Nhanvienhanhchinh) {
                    ((Nhanvienhanhchinh) nv).xuattt();
                } else if (nv instanceof Truongphong) {
                    ((Truongphong) nv).xuattt();
                } else if (nv instanceof Nhanvientiepthi) {
                    ((Nhanvientiepthi) nv).xuattt();
                }
            i++;
            if(i==5){
                break;
            }
        }
    }
}
