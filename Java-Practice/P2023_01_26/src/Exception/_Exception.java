package Exception;

class FoolException2 extends Exception{}

public class _Exception {

    public void sayNick(String nick){

        try {
            if ("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은" + nick + "입니다.");
        } catch (Exception e) {
            System.err.println("FoolException이 발생");
        }

    }

    public static void main(String[] args) {

//        _Exception exception = new _Exception();
//        exception.sayNick("lee");
//        exception.sayNick("fool");

        try{
            System.out.println("0으로 나눠보겠습니다.");
            System.out.println(8 / 0);
        }catch (Exception e){
            System.err.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("이건 무조건 실행돼야함");
        }
    }
}
