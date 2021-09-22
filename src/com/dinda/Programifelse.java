package com.dinda;

import java.util.Scanner;

public class Programifelse {
    public static void main(String[] args) {
        //input
        System.out.println("            Rumah Kucing Petshop");
        System.out.println("                082146510812");
        System.out.println("                  DINNRHLS");
        System.out.println("        Jalan Pahlawan 93 Probolinggo");
        System.out.println("---------------------------------------------");
        System.out.println("Tanggal                 = 21-10-2021");
        System.out.println("Pembayaran              = Tunai");
        System.out.println("---------------------------------------------");
        //proses
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Barang             = Meo Kitten");
        System.out.print("Jumlah Meo Kitten       = ");
        double jumlahbarang1 = sc.nextDouble();
        System.out.print("Harga Meo Kitten        = Rp ");
        double hargabarang1 = sc.nextDouble();
        System.out.println("Nama Barang             = Meo Creamy");
        System.out.print("Jumlah Meo Creamy       = ");
        double jumlahbarang2 = sc.nextDouble();
        System.out.print("Harga Meo Creamy        = Rp ");
        double hargabarang2 = sc.nextDouble();
        System.out.println("---------------------------------------------");
        double totalharga = (jumlahbarang1 * hargabarang1) + (jumlahbarang2 * hargabarang2);
        double diskon = 0;
        if (totalharga <= 100000) {
            diskon = totalharga * 0;
        } else if (totalharga >= 100001 && totalharga <= 200000) {
            diskon = totalharga * 0.05;
        } else if (totalharga >= 200001 && totalharga <= 300000) {
            diskon = totalharga * 0.10;
        } else if (totalharga >= 300001 && totalharga <= 400000) {
            diskon = totalharga * 0.15;
        } else if (totalharga >= 400001 && totalharga <= 500000) {
            diskon = totalharga * 0.20;
        } else if (totalharga > 500000) {
            diskon = totalharga * 0.25;
        }
        //output
        double setelahdiskon = totalharga - diskon;
        System.out.println("Total Harga             = Rp " + totalharga);
        System.out.println("Total Diskon            = Rp " + diskon);
        System.out.println("Total Setelah Diskon    = Rp " + setelahdiskon);
        System.out.print("Tunai                   = Rp ");
        double tunai = sc.nextDouble();
        System.out.println("Non Tunai / Kartu       = Rp 0");
        System.out.println("Voucher                 = Rp 0");
        if (tunai == setelahdiskon) {
            System.out.println("                UANG ANDA PAS");
        } else if (tunai < setelahdiskon) {
            System.out.println("                UANG ANDA KURANG");
            System.out.println("Uang Kurang             = Rp " + (setelahdiskon - tunai));
        } else {
            double kembali = tunai - setelahdiskon;
            System.out.println("Kembali                 = Rp " + kembali);
        }
        System.out.println("---------------------------------------------");
        System.out.println("        Terima Kasih Sudah Berbelanja");
        System.out.println("                di Rumah Kucing");
        System.out.println("           Barang Yang Sudah Di Beli");
        System.out.println("            Tidak Dapat Di Tukarkan");
    }
}
