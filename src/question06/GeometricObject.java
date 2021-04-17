/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author S542313
 */
public abstract class GeometricObject {

    private String color;
    private boolean isFilled;

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
