/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Neeerukonda Nagateja
 */
public class CheckIdenticalArrays {

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                if (m1[row][col] != m2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Enter list1: 51 22 25 6 1 4 24 54 6 Enter list2: 51 22 25 6 1 4 24 54 6
     * The two arrays are strictly identical
     *
     * Enter list1: 51 25 22 6 1 4 24 54 6 Enter list2: 51 22 25 6 1 4 24 54 6
     * The two arrays are not strictly identical
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list 1: ");
        for (int[] m11 : m1) {
            for (int col = 0; col < m11.length; col++) {
                m11[col] = sc.nextInt();
            }
        }

        System.out.print("Enter list 2: ");
        for (int[] m21 : m2) {
            for (int col = 0; col < m21.length; col++) {
                m21[col] = sc.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

}
