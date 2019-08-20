/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1;

import java.util.Scanner;

public class KonversiSuhu {
     
   public static void main(String[] args) {
       
       //deklarasi variable
       double fahrenheit , celcius;
      
       //membuat scanner
       Scanner input = new Scanner(System.in);
       
       //input
       System.out.println("Masukan suhu dalam Celcius = ");
       celcius = input.nextInt();
       
       //proses
       fahrenheit = (celcius * 9/5) + 32;
       
       //output
       System.out.println("Hasil Konversi Suhu dari Celcius ke Fahrenheit = "+fahrenheit);
       
   }
    
}





