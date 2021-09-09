package com.dinda;

import java.util.Scanner;

/**
 * Created by Amir
 * FrogoBox Inc License
 * =========================================
 * BelajarJava
 * Copyright (C) 09/09/2021.
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
public class BelajarScanner {
    public static void main(String[] args) {
        System.out.println("pilihlah satu dari 1 2 3");
        String love = "kamu cantik";
        String luv = "kamu cantik banget";
        String lovely = "kamu lumayan cantik";
        Scanner dinda = new Scanner(System.in);
        int input = dinda.nextInt();
        if (input == 1) {
            System.out.println(love);
        } else if (input == 2) {
            System.out.println(luv);
        } else if (input == 3) {
            System.out.println(lovely);
        }

    }
}
