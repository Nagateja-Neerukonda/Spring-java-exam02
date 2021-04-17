/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Neerukonda Nagateja
 */
public interface Vegetables {

    String STATUS = "FRESH";

    public abstract double getCalories();

    public default String measuredIn() {
        return "Kilograms";
    }
}

