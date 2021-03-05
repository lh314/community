package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/*表示此为配置类*/
@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
//        实例化SimpleDateFormat 方法返回的对象装配到Bean类里
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
