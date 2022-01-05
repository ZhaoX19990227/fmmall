package com.qfedu.fmmall.websocket;
import org.springframework.stereotype.Component;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/webSocket/{oid}")   //服务节点 表示我这个类可以接收别人的请求
public class WebSocketServer {

    private static ConcurrentHashMap<String, Session> sessionMap = new ConcurrentHashMap<>();
    /**
     * 前端发送请求建立websocket连接，就会执行@OnOpen方法
     **/

    @OnOpen
    //PathParam就是websocket的注解 类似@PathVariable
    public void open(@PathParam("oid") String orderId, Session session) {
        System.out.println("------------建立连接：" + orderId);
        sessionMap.put(orderId, session);
    }

    /**
     * 前端关闭页面或者主动关闭websocket连接，都会执行 @OnClose
     **/
    @OnClose
    public void close(@PathParam("oid") String orderId) {
        sessionMap.remove(orderId);
    }

    public static void sendMsg(String orderId, String msg) {
        try {
            Session session = sessionMap.get(orderId);
            session.getBasicRemote().sendText(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
