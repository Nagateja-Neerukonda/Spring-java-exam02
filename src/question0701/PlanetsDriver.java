/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question0701;


/**
 *
 * @author Neerukonda Nagateja
 */
public class PlanetsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The list of Planets in solor system and its Diameter:");
        System.out.println("");
        for (PlanetNamesEnum value : PlanetNamesEnum.values()) {
            System.out.println(value.name().toLowerCase() + ": " + value.getPlanetDiameter() + "Miles");
        }
    }
    
}
