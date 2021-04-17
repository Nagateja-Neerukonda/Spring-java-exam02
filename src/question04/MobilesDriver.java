/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author Nagateja Neerukonda
 */
public class MobilesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MobilePhones phones = new MobilePhones();
        MobilePhones NonAppleFamily = new NonAppleFamily();
        MobilePhones appPhones = new AppleFamily();

        // late binding polymorphism
        phones.mainPurpose();
        NonAppleFamily.mainPurpose();
        appPhones.mainPurpose();
    }

}
