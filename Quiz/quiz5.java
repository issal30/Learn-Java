package Quiz;

import java.util.Scanner;

public class quiz5 {
    public static void main(String[] args) {
        boolean looping = true;
        while (looping) {
            System.out.println("Pilih opsi operator Matematika yang ingin kamu gunakan (+ | - | / | *)");
            Scanner input = new Scanner(System.in);
            String operator = input.nextLine();
            switch (operator) {
                case "+":
                    System.out.println(penjumlahan());
                    break;
                case "-":
                    System.out.println(pengurangan());
                    break;
                case "/":
                    System.out.println(pembagian());
                    break;
                case "*":
                    System.out.println(perkalian());
                    break;
                default:
                    looping = false;
                    System.err.println("Operator Salah!");
            }
        }
    }

    static String penjumlahan() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input 1 ");
            int input1 = scanner.nextInt();
            System.out.print("input 2 ");
            int input2 = scanner.nextInt();
            int hasil = input1 + input2;
            return "Hasil penjumlahanya adalah " + hasil;
        } catch (RuntimeException e) {
            return "false";
        }
    }

    static String pengurangan() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input 1 ");
            int input1 = scanner.nextInt();
            System.out.print("input 2 ");
            int input2 = scanner.nextInt();
            int hasil = input1 - input2;
            return "Hasil pengurangan adalah " + hasil;
        } catch (RuntimeException e) {
            return "false";
        }
    }

    static String pembagian() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input 1 ");
            int input1 = scanner.nextInt();
            System.out.print("input 2 ");
            int input2 = scanner.nextInt();
            int hasil = input1 / input2;
            return "Hasil penjumlahanya adalah " + hasil;
        } catch (RuntimeException e) {
            return "false";
        }
    }

    static String perkalian() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input 1 ");
            int input1 = scanner.nextInt();
            System.out.print("input 2 ");
            int input2 = scanner.nextInt();
            int hasil = input1 * input2;
            return "Hasil perkalian adalah " + hasil;
        } catch (RuntimeException e) {
            return "false";
        }
    }
}
