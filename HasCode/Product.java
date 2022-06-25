package HasCode;

public final class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int hasCode() {
        int result = name != null ? name.hashCode() : 0;

        result = 31 * result + price;
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
