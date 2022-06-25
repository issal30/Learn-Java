import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        System.out.println("Apakah Kamu laki? (true/false)!");
        Scanner input = new Scanner(System.in);
        if (input.hasNextBoolean()){
            boolean gender = input.nextBoolean();
            System.out.println("Your Gender is " + (gender?"male":"Female"));
        }else {
            System.out.println("Sorry,Tidak mengerti");
        }

    }
}

