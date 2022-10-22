package java1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class lap3 {
public static void main(String[] args) {
	// Bài 1
	Scanner ip = new Scanner(System.in);
//	System.out.println("Nhập số nguyên : ");
//	int n = ip.nextInt();
//	int dem = 0;
//	if(n<=0) {
//		System.out.println("Không phải là số nguyên tố");
//	}else {
//		for (int i = 1; i <= Math.sqrt(n); i++) {
//			if(n%i==0) {
//				dem++;
//			}
//		}
//		if(dem==1) {
//			System.out.println("Là số nguyên tố");
//		}else {
//			System.out.println("Khống phải là số nguyên tố");
//		}
//	}
	// Bài 2
//	
//	for (int i = 1; i<=10;i++) {
//		for (int j = 1; j<10;j++) {
//			System.out.printf("%d * %d = %d",j,i,j*i);
//			System.out.print("\t");
//		}
//		System.out.println("");
//	}
//	
//	// Bài 3\
//	System.out.println("Nhập các phần tử của mảng cách nhau bởi dấu cach \" \" : ");
//	String nhapMang = ip.nextLine();
//	nhapMang.trim();
//	String x[]= nhapMang.split(" ");
//	float arr[] = new float[x.length];
//
//	for(int i=0 ; i<x.length;i++) {
//		arr[i]=Float.parseFloat(x[i]);
//	}
//	Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
//	System.out.println("Giá trị nhỏ nhất của mảng là : "+arr[0]);
//	int dem3 = 0;
//	float tong3 = 0;
//	for(float i : arr) {
//		if(i%3==0) {
//			tong3 += i;
//			dem3++;
//		}
//	}
//	float tb = tong3 / dem3;
//	
//	System.out.println("Trung bình : "+tb);
//	
	// Bài 4
	sinhvien dssv[];
	System.out.println("Số lượng sinh viên muốn nhập : ");
	String a1 = ip.nextLine();
	int slsv = Integer.parseInt(a1);
	dssv = new sinhvien [slsv];
	for(int i = 0; i<slsv;i++) {
		System.out.println("SV"+(i+1)+"\nNhập tên : ");
		String nhapTenSinhVien = ip.nextLine();
		dssv[i]=new sinhvien(nhapTenSinhVien);
		System.out.print("Nhập điểm :");
		String nhapDiem_S = ip.nextLine();
		float nhapDiem_f = Float.parseFloat(nhapDiem_S);
		dssv[i].setDiem(nhapDiem_f);
	}
	for(sinhvien i : dssv) {
		if(i.getDiem()>=0 && i.getDiem()<5) {
			 i.setHocLuc("Yếu");
		}else if(i.getDiem()>=5 && i.getDiem()<6.5) {
			 i.setHocLuc("Trung Bình");
		}else if(i.getDiem()>=6.5 && i.getDiem()<7.5) {
			 i.setHocLuc("Khá");
		}else if(i.getDiem()>=7.5 && i.getDiem()<9) {
			 i.setHocLuc("Giỏi");
		}else if(i.getDiem()>=9 && i.getDiem()<=10) {
			 i.setHocLuc("Xuất sắc");
		}
	}
	
	for (int i = 0; i < dssv.length-1; i++) {
		for (int j = i+1; j < dssv.length; j++) {
			 if(dssv[i].getDiem()>dssv[j].getDiem()) {
				 sinhvien tam = dssv[j];
				 dssv[j]=dssv[i];
				 dssv[i]=tam;
			 }
		}
	}
	System.out.printf("%35s %5s %15s\n","Họ và tên","Điểm","Học lực");
	for (int i = 0; i < dssv.length; i++) {
		System.out.printf("%35s %5s %15s\n",dssv[i].getHoVaTen(),dssv[i].getDiem(),dssv[i].getHocLuc());
	}
	
	
	
	
	
}
	
	
}
