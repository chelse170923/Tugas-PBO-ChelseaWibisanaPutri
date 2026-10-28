/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_ALL;

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam, menit, detik, totdet;

        System.out.print("Masukkan jam: ");
        jam = input.nextInt();

        System.out.print("Masukkan menit: ");
        menit = input.nextInt();

        System.out.print("Masukkan detik: ");
        detik = input.nextInt();

        totdet = jam * 3600 + menit * 60 + detik;

        System.out.println("Total detik = " + totdet);

        input.close();
    }
}