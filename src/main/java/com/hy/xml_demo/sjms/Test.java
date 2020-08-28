package com.hy.xml_demo.sjms;

/**
 * @author hy
 * @description:
 * @date 2020/08/14
 */
public class Test {
    public static void main(String[] args) {
        StockServer stockServer = new StockServer("张三");
        StockServer stockServer2 = new StockServer("李四");
        OpSubject opSubject = new OpSubject();
        opSubject.add(stockServer);
        opSubject.add(stockServer2);
        opSubject.notifyUpdate("你好");
    }
}
