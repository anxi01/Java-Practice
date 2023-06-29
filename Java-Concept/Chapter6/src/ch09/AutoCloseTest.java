package ch09;

public class AutoCloseTest {
    public static void main(String[] args) {

        AutoCloseableObj obj = new AutoCloseableObj();
        try(obj) {
            throw new Exception(); // Exception 강제 생성 -> catch문 호출
        }catch (Exception e){
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
