package com.hy.xml_demo.sjms;

/**
 * @author hy
 * @description:
 * @date 2020/08/14
 */
public interface Subject {
    void add(ObServer obServer);

    void remove(ObServer obServer);

    void notifyUpdate(String action);

    String getAction();
}
