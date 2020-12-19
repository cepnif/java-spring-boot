import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppRunner {

    public static void main(String[] args) {
        BeanFactory container1 = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext container2 = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor1 = (Mentor) container1.getBean("fullTimeMentor");
        Mentor mentor2 = container2.getBean("partTimeMentor", Mentor.class);

        mentor1.createAccount();
        mentor2.createAccount();

    }
}
