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
public enum AlcoholEnum {
    BEER(6), WHISKY(40), VODKA(40), BREEZER(1);

    private int percentage;

    private AlcoholEnum(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }

}
