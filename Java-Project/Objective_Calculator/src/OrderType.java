public enum OrderType {
    PICKUP("포장"),
    DELIVERY("배달"),
    PRESENT("선물하기");
    private final String desc;

    OrderType(String desc) {
        this.desc = desc;
    }
}
