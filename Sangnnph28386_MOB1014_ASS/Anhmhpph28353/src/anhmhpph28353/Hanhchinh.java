/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anhmhpph28353;

/**
 *
 * @author admin
 */
public class Hanhchinh extends Nhanvien{
    
    public Hanhchinh(String Ma, String hoTen, double luong) {
        super(Ma, hoTen,"Hành chính", luong);
    }
    
    public Hanhchinh() {
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }
    
}