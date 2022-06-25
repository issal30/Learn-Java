package Quiz;

import java.util.Scanner;

public class quiz4_METHOD {
    static boolean powerOff() {
        return false;

    }

    static int sellStuff(int money) {
        System.out.println("Uang Kamu bertambah $10");
        money += 10;
        System.out.println("Sekarang uang kamu = $" + money);
        return money;
    }

    static String buyStuff(int money) {
        System.out.println("Saldo kamu $ " + money);
        System.out.println("1. Soto $10\n" +
                "2. Mie $3\n" +
                "3. Rendang $6");
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) {
            System.out.println("Input Harus berupa angka!");
            return "false";
        }
        int saldo;


        switch (input.nextInt()) {
            case 1:
                saldo = money - 10;
                if (saldo < 0) {
                    System.err.println("Saldo tidak Cukup");
                    return "false";
                }
                System.out.println("Kamu pesan Soto = $10");
                money = saldo;
                System.out.println("Sekarang uang kamu = $" + money);
                return String.valueOf(money);


            case 2:
                saldo = money - 3;
                if (saldo < 0) {
                    System.err.println("Saldo tidak Cukup");
                    return "false";
                }
                System.out.println("Kamu pesan Mie = $3");
                money = saldo;
                System.out.println("Sekarang uang kamu = $" + money);
                return String.valueOf(money);


            case 3:
                saldo = money - 6;
                if (saldo < 0) {
                    System.err.println("Saldo tidak Cukup");
                    return "false";
                }
                System.out.println("Kamu pesan Rendang = $6");
                money = saldo;
                System.out.println("Sekarang uang kamu = $" + money);
                return String.valueOf(money);

            default:
                System.err.println("Pesananan tidak ada di List!");
                return "false";
        }
    }
}
