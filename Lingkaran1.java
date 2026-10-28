/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_ALL;

import java.util.Scanner;

public class Lingkaran1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float jari, luas, keliling;
        final float PI = 3.14f;

        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas Lingkaran = " + luas);
        System.out.println("Keliling Lingkaran = " + keliling);

        input.close();
    }
}