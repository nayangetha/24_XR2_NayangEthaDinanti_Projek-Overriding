/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author MOKLET1
 */
 class Kubus extends BangunRuang{
     //deklarasi variable
     float sisi;
       //method overriding luas untuk menghitung luas permukaan kubus
       @Override
       float luas(){
          
           System.out.println("Sebuah kubus memiliki sisi "+sisi+"cm");
           //menghitung luas permukaan kubus
           float luas = 6 * sisi * sisi;
           System.out.println("Luas Permukaan Kubus = "+luas);
           //pengembalian nilai luas
           return luas;
       }
       //method overriding volume untuk menghitung volume kubus
       @Override
       float volume(){
           
           System.out.println("Sebuah kubus memiliki sisi "+sisi+"cm");
           //menghitung volume kubus
           float volume = sisi * sisi * sisi;
           System.out.println("Volume Kubus = "+volume);
           //pengembalian nilai volume
           return volume;
       }
    
}
