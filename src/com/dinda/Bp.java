package com.dinda;

import java.util.Scanner;

/**
 * Created by Amir
 * FrogoBox Inc License
 * =========================================
 * BelajarJava
 * Copyright (C) 13/09/2021.
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
public class Bp {
    public static void main(String[] args) {
        System.out.print("Masukkan nama : ");
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        System.out.print("Masukkan NPM : ");
        int NPM = sc.nextInt();
        System.out.print("Masukkan angka pertama : ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        double angka2 = sc.nextDouble();
        System.out.println("Perjumlahan dari angka tersebut = " + (angka1+angka2));
        System.out.println("Pengurangan dari angka tersebut = " + (angka1-angka2));
        System.out.println("Perkalian dari angka tersebut = " + (angka2*angka1));
        System.out.println("Pembagian dari angka tersebut = " + (angka1/angka2));
        System.out.println("Modulus dari angka tersebut = " + (angka1%angka2));
    }
}
