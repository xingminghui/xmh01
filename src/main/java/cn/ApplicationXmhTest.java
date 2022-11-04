package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages="cn",exclude={DataSourceAutoConfiguration.class})
//@ComponentScan
//@EnableCanalClient
public class ApplicationXmhTest {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationXmhTest.class, args);
    }
}
