package com.liugh.bean;

public interface Filter {

  /**
   * 用于对各个任务节点进行过滤
   */
  boolean filter(Task task);

}