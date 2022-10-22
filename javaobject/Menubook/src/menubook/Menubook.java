/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menubook;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Menubook {

    /**
     * @param args the command line arguments
     */
    private static bookstore bookone= null ;
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
        boolean flag=true;
        do{
        System.out.println("------------MENUBOOk-------------");
        System.out.println("1.addbook");
        System.out.println("2.editbook");
        System.out.println("3.infobook");
        System.out.println("0.exit");
        System.out.println("your choise[1=>4]: ");
        int choise=sc.nextInt();
        switch(choise){
            case 1 :   addbook();  break;
            case 2 :   editbook();  break;
            case 3 :   infobook();  break;
            
        }
        if(choise==0) flag=false;
    }while(flag==true);
    }
    
    public static void addbook(){
        Scanner bk=new Scanner(System.in);
        System.out.println("Enter namebook: ");
        String name=bk.nextLine();
        System.out.println("Enter IDbook: ");
        String ID=bk.nextLine();
        System.out.println("Enter money: ");
        Double money=bk.nextDouble();
        bookone = new bookstore(name,ID,money);
        
    }
    
    public static void editbook(){
        if(bookone != null){
        Scanner bk=new Scanner(System.in);
        
        System.out.println("Enter namebook: ");
        String name=bk.nextLine();
        
        System.out.println("Enter money: ");
        Double money=bk.nextDouble();
        
        bookone.setNamebook(name);
        bookone.setPrive(money);
            
        }else{
            System.out.println("Bạn chưa thêm thông tin");
        }
    }
    
    
    public static void infobook(){
        if(bookone != null){
            bookone.showinfo();
        }else{
            System.out.println("Bạn chưa thêm thông tin");
        }
    }
    
}
