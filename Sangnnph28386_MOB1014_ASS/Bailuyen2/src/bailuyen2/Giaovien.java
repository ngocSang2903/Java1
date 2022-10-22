/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailuyen2;

/**
 *
 * @author Admin
 */
public class Giaovien {
    private String ID;
    private String Ten;
    private Double sogioday;

    public Giaovien() {
    }

    public Giaovien(String ID, String Ten, Double sogioday) {
        this.ID = ID;
        this.Ten = Ten;
        this.sogioday = sogioday;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Double getSogioday() {
        return sogioday;
    }

    public void setSogioday(Double sogioday) {
        this.sogioday = sogioday;
    }
    
    public void xuat(){
        System.out.println("ID: "+ID+"\nTên Giáo Viên: "+Ten+"\nSố Giờ Dạy: "+sogioday);
    }
}
