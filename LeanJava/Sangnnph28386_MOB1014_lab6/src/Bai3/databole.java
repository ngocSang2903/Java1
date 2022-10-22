/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class databole {
    public boolean isEmail(String st){
        
        String pattern="\\w+@\\w+\\.\\w+";
        return st.matches(pattern);
        
    }
    public boolean isSDT(String st){
        
        String pattern="0\\d(9)";
        return st.matches(pattern);
        
    }
    public boolean isCMND(String st){
        
        String pattern="\\d(9)";
        return st.matches(pattern);
        
    }
}
