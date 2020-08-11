package com.hy.xml_demo.pojo;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @author hy
 * @description:
 * @date 2020/08/10
 */
public class PersonStaticFactory extends AbstractFactoryBean<Person> {
    private String name;
    private Integer id;

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    protected Person createInstance() throws Exception {
        return new Person(this.name,this.id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
