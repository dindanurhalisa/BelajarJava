package com.dinda;

import java.util.Scanner;

/**
 * Created by Amir
 * FrogoBox Inc License
 * =========================================
 * BelajarJava
 * Copyright (C) 10/09/2021.
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
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("kalkulator dinda");
        System.out.println("menu");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        Scanner dinda = new Scanner(System.in);
        int input = dinda.nextInt();
        System.out.print("masukkan angka 1 : ");
        int angka1 = dinda.nextInt();
        System.out.print("masukkan angka 2 : ");
        int angka2 = dinda.nextInt();
        if (input == 1) {
            double hasil = (angka1 + angka2);
            System.out.println(angka1 + "+" + angka2 + "=" + hasil);
        } else if (input == 2) {
            double hasil = (angka1 - angka2);
            System.out.println(angka1 + "-" + angka2 + "=" + hasil);
        } else if (input == 3) {
            double hasil = (angka1 * angka2);
            System.out.println(angka1 + "*" + angka2 + "=" + hasil);
        } else if (input == 4) {
            double hasil = (angka1 / angka2);
            System.out.println(angka1 + "/" + angka2 + "=" + hasil);
        }
    }
}
