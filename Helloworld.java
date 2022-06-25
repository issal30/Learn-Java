import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Berapa Umur kamu?");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()){
            int age = input.nextInt();
            System.out.println("Your age is " + age);
        }else {
            System.err.println("Sorry,Saya tidak mengerti.");
        }


    }
}
