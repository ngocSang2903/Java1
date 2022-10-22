package java1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// LAP 1
public class bai1 {
//	Bài 1
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.print("Nhập họ và tên : ");
			String hoVaTen = ip.nextLine();
					// Xử lí tên 
							hoVaTen = hoVaTen.trim();
							String item[] = hoVaTen.split(" ");
							String hoVaTenDaSua = "";
							for(String i:item) {
								String a = i.substring(0, 1);
								String b = i.substring(1);
								a = a.toUpperCase();
								b = b.toLowerCase();
								hoVaTenDaSua = hoVaTenDaSua + a+b+" ";
							}
							hoVaTenDaSua = hoVaTenDaSua.trim();
			System.out.print("Điểm : ");
			double diem = ip.nextDouble();
			ip.nextLine();
			System.out.println("<<"+hoVaTenDaSua+">> <<"+diem+">> điểm.");
			System.out.printf("<<%s>> <<%s>> điểm.",hoVaTenDaSua,diem);
			
	// Bài 2
			System.out.println("\nNhập chiều các dài cạnh(cách nhau bở dấu \",\" ):");
			String a = ip.nextLine();
			String b[] =  a.split(",");
			float canh1 = Float.parseFloat(b[0]);
			float canh2 = Float.parseFloat(b[1]);
			float chuVi = (canh1+canh2)*2;
			System.out.printf("Chu vi : %.2f",chuVi);
			System.out.println("\nDiện tích : "+(canh1*canh2));
			System.out.println("Cạnh nhỏ nhất "+Math.min(canh1, canh2));
			
	// Bài 3
			System.out.println("\nNhập chiều các dài cạnh :");
			double canhLapPhuong = ip.nextDouble();
			ip.nextLine();
			double theTichLapPhuong = Math.pow(canhLapPhuong, 3);
			System.out.println("Thể tích của khối lâp phương là : "+ theTichLapPhuong);
			
	// Bài 4
			System.out.println("\nax2 + bx2 + c =0");
			System.out.println("Nhập a,b,c (Cách nhau bởi dấu ,) : ");
			String v = ip.nextLine();
			String[] n = v.split(",");
			float x = Float.parseFloat(n[0]);
			float y = Float.parseFloat(n[1]);
			float z = Float.parseFloat(n[2]);
			float delta = y*y-4*x*z;
			double canDelta = Math.sqrt(delta);
			System.out.println("Căn delta của ptr ("+x+"x2 + "+y+"x + "+z+") là : "+canDelta);
			// bài 5
			 System.out.print("Nhập họ và tên : ");
				String hoVaTen1 = ip.nextLine();
						// Xử lí tên 
								hoVaTen1 = hoVaTen1.trim();
								String item1[] = hoVaTen1.split(" ");
								String hoVaTenDaSua1 = "";
								for(String i:item1) {
									String a1 = i.substring(0, 1);
									String b1 = i.substring(1);
									a1 = a1.toUpperCase();
									b1 = b1.toLowerCase();
									hoVaTenDaSua1 = hoVaTenDaSua1 + a1+b1+" ";
								}
								hoVaTenDaSua1 = hoVaTenDaSua1.trim();
				System.out.print("Tuổi : ");
				String tuoi = ip.nextLine();
	                        int tuoi1 = Integer.parseInt(tuoi);
	                        System.out.print("Cân năng : ");
				String can = ip.nextLine();
	                        float can1 = Float.parseFloat(can);
				System.out.println("<<"+hoVaTenDaSua1+">> <<"+tuoi1+" tuổi>>"+"<<"+can1+"kg>>");
				System.out.printf("<<%s>> <<%d tuổi>> <<%.2f kg>>",hoVaTenDaSua1,tuoi1,can1);
}
}