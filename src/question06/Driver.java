/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.util.Scanner;

/**
 *
 * @author S542313
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean var = false;
        double s1 = 0, s2 = 0, s3 = 0;
        do {
            var = false;
            System.out.println("Enter side a of triangle: ");
            s1 = input.nextDouble();
            System.out.println("Enter side b of triangle: ");
            s2 = input.nextDouble();
            System.out.println("Enter side c of triangle: ");
            s3 = input.nextDouble();
            if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s2 <= s1) {
                System.out.println("sum of two side must be greater than other side");
                var = true;
            }
        } while (var == true);
        Triangle triangle = new Triangle(s1, s2, s3, "blue", true);
        System.out.println(triangle);
    }
    
    
}
