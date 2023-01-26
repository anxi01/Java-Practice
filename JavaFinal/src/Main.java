import models.*;
import models.Character;

public class Main {
    public static void main(String[] args) {
        /**  //format
        System.out.printf("나이는 %d, 키는 %.1f이며 이름은 %s 입니다. \n", 10, 20.1, "abc");

        String str = String.format("나이는 %d, 키는 %.1f이며 이름은 %s 입니다. \n", 10, 20.1, "abc");
        System.out.println(str);
         */

        /** //문자열 상호 변환
        String str = "100";
        int i = Integer.parseInt(str); // 문자열을 숫자로 변환
        
        String str2 = String.valueOf(i); // 숫자를 문자열로 변환
        System.out.println(i + " " + str2);
         */

        /** Random
        Random random = new Random();
        int rand = random.nextInt(10); // 0 ~ 9까지의 수 중 하나 반환
        int rand2 = random.nextInt(4) + 5; // 0 ~ 4 => 5 ~ 14  // 5 ~ 9 구하려면
        System.out.println(rand);
        System.out.println(rand2);
         */

        /** 입력
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i = scanner.nextInt();
        System.out.println(str + " " + i);
         */

        /** 삼항연산
        boolean isMarried = true;
        String str;
        str = isMarried ? "결혼 했다" : "결혼 안했다";
        System.out.println(str);
         */

        /** Array
        int [] score1 = new int[5];
        int [] score = {10, 20, 30, 40, 50};
        int count = score.length;
        System.out.println(count);
        System.out.println(score[score.length - 1]); // array 마지막 값 구할 때 세지 말고

        String[] name = new String[2];
        String[] names = {"홍길동", "이순신"};
        System.out.println(name[0].length()); // null exception
        */

        /** ArrayList
        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(10);
        scoreList.add(20);
        scoreList.add(30);
        scoreList.add(40);
        scoreList.add(50);

        scoreList.add(2, 200); // 인덱스 2에 추가
        scoreList.remove(2); // 제거

        System.out.println(scoreList.size()); // 배열의 크기
        System.out.println(scoreList.get(2)); // 인덱스 값
        System.out.println(scoreList);
         */

        /** 상속, 추상클래스, 인터페이스
        Person person = new Person();
        Person person1 = new Person("홍길동", 18);

        System.out.println(person);
        System.out.println(person1);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("킹콩");
        hero.attack(hero2);

        Character character = new Hero("베트맨");

        // 다형성
        Magician magician = new Magician();
        Character magician2 = new Magician();
        ICharacter magician3 = new Magician();
         */

        /** 제네릭 => 어떠한 타입이든 사용할 수 있게 하려면
        print("안녕");
        print(1);
        print(3L);
        print(true);
         */
        

    }
    /** method & overload
    public static int add(int x, int y){
        return x + y;
    }
    public static int add(int x, int y, int z){
        return x + y + z;
    }
    public static int add(int... numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += i;
        }
        return sum;
    }
     */

    /** 제네릭
    public static <T> void print(T type){
        System.out.println(type);
    }
     */


}

