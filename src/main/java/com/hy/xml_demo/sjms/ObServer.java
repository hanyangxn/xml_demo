package com.hy.xml_demo.sjms;

/**
 * @author hy
 * @description:
 * @date 2020/08/14
 */
public abstract class ObServer {

    public String name;

    public ObServer(String name) {
        this.name = name;
    }

    public abstract void update(Subject subject);
}
