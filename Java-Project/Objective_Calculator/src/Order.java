public class Order {
    private String orderName;
    private Integer amount;
    private OrderType orderType;

    public Order(String orderName, Integer amount, OrderType orderType) {
        this.orderName = orderName;
        this.amount = amount;
        this.orderType = orderType;
    }

    public String getOrderName() {
        return orderName;
    }

    public Integer getAmount() {
        return amount;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
