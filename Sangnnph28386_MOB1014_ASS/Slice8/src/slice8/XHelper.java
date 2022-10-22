/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slice8;

/**
 *
 * @author Admin
 */
public class XHelper {

    public static int num;

    public int sum(int... x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }

    static public int sum(int... x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }
}
