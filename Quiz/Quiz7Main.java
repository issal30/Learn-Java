package Quiz;

public class Quiz7Main {
    public static void main(String[] args) {
        Quiz7 resto = new Quiz7("Warung Tegal", "issal");
        System.out.println(resto);
        Quiz7Child child = new Quiz7Child("Warung Tegal", "issal");
        System.out.println(child);
    }

}
