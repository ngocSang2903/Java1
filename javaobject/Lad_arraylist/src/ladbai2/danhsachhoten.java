/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ladbai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class danhsachhoten {
    private ArrayList<String> list=new ArrayList<>();
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.print("Nhập họ tên: ");
            String enter=sc.nextLine();
            if(enter.isEmpty()){
                break;
            }
            list.add(enter);
        } while (true);
    }
    public void xuat(){
        System.out.println("Hiển thị danh sách là: ");
        for (String string : list) {
            System.out.print("Họ tên: "+string);
            System.out.println("");
        }
        
    }
    public void xuatngaunhien(){
         Collections.shuffle(list);
         xuat();
     }
     
    public void sapxep(){
        Collections.sort(list, (a,b)->a.compareTo(b));
        xuat();
    }
    public void timvaxoa(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập họ tên cần tìm và xóa: ");
        String hoten=sc.nextLine();
        
        for (String string : list) {
            if(string.equals(hoten)){
                list.remove(list);
                break;
            }
        }
    }
    public void menu(){
        Scanner s=new Scanner(System.in);
        int choise=0;
        
        do {            
            System.out.println("-------------------------");
            System.out.println("1. Nhập họ tên: ");
            System.out.println("2. Hiển thị danh sách: ");
            System.out.println("3. Xuất ngẫu nhiên: ");
            System.out.println("4. Sặp xếp danh sách: ");
            System.out.println("5. Tìm và xóa: ");
            System.out.println("0. Thoát chương trình: ");
            System.out.println("--------------------------");
            System.out.println("Mời bạn chọn: ");
            choise=s.nextInt();
            
            if(choise!=0){
                switch(choise){
                    case 0:
                        System.exit(0);
                    case 1:
                        nhap();
                    case 2:
                        xuat();
                    case 3:
                        xuatngaunhien();
                    case 4:
                        sapxep();
                    case 5:
                        timvaxoa();    
                }
            }
            
        } while (choise!=0);
        
        
    }
    
}
