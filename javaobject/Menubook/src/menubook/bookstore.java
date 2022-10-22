/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menubook;

/**
 *
 * @author Admin
 */
public class bookstore {
    private String namebook;
    private String IDbook;
    private double prive;

    public bookstore(String namebook, String IDbook, double prive) {
        this.namebook = namebook;
        this.IDbook = IDbook;
        this.prive = prive;
    }
    

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public void setIDbook(String IDbook) {
        this.IDbook = IDbook;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }

    public String getNamebook() {
        return namebook;
    }

    public String getIDbook() {
        return IDbook;
    }

    public double getPrive() {
        return prive;
    }
    
    public void showinfo(){
        System.out.println("Name is: "+ this.getNamebook());
        System.out.println("IDbook is: "+ this.getIDbook());
        System.out.println("Money is: "+ this.getPrive());
    }
    
}
