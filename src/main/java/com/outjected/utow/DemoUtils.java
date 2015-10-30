package com.outjected.utow;

import java.util.Date;

public class DemoUtils {

    public static DemoBean createDemoBean() {
        DemoBean bean = new DemoBean();
        bean.setMessage("Hello");
        bean.setTimestamp(new Date());
        bean.getUsers().add(new DemoUser("Matt", "Damon"));
        bean.getUsers().add(new DemoUser("Ben", "Affleck"));
        return bean;
    }
}
