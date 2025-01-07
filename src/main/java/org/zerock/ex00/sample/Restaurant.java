package org.zerock.ex00.sample;


import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@ToString
public class Restaurant {
  
  private final Chef chef;
}
