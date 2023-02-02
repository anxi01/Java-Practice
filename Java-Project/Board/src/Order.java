public class Order {

    private String price;
    private String product;

    public Order(String product, String price) {
        this.product = product;
        this.price = price;
    }
    public Order(){}

    public String getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}