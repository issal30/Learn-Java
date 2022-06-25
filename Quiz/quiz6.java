package Quiz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class quiz6 {
    private static boolean power_on = true;
    private static String[] rak_roti = {"Bolu", "Rainbow Cake", "Wedding Cake"};

    public static void main(String[] args) {
        String[] list_menu = {"Show available Cake", "Add Cake", "Update Cake", "Delete Cake"};
        while (power_on) {

            System.out.println("Welcome to our Cake Store.");
            for (int i = 0; i < list_menu.length; i++) {
                System.out.println(i + 1 + ". " + list_menu[i]);
            }
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();

                switch (result) {
                    case 1:
                        showListCake();
                        break;
                    case 2:
                        addCake();
                        break;
                    case 3:
                        updateCake();
                        break;
                    case 4:
                        deleteCake();

                }
                yesOrNo();
            } else {
                System.err.println("Input must be Numbers");
            }
        }
    }


    private static void yesOrNo() {
        boolean loop = true;

        do {
            System.out.println("Continue? ( Y / N)");
            Scanner scanner = new Scanner(System.in);
            String result = scanner.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                power_on = true;
                loop = false;
            }

            if (result.equalsIgnoreCase("N")) {
                power_on = false;
                loop = false;
            }
        } while (loop);

    }

    private static void showListCake() {
        for (String cakes : rak_roti) {
            System.out.println("- " + cakes);
        }
        System.out.println("\n");
    }

    private static void addCake() {

        boolean looping = true;
        Scanner scanner = new Scanner(System.in);
        while (looping) {

            System.out.println("Add new Cake: ");
            String result = scanner.nextLine();
            if (result.equals("")) {
                System.err.println("Must be filled");
            } else {
                rak_roti = append(rak_roti, result);
                showListCake();
                looping = false;
            }
        }
    }

    private static void updateCake() {
        System.out.println("List of breads that will be updated");
        for (int i = 0; i < rak_roti.length; i++) {
            System.out.println(i + 1 + ". " + rak_roti[i]);
        }

        boolean looping = true;
        Scanner scanner = new Scanner(System.in);
        while (looping) {

            System.out.println("Input the cake numbers");
            try {

                int result = Integer.valueOf(scanner.nextLine());

                if (result > rak_roti.length) {
                    System.err.println("Number doesn't Exist");
                } else {
                    System.out.println("Insert new cake name");
                    String result1 = scanner.nextLine();

                    rak_roti[result - 1] = result1;
                    looping = false;

                }
            } catch (RuntimeException e) {
                System.err.println("Input must be number!");
            }
        }
    }

    private static void deleteCake() {
        System.out.println("List of breads that will be Deleted");
        for (int i = 0; i < rak_roti.length; i++) {
            System.out.println(i + 1 + ". " + rak_roti[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number that you want to delete");
        if (scanner.hasNextInt()) {
            int result = scanner.nextInt();
            if (result > rak_roti.length) {
                System.err.println("Number doesn't exist");
                return;
            }
            List newArr = new LinkedList();
            for (int i = 0; i < rak_roti.length; i++) {
                if (i != result - 1) {
                    newArr.add(rak_roti[i]);
                }
            }
            rak_roti = (String[]) newArr.toArray(new String[newArr.size()]);
        } else {
            System.err.println("Must be Number!");
        }

    }

    private static <T> T[] append(T[] arr, T e) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = e;
        return arr;
    }
}
