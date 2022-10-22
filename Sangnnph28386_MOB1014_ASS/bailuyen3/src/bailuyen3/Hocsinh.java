/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyen3;

/**
 *
 * @author Admin
 */
public class Hocsinh {
    private String mahs;
    private String tenhs;
    private Double diem;

    public Hocsinh() {
    }

    public Hocsinh(String mahs, String tenhs, Double diem) {
        this.mahs = mahs;
        this.tenhs = tenhs;
        this.diem = diem;
    }

    public String getMahs() {
        return mahs;
    }

    public void setMahs(String mahs) {
        this.mahs = mahs;
    }

    public String getTenhs() {
        return tenhs;
    }

    public void setTenhs(String tenhs) {
        this.tenhs = tenhs;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }
    
    public void xuat(){
        System.out.println("Mã Học sinh: "+mahs+"\n Tên học sinh: "+tenhs+"\n Điểm: "+diem);
    }
}
