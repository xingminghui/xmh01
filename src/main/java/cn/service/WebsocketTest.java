package cn.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@Slf4j
@Component
@ServerEndpoint(value="/websocketTest/{userId}")
public class WebsocketTest {
    private static String userId;
    //连接时执行
    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) throws IOException {
        this.userId = userId;
        log.info("新连接：{}",userId);
    }
    //关闭时执行
    @OnClose
    public void onClose(){
        log.info("连接：{} 关闭",this.userId);
    }
    //收到消息时执行
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        log.info("收到用户{}的消息{}",this.userId,message);
        session.getBasicRemote().sendText("收到"+this.userId+"的消息:"+message); //回复用户
        log.info("wait before");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("wait ater");
        session.getBasicRemote().sendText("收到"+this.userId+"的消息2:"+message); //回复用户
    }
    //连接错误时执行
    @OnError
    public void onError(Session session, Throwable error){
        log.info("用户id为：{}的连接发送错误",this.userId);
        error.printStackTrace();
    }
}