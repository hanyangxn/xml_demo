package com.hy.xml_demo.pojo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author hy
 * @description:
 * @date 2020/08/11
 */
@WebListener
public class ListenerTest  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("---------------------------------------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}
