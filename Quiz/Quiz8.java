package Quiz;

import java.util.Scanner;

public class Quiz8 {
    private static int money = 10;

private static boolean again = true;
private static boolean select = true;
    public static void main(String[] args) {

        System.out.println("Selamat datang di Stasiun Tawang Semarang");
        do {

select = true;
            System.out.println("Saldo kamu sekarang $" + money);
            System.out.println("Silahkan pilih Rute dibawah\n 1. Surabaya ($5)\n" + " 2. Bandung ($15)\n 3. Malang ($10)\n 4. Jakarta ($20)");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.err.println("Input harus berupa Angka");
                return;
            }
            int result = scanner.nextInt();

            switch (result) {
                case 1:
                    if (checkingSaldo(5)) break;
                    destination("Surabaya");
                    break;
                case 2:
                    if (checkingSaldo(15)) break;
                    destination("Bandung");
                    break;
                case 3:
                    if (checkingSaldo(10)) break;
                    destination("Malang");
                    break;
                case 4:
                    if (checkingSaldo(20)) break;
                    destination("Jakarta");
                    break;

                default:
                    System.err.println("Rute tidak tersedia");
                    break;
            }
            while (true){
                System.out.println("Beli lagi? (Y / N)");
                String pack = scanner.nextLine();
                if (retry(pack))break;

            }
        }while (again);
    }

    static void destination(String rute) {
        System.out.println("Kamu pilih rute " + rute);

    }
    static boolean retry(String choose ){
        if (choose.equalsIgnoreCase("Y")){
            System.out.println("Saldo kamu bertambah $2");
            money += 2;
            select = false;
            return true;
        } else if (choose.equalsIgnoreCase("N")) {
            System.out.println("Terimakasih telah membeli!");
            select = false;
            again = false;
            return true;
        }
        return false;
    }

    static boolean checkingSaldo(int price) {
        int result = money - price;
        if (result < 0) {
            System.out.println("Saldo tidak cukup");
            return true;
        }
        money = result;
        return false;

    }
}
