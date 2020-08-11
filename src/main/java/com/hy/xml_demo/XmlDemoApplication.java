package com.hy.xml_demo;

import com.hy.xml_demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ServletComponentScan
public class XmlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlDemoApplication.class, args);
            //通过application去加载
//            ApplicationContext cfg=new ClassPathXmlApplicationContext("test.xml");
//            Person person=(Person)cfg.getBean("person");
//            System.out.println(person);
    }

}
