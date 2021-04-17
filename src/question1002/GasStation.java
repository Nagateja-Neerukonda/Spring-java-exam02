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

public interface GasStation {
    
        public abstract double calculateSales();
    
    public default void foo(){
        System.out.println("Default method foo() in Interface01");
    }
}