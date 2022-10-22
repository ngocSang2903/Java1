package java1;

public class sinhvien {
		private String hoVaTen;
		private float diem;
		private String hocLuc;
		public sinhvien(String hoVaTen) {
			this.hoVaTen = hoVaTen;
			this.diem = 0;
			this.hocLuc = null;
		}
		public String getHoVaTen() {
			return hoVaTen;
		}
		public String getHocLuc() {
			return hocLuc;
		}
		public void setHocLuc(String hocLuc) {
			this.hocLuc = hocLuc;
		}
		public void setHoVaTen(String hoVaTen) {
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
			this.hoVaTen = hoVaTen;
		}
		public float getDiem() {
			return diem;
		}
		public void setDiem(float diem) {
			if(diem>=0 && diem<=10) {
				this.diem = diem;
			}
		}
		@Override
		public String toString() {
			return "Họ và tên : " + hoVaTen + ", Điểm =" + diem ;
		}

		
		
}
