/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1002;

/**
 *
 * @author S542313
 */
public class GasStationSales implements GasStation{
    
    private double monthlyIncome;

    public GasStationSales(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    @Override
    public double calculateSales() {
        return this.monthlyIncome* 0.8;
    }

    @Override
    public String toString() {
        return  "The monthlyIncome is :" + monthlyIncome ;
    }
    
  
    
}
