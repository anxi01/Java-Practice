package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
        // this.socketClient = new SocketClient(); <디폴트 생성자롤 막아놨기 때문에>
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
