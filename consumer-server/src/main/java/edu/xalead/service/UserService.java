package edu.xalead.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //去注册中心拿到服务
    @Reference//引用远程, pom坐标，可定义路径相同的接口名
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心拿到一张票"+ticket);
    }
}
