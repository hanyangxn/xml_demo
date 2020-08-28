package com.hy.xml_demo.sjms;

/**
 * @author hy
 * @description:
 * @date 2020/08/14
 */
public class StockServer extends ObServer {

    public StockServer(String name) {
        super(name);
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name +":"+subject.getAction());
    }
}
