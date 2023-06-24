package ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // OOP 구현
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString(s1, s2);

        // 람다식 구현
        StringConcat concat = (s, v)-> System.out.println(s + "," + v);
        concat.makeString(s1, s2);
    }
}
