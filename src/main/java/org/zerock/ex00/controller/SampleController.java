package org.zerock.ex00.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링부트와는 다르게 xml에서 설정을 해줘야한다.
@Log4j2
@RequestMapping("/sample")
public class SampleController {

  @GetMapping("/basic")
  public void basic() {
    log.info("basic-------------------");
  }

}