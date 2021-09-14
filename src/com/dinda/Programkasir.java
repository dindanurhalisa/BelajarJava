package com.dinda;

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
public class Programkasir {
    public static void main(String[] args) {
        double beras = 5;
        double kg = 9500;
        double potongan = 0.05;
        double uangpembeli = 50000;
        double beli = beras * kg;
        double diskon = beli * potongan;
        double setelahdiskon = beli-diskon;
        System.out.println("Beras yang dibeli \t\t\t\t= " + beras + " kg");
        System.out.println("Harga beras per kg \t\t\t\t= " + kg);
        System.out.println("Total biaya \t\t\t\t\t= " + beli);
        System.out.println("Total biaya setelah diskon 5% \t= " + setelahdiskon);
        System.out.println("Uang yang dikeluarkan pembeli \t= " + uangpembeli);
        System.out.println("Uang kembalian \t\t\t\t\t= " + (uangpembeli-setelahdiskon));
    }
}
