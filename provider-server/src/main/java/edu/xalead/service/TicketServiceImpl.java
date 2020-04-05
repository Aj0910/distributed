package edu.xalead.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//
@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "Hello Dubbo";
    }
}
