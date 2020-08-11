package com.hy.xml_demo.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author hy
 * @description:
 * @date 2020/08/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class PersonTest {
    //通过注入方式注入
    @Resource(name = "person")
    private Person person;
    @Resource(name = "person")
    private Person person2;
    @Test
    public void testSingleBean(){
        //通过application进行匹配
//        ApplicationContext cfg=new ClassPathXmlApplicationContext("test.xml");
//        Person person=(Person)cfg.getBean("person");
//        Person person2=(Person)cfg.getBean("person");
//        System.out.println(person);
        assertTrue(person == person2);
    }
}
