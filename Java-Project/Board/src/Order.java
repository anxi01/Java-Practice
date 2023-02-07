public class Order {

    private String customerId;
    private String price;
    private String product;

    public Order(String customerId, String product, String price) {
        this.customerId = customerId;
        this.product = product;
        this.price = price;
    }
    public Order(){}

    public String getCustomerId(){
        return customerId;
    }
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