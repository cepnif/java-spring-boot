package com.fincityltd;

import com.fincityltd.configurations.MyAppConfig;
import com.fincityltd.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyAppRunner {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(MyAppConfig.class);
        Course course1 = container.getBean("java", Course.class);

        course1.getTeachingHours();
    }
}
