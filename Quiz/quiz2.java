package Quiz;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        System.out.println("Pilih destinasi wisata dari list dibawah  \n -Jepang \n -China \n -Indonesia");
        Scanner input = new Scanner(System.in);
        String destinasi = input.nextLine().toLowerCase();
        if (destinasi.equals("jepang")){
            System.out.println("Tokyo\n Tokyo\n Tokyo");

        } else if (destinasi.equals("china")) {
            System.out.println("Tiongkok");
            System.out.println("Tiongkok");
            System.out.println("Tiongkok");
        } else if (destinasi.equals("indonesia")) {
            System.out.println("Semarang");
            System.out.println("Semarang");
            System.out.println("Semarang");
        }else {
            System.err.println("Destinasi Tidak terdaftar");
        }


    }
}
