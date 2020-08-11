package com.hy.xml_demo.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * @author hy
 * @description:
 * @date 2020/08/11
 */
@Configuration
@ImportResource(locations= {"classpath:test.xml"})
public class Config {

    @Resource
    Environment environment;

    @Bean(name = "person1")
    //@Scope 与 extends AbstractFactoryBean 重写 isSingleton方法 实现功能一样
    @Scope(value="prototype")
    public Person person(){
        Person person = new Person(environment.getProperty("my_name"),Integer.valueOf(environment.getProperty("my_age")));
        return person;
    }
}
