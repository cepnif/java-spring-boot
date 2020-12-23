package com.fincityltd;

import com.fincityltd.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       ApplicationContext container = SpringApplication.run(Application.class, args);
        Course course = container.getBean("java", Course.class);

        course.getTeachingHours();
    }

}
