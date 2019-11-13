package com.liugh.bean;

import org.springframework.stereotype.Component;

@Component
public class RiskFilter implements Filter {

  @Override
  public boolean filter(Task task) {
    System.out.println("风控拦截");
    return true;
  }
}