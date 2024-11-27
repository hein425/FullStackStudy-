package com.green.userservice.conf;

import io.micrometer.core.aop.TimedAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimedConfig {


        @Bean
        public TimedAspect timedAspect(){
         return new TimedAspect();
        }
    // Add your timed configuration here

}
