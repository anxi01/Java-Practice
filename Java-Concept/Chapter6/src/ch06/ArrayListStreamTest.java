package ch06;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();

        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        sList.stream().filter(s->s.length() >= 5).forEach(s-> System.out.println(s));
        sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
        sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
    }
}
