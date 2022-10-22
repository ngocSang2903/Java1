package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập tên : ");
		String name = ip.nextLine();
		name.trim();
		String lastName = name.substring(0, name.indexOf(" "));
		String firstName = name.substring(name.lastIndexOf(" ") + 1);
		String middename = name.substring(name.indexOf(" ") + 1, name.lastIndexOf(" "));
		lastName = lastName.toUpperCase();
		firstName = firstName.toUpperCase();
		System.out.println(lastName + " " + middename + " " + firstName);

		sanpham a = new sanpham("Áo", 10.5, "nokia");
		sanpham b = new sanpham("Quần", 10.5, "nokia");
		sanpham c = new sanpham("Giày", 10.5, "cy");
		sanpham d = new sanpham("Dép", 10.5, "nokia");
		sanpham e = new sanpham("Ngu", 10.5, "amy");
		ArrayList<sanpham> ngu = new ArrayList<sanpham>();
		ngu.add(a);
		ngu.add(b);
		ngu.add(c);
		ngu.add(d);
		ngu.add(e);
		for (sanpham i : ngu) {
			if (i.ktraHang("nokia")) {
				System.out.println(i);
			}
		}
	}
}
