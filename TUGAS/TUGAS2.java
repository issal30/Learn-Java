package TUGAS;

import java.util.Scanner;

public class TUGAS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.err.println("Input harus berupa angka");
            return;
        }
        int bilangan = scanner.nextInt();
        int sisa = bilangan % 4;
        if (sisa == 0 || sisa == 1 || sisa == 3 || sisa == 5 || sisa == 7 || sisa == 9)
            System.out.println("Bilangan Ganjil");
        else System.out.println("Bilangan Genap");

    }
}
