package Interface;

public interface Car {
    void drive();
    int getTier();

    default boolean isBig(){
        return false;
    }
}
