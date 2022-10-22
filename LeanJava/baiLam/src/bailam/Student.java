/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailam;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student{
    String manv;
    String tennv;
    Double diemToan;
    Double diemVan;

    public Student() {
    }

    public Student(String manv, String tennv, Double diemToan, Double diemVan) {
        this.manv = manv;
        this.tennv = tennv;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public Double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(Double diemToan) {
        this.diemToan = diemToan;
    }

    public Double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(Double diemVan) {
        this.diemVan = diemVan;
    }
    
}
