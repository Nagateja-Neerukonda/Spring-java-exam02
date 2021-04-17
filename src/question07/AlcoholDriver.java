/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author S542313
 */
public class AlcoholDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The list of beverages and the alcohol percentage:");
        for (AlcoholEnum value : AlcoholEnum.values()) {
            System.out.println(value.name().toLowerCase() + ": " + value.getPercentage() + "%");
        }
    }

}
