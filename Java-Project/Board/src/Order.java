public class Order {

    private int price;
    private String product;

    public Order(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

}