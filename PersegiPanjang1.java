/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_ALL;
import java.util.Scanner;

public class PersegiPanjang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float panjang = 2;
        float lebar = 5;
        float luas;

        luas = panjang * lebar;

        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);

        input.close();
    }
}
