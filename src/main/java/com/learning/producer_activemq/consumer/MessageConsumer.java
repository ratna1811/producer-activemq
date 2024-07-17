package com.learning.producer_activemq.consumer;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.learning.producer_activemq.model.SystemMessages;

@Component
public class MessageConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "learningcode-queue")
    public void messageListener(SystemMessages systemMessages) {
        LOGGER.info("message received. {}", systemMessages);
    }
}
