package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer CustomerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer CustomerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer CustomerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(CustomerLee);
        customerList.add(CustomerKim);
        customerList.add(CustomerHong);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));

        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용은 :" + total + "입니다");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter(n->n.getAge()>=20).map(q->q.getName()).sorted().forEach(s-> System.out.println(s.toString()));
    }

}
