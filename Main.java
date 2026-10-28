/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_ALL;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("Luas Persegi = "
                + persegi.hitungLuas());

        System.out.println("Luas Persegi Panjang = "
                + pp.hitungLuas());

        System.out.println("Luas Lingkaran = "
                + lingkaran.hitungLuas());
    }
}