/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baikiemtra;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baikiemtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DScat ds = new DScat();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Mời bạn chọn: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ds.inputDScat();
                    break;
                case 2:
                    ds.outputds();
                    break;
                case 3:
                    ds.findcat();
                    break;
                case 4:
                    ds.count();
                    break;
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("-------------------");
        System.out.println("1.  INPUT");
        System.out.println("2. OUTPUT");
        System.out.println("3. FINDCAT");
        System.out.println("4. COUNTCAT");
    }
}
