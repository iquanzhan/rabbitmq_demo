package com.chengxiaoxiao.rabbitmq.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Cheng Xiaoxiao
 */
@Component
@RabbitListener(queues = "fullstack")
public class Customer3 {

    @RabbitHandler
    public void getMsg(String msg) {
        System.out.printf("fullstack接收到消息：" + msg);
    }
}
