import com.fincityltd.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppRunner {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("selenium", Course.class);

        course1.getTeachingHours();
    }
}