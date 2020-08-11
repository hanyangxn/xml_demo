package com.hy.xml_demo.pojo;

/**
 * @author hy
 * @description:
 * @date 2020/08/10
 */
public class Person {

    private String name;
    private Integer id;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }

}
