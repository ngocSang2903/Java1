/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikiemtra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DScat {

    ArrayList<Cat> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void inputDScat() {
        System.out.print("Số lượng muốn nhập : ");
        int x = Integer.parseInt(this.sc.nextLine());
        for (int i = 0; i < x; i++) {
            Cat a = new Cat();
            a.input();
            list.add(a);
        }
    }

    public void outputds() {
        for (Cat cat : list) {
            cat.output();
        }
    }

    public void findcat() {
        int v = 0;
        for (Cat cat : list) {
            if (cat.getWeight() > 3) {
                cat.output();
                v++;
            }
        }
    }

    public void count() {
        int count = 0;
        for (Cat cat : list) {

            if (cat.getWeight() > 1 && cat.getWeight() < 5) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("không có con mèo nào cân nặng từ 1-5 kg");
        } else {
            System.out.println("có" + count + "cân nặng từ 1-5kg");
        }
    }
}
