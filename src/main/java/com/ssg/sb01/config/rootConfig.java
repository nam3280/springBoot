package com.ssg.sb01.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//spring의 bean 설정 클래스임을 명시
public class rootConfig {
    //modelMapper를 spring의 빈으로 설정
    @Bean
    public ModelMapper getMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().
                    setFieldMatchingEnabled(true).
                    setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE).
                    setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }


}
