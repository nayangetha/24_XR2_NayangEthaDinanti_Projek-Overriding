/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class Main {
    public static void main(String[] args) {
        
        //Scanner input
        Scanner input = new Scanner(System.in);
        // membuat objek print untuk class Bangun Ruang
        BangunRuang print = new BangunRuang();
        // membuat objek bangun1 untuk class Kubus
        Kubus bangun1 = new Kubus();
        bangun1.sisi = 10; //pengisian nilai sisi menggunakan objek bangun1
        // membuat objek bangun2 untuk class Balok
        Balok bangun2 = new Balok();
        bangun2.lebar = 5;    //pengisian nilai lebar menggunakan objek bangun2
        bangun2.panjang = 10; //pengisian nilai panjang menggunakan objek bangun2
        bangun2.tinggi = 15;  //pengisian nilai tinggi menggunakan objek bangun2
        //judul
        System.out.println("KALKULATOR BANGUN RUANG");
        //pilihan bangun ruang
        System.out.print("1. Kubus \n2. Balok \nPilihan = ");
        //input pilihan user
        String pilihan = input.nextLine();
        //percabangan untuk menentukan pilihan user
        //jika user memilih nomor 1, maka akan menghitung kubus
        if (pilihan.equalsIgnoreCase("1")){
            //pilihan perhitungan bangun ruang
            System.out.print("\n1. Luas Permukaan \n2. Volume \nPilihan = ");
            //input pilihan user
            String p1 = input.nextLine();
            //percabangan untuk menentukan pilihan user
            //jika user memilih nomor 1, maka akan menghitung luas permukaan kubus
            if (p1.equalsIgnoreCase("1")){
                //pemanggilan method overriding luas pada class BangunRuang menggunakan objek print
                print.luas();
                //pemanggilan method overriding luas pada class Kubus menggunakan objek bangun1
                bangun1.luas();
            }
            //jika user memilih nomor 2, maka akan menghitung volume kubus
            else if (p1.equalsIgnoreCase("2")){
                //pemanggilan method overriding volume pada class BangunRuang menggunakan objek print
                print.volume();
                //pemanggilan method overriding volume pada class Kubus menggunakan objek bangun1
                bangun1.volume();
            } 
        }
        //jika user memilih nomor 1, maka akan menghitung balok
        else if(pilihan.equalsIgnoreCase("2")){
           //pilihan perhitungan bangun ruang
            System.out.print("\n1. Luas Permukaan \n2. Volume \nPilihan = ");
            //input pilihan user
            String p2 = input.nextLine();
            //percabangan untuk menentukan pilihan user
            //jika user memilih nomor 1, maka akan menghitung luas permukaan kubus
            if (p2.equalsIgnoreCase("1")){
                //pemanggilan method overriding luas pada class BangunRuang menggunakan objek print
                print.luas();
                //pemanggilan method overriding luas pada class Balok menggunakan objek bangun2
                bangun2.luas();
            }
            //jika user memilih nomor 2, maka akan menghitung volume kubus
            else if (p2.equalsIgnoreCase("2")){
                //pemanggilan method overriding volume pada class BangunRuang menggunakan objek print
                print.volume();
                //pemanggilan method overriding volume pada class Balok menggunakan objek Bangun2
                bangun2.volume();
            }
        }   
    }  
}
