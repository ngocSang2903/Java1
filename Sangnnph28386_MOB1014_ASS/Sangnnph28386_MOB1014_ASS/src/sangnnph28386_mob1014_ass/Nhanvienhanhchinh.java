/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sangnnph28386_mob1014_ass;

/**
 *
 * @author Admin
 */
public class Nhanvienhanhchinh extends Nhanvien{

    @Override
    public double getThunhap() {
        return super.getLuongCB();
     }

    public Nhanvienhanhchinh() {
    }

    public Nhanvienhanhchinh(String masv, String tensv, Double luongCB) {
        super(masv, tensv, luongCB);
    }
    
    
}
