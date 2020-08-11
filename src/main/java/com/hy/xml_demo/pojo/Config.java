package com.hy.xml_demo.pojo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author hy
 * @description:
 * @date 2020/08/11
 */
@Configuration
@ImportResource(locations= {"classpath:test.xml"})
public class Config {
}
