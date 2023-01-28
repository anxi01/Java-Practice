package com.company.design.singleton;

/**
 *   -싱글톤-
 *   디폴트 생성자를 통해 생성 못하게 막고
 *   ststic 변수를 통해서  getInstance를 만들고
 *   자신이 가진 객체가 null이면, 신규로 객체 생성
 *   아니면, 자신의 객체를 리턴
 *   
 */
public class SocketClient {

    private static SocketClient socketClient = null;  // 인스턴스

    private SocketClient(){
        // 생성자 제한
    }

    public static SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();  // socketClient가 없으면 새로 생성
        }

        return socketClient;  // 있으면 있는 거 사용
    }

    public void connect(){
        System.out.println("connect");
    }

}