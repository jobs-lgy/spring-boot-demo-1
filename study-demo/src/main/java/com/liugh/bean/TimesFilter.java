package com.liugh.bean;

import org.springframework.stereotype.Component;

@Component
public class TimesFilter implements Filter {

  @Override
  public boolean filter(Task task) {
    System.out.println("次数限制检验");
    return true;
  }
}