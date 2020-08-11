package com.hy.xml_demo.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Resource(name = "person1")
    private Person person3;
    @Resource(name = "person1")
    private Person person4;

    @Test
    public void testSingleBean(){
        //通过application进行匹配
//        ApplicationContext cfg=new ClassPathXmlApplicationContext("test.xml");
//        Person person=(Person)cfg.getBean("person");
//        Person person2=(Person)cfg.getBean("person");
//        System.out.println(person);
        assertTrue(person3 == person4);
        assertTrue(person == person2);
    }
}
