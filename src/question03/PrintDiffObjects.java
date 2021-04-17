/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542313
 */
public class PrintDiffObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Object> list= new ArrayList<Object>();
        
        Loan loanObj = new Loan(100000.0, 7.5, "Education");
        //System.out.println(loanObj);
        Circle circleObj = new Circle(5.0);
        Date date = new Date();
        String str = "Hello";

        list.add(loanObj);
        list.add(circleObj);
        list.add(date);
        list.add(str);
        //System.out.println(list);
        for (Object obj : list) {
            System.out.println(obj);
        }

    }

}
