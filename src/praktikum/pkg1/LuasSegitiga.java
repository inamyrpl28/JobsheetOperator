/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        
        Double luas;
        int alas, tinggi;
        
        Scanner baca = new Scanner(System.in);
        
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas =  ");
        alas = baca.nextInt();
        System.out.print("Input tinggi =  ");
        tinggi = baca.nextInt();
        
        luas = Double.valueOf((alas * tinggi) /2);
        
        System.out.println("Luas = " + luas);
    }
}
