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
 class Balok extends BangunRuang{
     //deklarasi variable
     float panjang;
     float lebar;
     float tinggi;
     
     //method overriding luas untuk menghitung luas permukaan balok
     @Override
     float luas(){
         
         System.out.println("\nSebuah balok memiliki panjang "+panjang+"cm, lebar "
                 +lebar+"cm, dan tinggi "+tinggi+"cm");
         //menghitung luas permukaan balok
         float luas = 2 * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
         System.out.println("Luas Permukaan Balok = "+luas);
         //pengembalian nilai luas
         return luas;
     }
     //method overriding volume untuk menghitung volume balok
     @Override
     float volume(){
         
         System.out.println("\nSebuah balok memiliki panjang "+panjang+"cm, lebar "
                 +lebar+"cm, dan tinggi "+tinggi+"cm");
         //menghitung volume balok
         float volume = panjang * lebar * tinggi;
         System.out.println("Volume Balok = "+volume);
         //pengembalian nilai volume
         return volume;
     }
    
}
