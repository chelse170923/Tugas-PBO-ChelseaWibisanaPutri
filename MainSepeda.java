/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_ALL;



import java.util.Scanner;

public class MainSepeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Object Merk Sepeda: ");
        String merk = input.nextLine();

        Sepeda sepeda = new Sepeda(merk);

        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    sepeda.bergerakMaju();
                    break;

                case 2:
                    sepeda.bergerakMundur();
                    break;

                case 3:
                    sepeda.berhenti();
                    break;

                case 0:
                    System.out.println("Keluar Program ..");
                    System.out.println(
                            "Terimakasih sudah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        input.close();
    }
}
