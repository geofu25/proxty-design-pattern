package com.selfstudy.proxystart.config;

import com.selfstudy.proxystart.app.v1.OrderControllerV1;
import com.selfstudy.proxystart.app.v1.OrderControllerImpl;
import com.selfstudy.proxystart.app.v1.OrderRepositoryV1;
import com.selfstudy.proxystart.app.v1.OrderRepositoryV1Impl;
import com.selfstudy.proxystart.app.v1.OrderServiceV1;
import com.selfstudy.proxystart.app.v1.OrderServiceV1Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV1Config {

  @Bean
  public OrderControllerV1 orderController() {
    return new OrderControllerImpl(orderServiceV1());
  }

  @Bean
  public OrderServiceV1 orderServiceV1() {
    return new OrderServiceV1Impl(orderRepositoryV1());
  }

  @Bean
  public OrderRepositoryV1 orderRepositoryV1() {
    return new OrderRepositoryV1Impl();
  }

}
