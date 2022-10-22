/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailam;

import java.util.ArrayList;
import java.util.Scanner;
import javax.management.MBeanServer;

/**
 *
 * @author Admin
 */
public class danhsach {
    ArrayList<Student> list=new ArrayList<>();
    
    public void nhaptt(){
        do {            
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        String masv=sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String tensv=sc.nextLine();
        System.out.println("Nhập điểm toán: ");
        Double diemtoan=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm văn: ");
        Double diemvan=Double.parseDouble(sc.nextLine());
        System.out.println("bạn có muốn tiếp tục chon Y thoát chọn N:");
        String chon=sc.nextLine();
        Student dz=new Student(masv,tensv,diemtoan,diemvan);
        list.add(dz);
        if(chon.equals("N")){
            break;
        }
        } while (true);
    }
    public void xuattt(){
        for(Student ex:list){
            System.out.printf();
            list.add(ex);
        }
    }
}
