package Interface;

public class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("Mengendarai Mobil");
    }

    @Override
    public int getTier() {
        return 2;
    }
}
