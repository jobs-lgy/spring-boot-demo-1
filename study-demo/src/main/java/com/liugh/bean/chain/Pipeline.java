package com.liugh.bean.chain;

public interface Pipeline {
  
  Pipeline fireTaskReceived();
  
  Pipeline fireTaskFiltered();
  
  Pipeline fireTaskExecuted();
  
  Pipeline fireAfterCompletion();
}