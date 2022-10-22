package java1;

public class lap4 {
		public static void main(String[] args) {
			sanpham a = new sanpham("Cục cứt vàng", 1000, 10);
			sanpham b = new sanpham("Cục cứt bạc", 5000, 1000);
			a.getSanPham();
			System.out.println("\n");
			b.getSanPham();
			sanpham c = new sanpham("Cục cứt sắt", 10000);
			System.out.println("\n");
			c.getSanPham();
			
			
		}
}
