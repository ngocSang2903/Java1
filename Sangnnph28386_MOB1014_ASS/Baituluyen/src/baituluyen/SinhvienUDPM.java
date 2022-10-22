/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baituluyen;

/**
 *
 * @author Admin
 */
public class SinhvienUDPM extends Sinhvien{
    private Double diemjava;
    private Double diemCsharp;

    public SinhvienUDPM() {
    }
    public SinhvienUDPM(Double diemjava, Double diemCsharp, String masv, String Ten, int Namsinh) {
        super(masv, Ten, Namsinh);
        this.diemjava = diemjava;
        this.diemCsharp = diemCsharp;
    }

    public Double getDiemjava() {
        return diemjava;
    }

    public void setDiemjava(Double diemjava) {
        this.diemjava = diemjava;
    }

    public Double getDiemCsharp() {
        return diemCsharp;
    }

    public void setDiemCsharp(Double diemCsharp) {
        this.diemCsharp = diemCsharp;
    }
    public void xuatudpm(){
        super.xuat();
        System.out.println("\n Điểm java: "+diemjava+"\nĐiểm csch"+diemCsharp);
    }
}
