/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author Admin
 */
public class bookstore {
    private String Idbook;
    private String Name;
   
    
    public bookstore(String Idbook,String Name){
    this.Idbook=Idbook;
    this.Name=Name;
    
    }

    public void setIdbook(String Idbook) {
        this.Idbook = Idbook;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

  
    
    

    public String getIdbook() {
        return Idbook;
    }

    public String getName() {
        return Name;
    }

   
    
    
    
    public void ShowInfo(){
        System.out.println("ID book is : "+this.getIdbook());
        System.out.println("Name is : "+this.getName());
    }

    
}
