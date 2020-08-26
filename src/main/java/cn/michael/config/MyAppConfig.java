package cn.michael.config;

import cn.michael.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //指明当前类时一个配置类
public class MyAppConfig {
    @Bean  //将方法返回值添加到容器中，组件默认id是方法名
    public HelloService helloService(){

        return new HelloService();
    }
}
