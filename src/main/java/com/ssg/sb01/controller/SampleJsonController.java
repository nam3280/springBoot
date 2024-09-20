package com.ssg.sb01.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//json 데이터 전송 컨트롤러
@Log4j2
public class SampleJsonController {
    @GetMapping("/helloArr")
    public String[] helloArr(){
        log.info("helloArr GET");
        return new String[]{"AAA","BBB","CCC","SpringBoot"};
    }
}
