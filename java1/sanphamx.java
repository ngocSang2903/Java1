package java1;

public class sanphamx implements Comparable<sanphamx>{
	private String name;
	private float price;
	public sanphamx(String name, float d) {
		this.name = name;
		this.price = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "sanphamx [name=" + name + ", price=" + price + "]";
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int compareTo(sanphamx o) {
		if(this.price>o.price) {
			return -1;
		}else if (this.price==o.price) {
			return 0;
		}else {
			return 1;
		}
	}
	
}
