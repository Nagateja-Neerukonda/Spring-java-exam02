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
public enum PlanetNamesEnum {
    
     
    MERCURY(3300), VENUS(4200), EARTH(5000), MARS(5500), JUPITER(6000), SATURN(6400), URANUS(7000), NEPTUNE(7200),PLUTO(8000);
    
    private int planetDiameter;

    private PlanetNamesEnum(int planetDiameter) {
        this.planetDiameter = planetDiameter;
    }

    public int getPlanetDiameter() {
        return planetDiameter;
    }

}
