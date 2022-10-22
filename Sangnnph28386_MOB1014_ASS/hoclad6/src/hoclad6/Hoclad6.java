package hoclad6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hoclad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String email, mauemail = "\\w+@\\w+(\\.\\w+)(1,2)";

        while (true) {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if (email.matches(mauemail)) {
                System.out.println("Email đúng định dạng");
                break;
            } else {
                System.out.println("Email sai định dạng");
            }
        }
        System.out.println("Email bạn vừa nhập là:" + email);
    }
}
