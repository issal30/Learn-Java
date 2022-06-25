package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {
        System.out.println("Mau pilih makanan apa?");
        String[] menu = {"Ayam Goreng","Ikan Bakar","Nasi Padang","Soto Lamongan"};
        for (int i = 0;i < menu.length;i++){
            System.out.println(i + 1 + ". "+menu[i]);
        }
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()){
            System.err.println("Inputan Harus berupa angka!");
            return;
        }
        int hasil = input.nextInt();
        if (hasil > menu.length){
            System.err.println("Menu tidak Tersedia!");
            return;
        }
        System.out.println("Kamu pesan " +menu[hasil-1]+", Selamat Menikmati");


    }
}
