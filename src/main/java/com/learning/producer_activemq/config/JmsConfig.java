package com.learning.producer_activemq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

import jakarta.jms.ConnectionFactory;

@Configuration
@EnableJms // to enable Jms features, configurations like creating the message listener
           // container - allow to use @JmsListener
public class JmsConfig {
    // Factory bean to create default message listner container
    // Created an instance of the DefaultJmsListenerContainerFactory where we set
    // the ConnectionFactory
    // ConnectionFactory - uses CachingConnectionFactory by default which caches the
    // connection with message broker - ActiveMQ
    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();

        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setConcurrency("5-10"); // intially creates 5 consumers and automaticaly scale upto
                                                            // max 10

        return jmsListenerContainerFactory;
    }
}
