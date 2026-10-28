package TUGAS_ALL;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Tahun;

        System.out.print("Masukan Tahun (1909-2024) : ");
        Tahun = input.nextInt();

        if (Tahun % 400 == 0 || (Tahun % 4 == 0 && Tahun % 100 != 0)) {
            System.out.println(Tahun + " Adalah Tahun Kabisat");
        } else {
            System.out.println(Tahun + " Bukan Tahun Kabisat");
        }
    }
}