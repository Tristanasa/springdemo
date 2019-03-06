package com.trista.springdemo;//用于从main方法启动Spring应用 1.创建一个合适的ApplicationContext实例 （取决于classpath）
//2.注册一个CommandLinePropertySource，以便将命令行参数作为Spring properties
//3.刷新application context，加载所有单例beans
//4.激活所有CommandLineRunner beans
//默认可以直接用静态方法run(),也可以根据需要创造实例

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringdemoApplication.class, args);
    }

}
