/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lad_arraylis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class danhsachhocsinh {
    private ArrayList<String> list=new ArrayList<>();
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.print("Nhap ho ten: ");
            String enter=sc.nextLine();
            if(enter.isEmpty()){
                break;
            }
            list.add(enter);
        } while (true);
    }
    public void xuat(){
        System.out.println("Hien thi danh sach la: ");
        for (String string : list) {
            System.out.print("Ho ten: "+string);
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
        System.out.print("Nhap ho ten can tim va xoa: ");
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
            System.out.println("1. Nhap ho ten: ");
            System.out.println("2. Hien thi danh sach la: ");
            System.out.println("3. Xuat ngau nhien: ");
            System.out.println("4. Sap xep danh sach: ");
            System.out.println("5. Tim va xoa: ");
            System.out.println("0. Thoat chuong trinh: ");
            System.out.println("--------------------------");
            System.out.println("Moi ban chon: ");
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
