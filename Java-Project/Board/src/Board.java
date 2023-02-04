import java.util.ArrayList;
import java.util.Scanner;

public class Board {

    // private => list 추가 삭제 가능
    private static ArrayList<Order> orders = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        boolean loop = true;

        while(loop) {
            System.out.println("1. 상품 조회 \t 2. 상품 입력 \t 3. 상품 삭제 \t 4. 상품 검색 \t 5. 나가기");
            int input = scanner.nextInt();

            /** 1. 게시판 조회 */
            if (input == 1) {
                System.out.println("상품------가격");
                System.out.println("=============");
                //System.out.print(orders.get(0).getProduct() + "-----" + orders.get(0).getPrice());
                for (Order order : orders) {
                    System.out.println(order.getProduct() + "------" + order.getPrice());
                }
            }
            /** 2. 게시판 입력 */
            if (input == 2) {
                System.out.println("상품을 추가해주세요.");
                String product = scanner.next();
                System.out.println("가격을 추가해주세요.");
                String price = scanner.next();

                orders.add(new Order(product, price));
            }
            /** 3. 게시판 삭제 */
            if (input == 3) {
                System.out.println("제거할 상품명 혹은 상품가격을 입력해주세요.");
                String deleteProduct = scanner.next();
                for (int i = 0; i < orders.size(); i++) {
                    if(orders.get(i).getProduct().equals(deleteProduct) || orders.get(i).getPrice().equals(deleteProduct)){
                        orders.remove(i);
                    }
                }
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
            if (input == 4){
                System.out.println("검색할 상품명 혹은 상품가격을 입력하세요.");
                String searchProduct = scanner.next();

                for(int i = 0; i < orders.size(); i++){
                    if(orders.get(i).getProduct().equals(searchProduct) || orders.get(i).getPrice().equals(searchProduct)){
                        System.out.println("상품 ------ 가격");
                        System.out.println(orders.get(i).getProduct() + "------" + orders.get(i).getPrice());
                    }
                }
            }

            /** 5. 나가기 */
            if (input == 5){
                loop = false;
            }
        }
    }
}