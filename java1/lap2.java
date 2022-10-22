package java1;

import java.util.Scanner;

public class lap2 {
	public static void ptrbac1() {
		Scanner ip = new Scanner(System.in);
		System.out.println("ax+b");
		System.out.println("a = ");
		float a1 = ip.nextFloat();
		System.out.println("b = ");
		float b1 = ip.nextFloat();
		if(a1==0) {
			if (b1==0) {
				System.out.println("Phương trình "+a1+"x + "+b1+"=0 có vô số nghiệm");
			}else {
				System.out.println("Phương trình "+a1+"x + "+b1+"=0 vô nghiệm");
			}
		}else {
			float x1 = -b1/a1 ;
			System.out.println("Phương trình "+a1+"x + "+b1+"=0 có nghiệm là x = "+x1);
		}
	}
	public static void ptrbac2() {
		Scanner ip = new Scanner(System.in);
		System.out.println("ax2 + bx2 + c =0");
		System.out.println("Nhập a,b,c (Cách nhau bởi dấu ,) : ");
		String v = ip.nextLine();
		String[] n = v.split(",");
		float x2 = Float.parseFloat(n[0]);
		float y2 = Float.parseFloat(n[1]);
		float z2 = Float.parseFloat(n[2]);
		if(x2==0) {
			if(y2==0) {
				if (z2==0) {
					System.out.println("Phương trình "+x2+"x2 + "+y2+"x + "+z2+"=0 có vô số nghiệm");
				}else {
					System.out.println("Phương trình "+x2+"x2 + "+y2+"x + "+z2+"=0 vô nghiệm");
				}
			}else {
				float v2 = -z2/y2 ;
				System.out.println("Phương trình "+x2+"x2 + "+y2+"x + "+z2+"=0 có nghiệm là x = "+v2);
			}
		}else {
			float delta = y2*y2-4*x2*z2;
			if(delta<0) {
				System.out.println("Phương trình "+x2+"x2 + "+y2+"x + "+z2+"=0 vô nghiệm");					
			}else if(delta==0) {
				System.out.println("Phương trình "+x2+"x2 + "+y2+"x + "+z2+"=0 có nghiệm kép x = "+(-y2/(2*x2)));
			}else {
				double canDelta = Math.sqrt(delta);
				System.out.println("Phương trình "+x2+"x2 + "+y2+"x + "+z2+"=0 có 2 nghiệm x1 = "+((-y2+canDelta)/(2*x2))+ " , x2 = "+((-y2-canDelta)/(2*x2)));

			}
		}	

	}
	public static void tienDien() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập só điện : ");
		float soDien = ip.nextFloat();
		if(soDien<=50 && soDien>=0) {
			float tienDien = soDien*1000;
			System.out.println("Số tiền điện là : "+tienDien);
		}else if(soDien>50) {
			float tienDien = 50*1000+(soDien-50)*1200;
			System.out.println("Số tiền điện là : "+tienDien);				
		}else {
			System.out.println("Số điện không hợp lệ");
		}

	}
	public static int kTraSoNgayTrongThang(int thang,int nam) {
		int songaymax = 0;
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			songaymax = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			songaymax = 30;
			break;
		case 2:
			if (nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0) {
				songaymax = 29;
			} else {
				songaymax = 28;
			}
			break;
		}
		return songaymax;
	}
	public static void menu() {
		System.out.println("+---------------------------------------------------+\r\n"
				+ "1. Giải phương trình bậc nhất\r\n"
				+ "2. Giải phương trình bậc 2\r\n"
				+ "3. Tính tiền điện\r\n"
				+ "4. Tìm số ngày trong tháng\n"
				+ "5. Kết thúc\r\n"
				+ "+---------------------------------------------------+\r\n"
				+ "Chọn chức năng: ");
	}
		public static void main(String[] args) {
			int z;
			Scanner ip = new Scanner(System.in);
			do {
				menu();
				z = Integer.parseInt(ip.nextLine());
				switch (z) {
				case 1: 
					ptrbac1();
					break;
				case 2:
					ptrbac2();
					break; 
					
				case 3: 
					tienDien();
					break;
				case 4:
					int thang=0;
					int nam = 0;
					do {
						System.out.print("Nhập tháng : ");
						thang = Integer.parseInt(ip.nextLine());
					}while(thang<1 || thang>12);
					if (thang == 2) {
						System.out.print("Nhập năm : ");
						nam = Integer.parseInt(ip.nextLine());
					}
					System.out.println("Số ngày là : "+kTraSoNgayTrongThang(thang, nam));
					break;
				case 5: 
					System.out.println("Thoát");
					break;
				
				default:
					System.out.println("Nhập sai vui lòng nhập lại ");
					break;
				}
			
			}while(z!=5);
			
}
}
