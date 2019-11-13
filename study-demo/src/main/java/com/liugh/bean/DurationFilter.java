package com.liugh.bean;

import org.springframework.stereotype.Component;

@Component
public class DurationFilter implements Filter {

  @Override
  public boolean filter(Task task) {
    System.out.println("时效性检验");
    return true;
  }
}