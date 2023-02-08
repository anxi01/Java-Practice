import java.util.*;

/**  문제점
 *   1. 로그인할 때 아이디가 다르더라도, list가 누적됨
 *   => 이전 아이디와 현재 입력된 아이디가 다를 경우, 리스트를 초기화 하는 방법(orders.clear())
 *   But> 이전 아이디와 현재 입력된 아이디를 비교할 수 있는 방법을 찾지 못함.
 *
 *   Sol> orders 리스트에 아이디를 입력해서 [아이디, 상품명, 가격]에서 입력한 아이디와 리스트의 아이디가 같으면 입력, 삭제 등 기능을 구현할 수 있게 함
 *
 *   2. SignUp Class를 사용하지 않음.
 *   => X
 *
 *   3. HashMap의 key 중복 안되는 기능을 사용하지 않음.
 *   => HashMap의 아이디(key)가 입력된 아이디와 다를경우를 조건해서 작성함.. 다른 방법이 있을지도..
 */


public class Board {

    // private => list 추가 삭제 가능
    private static List<Order> orders = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> signUpMap = new HashMap<>();



    public static void main(String[] args) {

        boolean loop1 = true;

        // 주의사항 c가 없어지면 d가 인덱스를 바꿔서 에러가 난다.
        List<String> tests = List.of("a", "b", "c", "d");
        for (int i = 0; i < tests.size(); i++) {
            System.out.println(tests.get(i));
            if (tests.get(i).equals("c")) {
                tests.remove(i);
            }
        }

        while(loop1) {

            System.out.println("1. 회원가입 \t 2. 로그인 \t 3. 로그아웃");
            int input1 = scanner.nextInt();

            final Test inputType = Test.from(input1);

            if (inputType == Test.SIGNUP_TYPE){
                System.out.println("아이디를 입력해주세요.");
                String id = scanner.next();
                System.out.println("비밀번호를 입력해주세요.");
                String password = scanner.next();

                if(!signUpMap.containsKey(id)){
                    signUpMap.put(id, password);
                }else {
                    System.out.println("아이디가 중복되었습니다.");
                }
            }

            if (inputType == Test.LOGIN_TYPE) {
                System.out.println("아이디를 입력해주세요.");
                String id = scanner.next();
                System.out.println("비밀번호를 입력해주세요.");
                String password = scanner.next();

                boolean loop2;

                if(signUpMap.containsKey(id) && signUpMap.get(id).equals(password)){
                    loop2 = true;
                } else{loop2 = false;}

                while (loop2) {

                    System.out.println("1. 상품 조회 \t 2. 상품 입력 \t 3. 상품 삭제 \t 4. 상품 검색 \t 5. 나가기");
                    int input2 = scanner.nextInt();

                    /** 1. 게시판 조회 */
                    if (input2 == 1) {
                        System.out.println("상품------가격");
                        System.out.println("=============");
                        for (Order order : orders) {
                            if(order.getCustomerId().equals(id)){
                                System.out.println(order.getProduct() + "------" + order.getPrice());
                            }
                        }
                    }
                    /** 2. 게시판 입력 */
                    if (input2 == 2) {
                        System.out.println("아이디를 입력해주세요.");
                        String customerId = scanner.next();
                        System.out.println("상품을 추가해주세요.");
                        String product = scanner.next();
                        System.out.println("가격을 추가해주세요.");
                        String price = scanner.next();
                        if(customerId.equals(id)){
                            orders.add(new Order(customerId, product, price));
                        }else{
                            System.out.println("아이디가 틀립니다.");
                        }
                    }
                    /** 3. 게시판 삭제 */
                    if (input2 == 3) {
                        System.out.println("제거할 상품명 혹은 상품가격을 입력해주세요.");
                        String deleteProduct = scanner.next();
                        for (int i = 0; i < orders.size(); i++) {
                            if (orders.get(i).getProduct().equals(deleteProduct) || orders.get(i).getPrice().equals(deleteProduct)) {
                                orders.remove(i);
                            }
                        }
//                for(Order order : orders){
//                    if(order.getProduct().equals(deleteProduct) || order.getPrice().equals(deleteProduct)){
//                        orders.remove(order.getProduct());
//                    }
//                }
                    }
//                ----------------------------------------------------------------------------------
//                System.out.println("가격을 추가해주세요.");
//                String price = scanner.next();

//                orders.remove(new Order(productName, price));

//                System.out.println("제거할 상품의 이름 혹은 가격을 입력해주세요.");
//                String productInfo = scanner.next();
//
//                if(productInfo.equals(orders)){
//                    orders.remove(productInfo);
//                }
                    /** 4. 상품 검색 */
                    if (input2 == 4) {
                        System.out.println("검색할 상품명 혹은 상품가격을 입력하세요.");
                        String searchProduct = scanner.next();

                        for (int i = 0; i < orders.size(); i++) {
                            if (orders.get(i).getProduct().equals(searchProduct) || orders.get(i).getPrice().equals(searchProduct)) {
                                System.out.println("상품 ------ 가격");
                                System.out.println(orders.get(i).getProduct() + "------" + orders.get(i).getPrice());
                            }
                        }
//                for(Order order : orders){
//                    if(order.getProduct().equals(searchProduct) || order.getPrice().equals(searchProduct)){
//                        System.out.println("상품 ------ 가격");
//                        System.out.println(order.getProduct() + "------" + order.getPrice());
//                    }
//                }
                    }
                    /** 5. 나가기 */
                    if (input2 == 5) {
                        loop2 = false;
                    }
                }
            }
                /** 3. 로그아웃 */
                if(inputType == Test.LOGOUT_TYPE){
                    loop1 = false;
                }
        }
    }
}
