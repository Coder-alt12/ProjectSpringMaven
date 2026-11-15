package org.example.config;

import org.example.converter.EmployeeConverter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")

public class SpringBootConfiguration {
    @Bean
    public EmployeeConverter getEmployeeConverter(){
        return new EmployeeConverter();
    }
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
