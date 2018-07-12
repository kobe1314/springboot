package com.example.springbootdemo.config;

import com.example.springbootdemo.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
// import one project
/*@ImportResource("classpath:config/application-bean.xml")*/
//import multiple files
@PropertySource(value = {"classpath:config/application-dev.properties"})
public class JavaConfig {

    @Autowired
    Environment environment;

    @Bean
    public User user() {
        String name = this.environment.getProperty("username");
        System.out.println(name);
        return new User("kobe");
    }
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Environment getEnvironment() {

        return environment;
    }
}

