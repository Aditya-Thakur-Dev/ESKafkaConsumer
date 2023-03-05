package com.learn.esconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("kafkaConsumer")
public class UserConsumer implements java.util.function.Consumer<User> {
    private final ESService service;

    private final Logger logger = LoggerFactory.getLogger(UserConsumer.class);

    public UserConsumer(ESService service) {
        this.service = service;
    }


    @Override
    public void accept(User user) {
        logger.info(user.toString());
        service.saveDataOnEs(user);
    }

    @Override
    public Consumer<User> andThen(Consumer<? super User> after) {
        return Consumer.super.andThen(after);
    }
}
