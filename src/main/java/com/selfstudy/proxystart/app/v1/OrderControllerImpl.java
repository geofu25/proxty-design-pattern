package com.selfstudy.proxystart.app.v1;

public class OrderControllerImpl implements OrderControllerV1 {

  private final OrderServiceV1 orderService;

  public OrderControllerImpl(OrderServiceV1 orderService) {
    this.orderService = orderService;
  }

  @Override
  public String request(String itemId) {
    orderService.orderItem(itemId);
    return "ok";
  }

  @Override
  public String noLog() {
    return "ok";
  }
}
