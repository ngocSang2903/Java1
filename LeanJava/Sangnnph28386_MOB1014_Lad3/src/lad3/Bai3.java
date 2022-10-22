/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng bởi dấu cách: ");
        String mang=Scanner.nextLine();
        mang.trim();
        String x[]=mang.split(" ");
        float arr[]=new float [x.length];
        for(int i=0;i<x.length;i++){
            arr[i]=Float.parseFloat(x[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Phần tử nhỏ nhất của mảnh là: "+arr[0]);
        int dem=0;
        float tong=0;
        for(float i:arr){
            if(i%3==0){
                tong+=i;
                dem++;
            }
        }
        float tb=tong/dem;
        System.out.println("trung bình: "+tb);
    }
}
