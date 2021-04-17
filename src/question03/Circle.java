/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Neerukonda Nagateja
 */
public class Circle {

    private double radius;
    private static final double ANGLE = 45;
    private double circumferenceOfSector;
    private double area;
    public static final double PIE = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        circumferenceOfSector = (ANGLE / 360) * (2 * PIE * radius);
        this.area = PIE * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle Details are :\n" + "radius=" + radius + ", circumferenceOfSector=" + circumferenceOfSector + ", area=" + area;
    }

}
