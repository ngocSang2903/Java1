package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
//		ArrayList<Float> ngu = new ArrayList<Float>();
//		while(true) {
//			System.out.println("Nhập số thực : ");
//			float b = Float.parseFloat(ip.nextLine());
//			ngu.add(b);
//			System.out.println("Nhập thêm (Y/N) ? ");
//			if(ip.nextLine().equalsIgnoreCase("N")) {
//				break;
//			}
//		}
//		System.out.print(ngu);
//		System.out.println("\n");
//		for(float i:ngu) {
//			System.out.printf(" %.2f ",i);
//		}
		
		// Bài 2
		ArrayList<String> name = new ArrayList<String>();
		while(true) {
			System.out.println("Nhập họ và tên : ");
			String b = ip.nextLine();
			
			if(b.equalsIgnoreCase("N")) {
				break;
			}else {
				name.add(b);
			}
		}
		System.out.println(name);
		Collections.shuffle(name) ;
		System.out.println("Ngẫu nhiên : "+name);
		Collections.sort(name);
		System.out.println("Sắp xếp tăng dần : "+name);
		Collections.reverse(name);
		System.out.println("Sắp xếp giảm dần : "+name);
		Collections.sort(name);
		System.out.printf("Nhập học và tên muốn tìm : ");
		String nameSearch = ip.nextLine();
		if(name.contains(nameSearch)) {
			System.out.println("Tìm thấy tên vừa nhập");
			System.out.printf("xác nhận xóa gõ Y :");
			if(ip.nextLine().equalsIgnoreCase("Y")) {
				name.remove(Collections.binarySearch(name, nameSearch));
				System.out.println("đã xóa");
				System.out.println(name);
			}
		}else {
			System.out.println("Không tìm thấy");
		}
		// bài 3
		ArrayList<sanphamx> kaka = new ArrayList<>();
		sanphamx a = new sanphamx("ngu1", (float) 0.1);
		sanphamx b = new sanphamx("ngu2", (float) 0.3);
		sanphamx c = new sanphamx("ngu3", (float) 1.2);
		sanphamx d = new sanphamx("ngu4", (float) 0.1);
		sanphamx e = new sanphamx("ngu5", (float) 0.5);
		kaka.add(a);
		kaka.add(b);
		kaka.add(c);
		kaka.add(d);
		kaka.add(e);
		System.out.println(kaka);
		Collections.sort(kaka);
		System.out.println(kaka);
		

		
	}
}
