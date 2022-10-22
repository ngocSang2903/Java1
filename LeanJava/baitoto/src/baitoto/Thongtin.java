/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoto;

/**
 *
 * @author Admin
 */
public class Thongtin {
    private String name;
    private String clas;
    private double tuoi;

    public Thongtin() {
    }

    public Thongtin(String name, String clas, double tuoi) {
        this.name = name;
        this.clas = clas;
        this.tuoi = tuoi;
    }
    
    Thongtin(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public double getTuoi() {
        return tuoi;
    }

    public void setTuoi(double tuoi) {
        this.tuoi = tuoi;
    }
    public void xuat(){
        System.out.printf(name+"-"+clas+"-"+tuoi);
    }
    
}
