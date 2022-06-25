package Quiz;


import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        System.out.println("Mau Beli eskrim Berapa?");
        Scanner input = new Scanner(System.in);
        if ( input.hasNextInt()){
            int userBeli= input.nextInt();
            for(var index = 1;  index <= userBeli; index++){
                System.out.println(index + " eskrim" );
            }
        }else{
            System.err.println("Hanya menerima Angka.");
        }

    }
}
