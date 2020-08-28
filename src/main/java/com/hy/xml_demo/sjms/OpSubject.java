package com.hy.xml_demo.sjms;

import java.util.Vector;

/**
 * @author hy
 * @description:
 * @date 2020/08/14
 */
public class OpSubject implements Subject {
    Vector<ObServer> vector = new Vector<>();

    private String action;

    @Override
    public void add(ObServer obServer) {
        vector.add(obServer);
    }

    @Override
    public void remove(ObServer obServer) {
        vector.remove(obServer);
    }

    @Override
    public void notifyUpdate(String action) {
        this.action = action;
        for (ObServer obServer:vector) {
            obServer.update(this);
        }
    }
    @Override
    public String getAction() {
        return this.action;
    }
}
