package com.chengxiaoxiao.rabbitmq.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Cheng Xiaoxiao
 */
@Component
@RabbitListener(queues = "chengxiaoxiao")
public class Customer1 {

    @RabbitHandler
    public void getMsg(String msg) {
        System.out.printf("直接消费模式：" + msg);
    }
}
