package Quiz;

import java.util.Scanner;

import static Quiz.quiz4_METHOD.*;


public class quiz4 {
    private static int money = 20;
    private static boolean power_on = true;
    static String hello = "hello world";

    public static void main(String[] args) {

        while (power_on) {
            System.out.println("\n1. Buy \n2. Sell\n3. Power Off");
            Scanner input = new Scanner(System.in);
            if (!input.hasNextInt()) {
                System.err.println("Input harus berupa angka!");
                return;
            }


            switch (input.nextInt()) {
                case 1:
                    var res = buyStuff(money);
                    if (!res.equals("false")) money = Integer.valueOf(res);
                    break;
                case 2:
                    money = sellStuff(money);
                    break;
                case 3:
                    power_on = powerOff();
                    break;
                default:
                    System.err.println("List tidak tersedia");
            }

        }
    }

}

