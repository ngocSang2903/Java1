package java1;

public class sanpham {
	private String tenSanPham;
	private double donGia;
	private double giamGia;
	public sanpham(String tenSanPham, double donGia, double giamGia) {
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public sanpham(String tenSanPham, double donGia){
		this(tenSanPham, donGia, 0);
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	public double getThueNhapKhau() {
		double thue = (this.donGia+this.giamGia)*10/100;
		return thue;
	}
	public void getSanPham() {
		System.out.printf("Tên sản phẩm : %s\nĐơn giá : %f\nGiảm giá : %f\nThuế : %f ",tenSanPham,donGia,giamGia,getThueNhapKhau());
	}
	
}
