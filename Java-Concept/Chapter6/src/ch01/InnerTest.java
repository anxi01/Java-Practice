package ch01;

class OutClass{
    private int num = 10;
    private static int sNum = 20;

    /** OutClass 먼저 생성 후 InClass 생성됨 */
    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }
    // 인스턴스 내부 클래스
    private class InClass{ // 보통 innerclass는 private
        int iNum = 100;

        // static int sInNum = 500; -> 오류(static은 클래스 생성 전 만들어지므로)

        void inTest(){
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }
    public void usingClass(){
        inClass.inTest();
    }
    // 스태틱 내부 클래스
    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
        static void sTest(){
            // System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)"); => iNum 생성 전 sTest가 실행되기 때문
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {

        /*OutClass outClass = new OutClass();
        outClass.usingClass();*/

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest(); // 정적 메소드

    }
}
