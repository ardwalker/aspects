package com.learning.Aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public LearnAspect learnAspect(){
        return new LearnAspect();
    }

    @Bean
    public AnyObject any(){
        return new AnyObject();
    }

    @Bean
    public GenericAnyObject<AnyObject> anyObjectGeneric() {
        return new GenericAnyObject<>();
    }

}
