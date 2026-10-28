/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_ALL;

public class Sepeda {
    String merk;
    int jarakTempuh;

    public Sepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0;

        System.out.println("Object " + merk +
                " dibuat, jarak tempuh awal 0 km");
    }

    public void bergerakMaju() {
        jarakTempuh += 10;

        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + merk +
                ", Jarak tempuh " + jarakTempuh + " Km");
    }

    public void bergerakMundur() {
        jarakTempuh -= 5;

        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + merk +
                ", Jarak tempuh " + jarakTempuh + " Km");
    }

    public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk +
                ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }
}
