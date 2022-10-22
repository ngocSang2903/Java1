
package lab8;

import java.util.Scanner;

public class Lab8 {
    public static double x;
    public static double sum(double ...x){
        double tong=0;
        for (double i : x) {
            tong=tong+i;
        }
        return tong;
        
    }
    public static double max(double ...x){
        double max = 0;
        for (double i : x) {
            for (double k : x) {
                if(max<i){
                    max=i;
                    i=k;
                    k=max;
                }
            }
            
        }
        return max;
    }
    public static double min(double ...x){
        double min = 999999999;
        for (double i : x) {
            for (double k : x) {
                if(min>i){
                    min=i;
                    i=k;
                    k=min;
                }
            }
            
        }
        return min;
    }
    public static String toUpperFirstChar(String s){
        String[] words = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String item=words[i];
            if(!item.equals("")){
                String ch=item.substring(0, 1).toUpperCase();
                item=ch+item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
        
        
    } 
    public static void menu(){
        System.out.println("--------Menu--------");
        System.out.println("1.Tính tổng");
        System.out.println("2.Tìm min,max");
        System.out.println("3.Viết hoa");
        System.out.println("--------------------");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chon;
        while(true){
            menu();
            System.out.println("Nhập vào số để thực hiện chức năng:");
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1: System.out.println("Tổng:"+sum(30,12,8.0,9,18));
                break;
                case 2: System.out.println("Max:"+max(30,12,8.0,9,18));
                        System.out.println("Min:"+min(30,12,8.0,9,18));
                break;
                case 3: System.out.println("Viết Hoa:"+toUpperFirstChar("vũ chí triều "));
            }
        }
    }
    
}                                                   