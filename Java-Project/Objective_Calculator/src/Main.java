import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.start();

        // Collections.singletonList("") 한개의 리스트를 만들겠다.
        // List<String> test = Collections.singletonList("");
        List<String> test = List.of("1", "2", "3", "3");
        test.forEach(item -> Main.print(item));
        test.forEach(Main::print);

        List<Integer> result = new ArrayList<>();
        // b가 아닐때 담아라
        for (int i = 0; i < test.size(); i++) {
            if (!test.get(i).equals("2")) {
                result.add(Integer.valueOf(test.get(i)));
            }
        }

        result = test.stream()
                .filter(item -> !item.equals("2"))
                .map(Integer::valueOf)
                .distinct()
                .collect(Collectors.toList());

        List<Order> orders = List.of(
                new Order("후라이드 치킨", 17_000, OrderType.DELIVERY),
                new Order("양념 치킨", 18_000, OrderType.DELIVERY),
                new Order("피자", 18_000, OrderType.PICKUP),
                new Order("돈까스", 10_000, OrderType.PICKUP),
                new Order("모듬 초밥", 15_000, OrderType.PRESENT)
        );

        Map<OrderType, List<Order>> groupOrder = orders.stream()
                .collect(groupingBy(e -> e.getOrderType()));

        List<Order> deliveryOrder = groupOrder.get(OrderType.DELIVERY);
        List<Order> pickupOrder = groupOrder.get(OrderType.PICKUP);
        List<Order> presentOrder = groupOrder.get(OrderType.PRESENT);

        // 최대값을 뽑으세요.
        List<Integer> numbers = List.of(1, 2, 3, 3, 5, 8);
        // numbers.stream().max();
    }

    public static void print(String data) {
        System.out.println(data);
    }

}