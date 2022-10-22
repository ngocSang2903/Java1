package bai1;

public class kTraSoNgay {
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
	public static int tong(int a ,int...b) {
		int tong = a;
		for(int i : b) {
			tong += i;
		}
		return tong;
	}
	public static void main(String[] args) {
		int a[]= new int [5];
		System.out.println(tong(1,2,3,4));
	}
}
