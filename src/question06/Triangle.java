/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Neerukonda Nagateja
 */
public class Triangle extends GeometricObject{
    
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3, String color, boolean isFilled) {
        super(color, isFilled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public double calculateArea() {
         double var =calculatePerimeter()/2;
        return Math.round(Math.sqrt(var*(var-s1)*(var-s2)*(var-s3))*100)/100.0;
    }

    @Override
    public double calculatePerimeter() {
       return Math.round(s1+s2+s3);
               }

    @Override
    public String toString() {
    return "Area: "+calculateArea()+"\n Perimeter: "+calculatePerimeter()+
                "\n Color: "+super.getColor()+"\n IsFilled: "+super.isIsFilled();
    }
}
