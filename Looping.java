import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
////        for (var counter = 1 ; counter <=20; counter++){
////            System.out.println("Bus berjalan sebanyak-" + counter);
//        }
//        var counter = true;
//        var jumlah = 1;
//        while (counter){
//            System.out.println("Perulangan sebanyak-"+jumlah);
//            if (jumlah == 10) counter=false;
//            jumlah++;
//        }
        boolean lelah = false;
        int number = 1;

        do {
            System.out.println("Apakah Kamu Lelah? (True/False)?");
            Scanner input = new Scanner(System.in);
            if (input.hasNextBoolean()) {
                lelah = input.nextBoolean();
                if (!lelah) {
                    number++;
                    System.out.println("Semangat" + number);

                } 
            }
        }while (!lelah);
        }
    }

