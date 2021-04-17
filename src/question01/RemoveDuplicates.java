/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Neerukonda Nagateja
 */
public class RemoveDuplicates {

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (Integer aList : list) {
            if (newList.contains(aList)) {
            } else {
                newList.add(aList);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer newList1 : newList) {
            System.out.print(" " + newList1);
        }
    }
    /**
     * Enter ten integers: 34 5 3 5 6 4 33 2 2 4
The distinct integers are 34 5 3 6 4 33 2

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter ten integers: ");
        for (int i = 1; i <= 10; i++) {
            list.add(sc.nextInt());
        }
        //System.out.println("Entered Integers :"+ list );
        removeDuplicate(list);
    }

}
