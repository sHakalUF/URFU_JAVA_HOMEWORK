package rvafin2.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:props.properties")
@ComponentScan("rvafin2")
public class MyConfig {

}

