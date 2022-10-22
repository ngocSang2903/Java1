/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad_arraylist;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Lad_arraylist ds=new Lad_arraylist();
        int choise=0;
        do {            
            System.out.println("----------------------");
            System.out.println("1. Nhập danh sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính tổng");
            System.out.println("0. Thoát chương trình");
            System.out.println("-----------------------"); 
            choise=s.nextInt();
            
            if(choise!=0){
                switch(choise){
                    case 0:
                        System.exit(0);
                    case 1:
                        ds.nhap();
                    case 2:
                        ds.hienthi();
                    case 3:
                        ds.tinhtong();
                }
            }
            
            
        } while (choise != 0);
        
    }  
 }

