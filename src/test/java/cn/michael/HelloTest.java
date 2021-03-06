package cn.michael;

import cn.michael.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext context;

    @Test
    public void testHelloService(){
        boolean b = context.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoad(){
        System.out.println(person);
    }
}
