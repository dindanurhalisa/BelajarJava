package com.dinda;

import java.util.Scanner;

/**
 * Created by Amir
 * FrogoBox Inc License
 * =========================================
 * BelajarJava
 * Copyright (C) 14/09/2021.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.dinda
 */
public class Programkasirsederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jumlahberas, harga1kg, totalbiaya, diskon;
        double setelahdiskon, uangpembeli, kembalian;
        System.out.println("Warung Beras Sederhana");
        //input jumlah beras yang dibeli per kg
        System.out.print("Jumlah Beras yang dibeli \t= ");
        jumlahberas = sc.nextDouble();
        //input harga beras per kg
        System.out.print("Harga 1 kg \t\t\t\t\t= ");
        harga1kg = sc.nextDouble();
        //hitung total biaya pembeli
        totalbiaya = jumlahberas * harga1kg;
        System.out.println("Total Biaya \t\t\t\t= " + totalbiaya);
        //hitung diskon 5%
        diskon = totalbiaya * 0.05;
        System.out.println("Total Diskon \t\t\t\t= " + diskon);
        //hitung total harga setelah diskon 5%
        setelahdiskon = totalbiaya - diskon;
        System.out.println("Total Setelah Diskon \t\t= " + setelahdiskon);
        //input uang pembeli
        System.out.print("Uang Pembeli \t\t\t\t= ");
        uangpembeli = sc.nextDouble();
        //hitung uang kembalian pembeli
        kembalian = uangpembeli - setelahdiskon;
        System.out.println("Kembalian Pembeli \t\t\t= " + kembalian);
    }
}
