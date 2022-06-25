import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        System.out.println("Deklarasi Array");
//        String[] arr = new String[3];
//        arr[0] = "A";
//        arr[1] = "B";
//        arr[2] = "C";
//        System.out.println(Arrays.toString(arr));

        int[] number = {1,2,3,4};
//        System.out.println(number[4]);

        String[] huruf = {"Satu", "Dua", "Tiga"};
//        System.out.println(Arrays.toString(huruf));

        for (int angka : number){
//            System.out.println(angka);
        }
        String word = "Enchrement";
        for (int index = 0; index < word.length();index++){
            System.out.println(word.charAt(index));
            if (word.charAt(index)== 'm')break;


        }
    }
}
