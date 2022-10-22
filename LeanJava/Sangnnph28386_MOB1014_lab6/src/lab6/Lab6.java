/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner eu=new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String name=eu.nextLine();
        String trim = name.trim();
        String ho=name.substring(0,name.indexOf(" ")).toUpperCase();
        String tenDem=name.substring(name.indexOf(" "),name.lastIndexOf(" "));
        String ten=name.substring(name.lastIndexOf(" "),0);
        System.out.printf("%s  %s  %s",ho,tenDem,ten);
    }
    
}
