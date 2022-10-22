/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    private static bookstore book= null;
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner choise=new Scanner(System.in);
        int fusion=0;
        boolean flag=true;
        
        do{
        System.out.println("==========MENU===========");
        System.out.println("1.Add book");
        System.out.println("2.Edit book");
        System.out.println("3.Info book");
        System.out.println("4.Exit");
        System.out.println("=========================");
        System.out.println("Mời bạn nhập vào từ 1=>4 là: ");
        fusion=choise.nextInt();
        choise.nextLine();
            switch(fusion){
                case 1: addbook();  break;
                case 2:   break;
                case 3:  infobook(); break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }
            if(fusion==4)flag=false;
        }while(flag==true);
    }
    
    public static void addbook(){
        Scanner sc=new Scanner(System.in);
        String IDbook="";
        String Namebook="";
        
        
        System.out.print("Nhập IDbook: ");
        IDbook= sc.nextLine();
        System.out.print("Nhập Namebook : ");
        Namebook= sc.nextLine();
        
        bookstore book=new bookstore(IDbook,Namebook);
        
    }
    
    public static void infobook(){
        book.ShowInfo();
    }
    
}
