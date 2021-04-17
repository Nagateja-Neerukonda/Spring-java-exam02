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
public class Tomato implements Vegetables {

    private double price;

    public Tomato(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getCalories() {
        return 300.50;
    }

    @Override
    public String toString() {
        return "Tomato: " + "\nPrice:" + price
                + "\nMeasured in: " + Vegetables.super.measuredIn()
                + "\nCalories: " + getCalories();
    }

}

