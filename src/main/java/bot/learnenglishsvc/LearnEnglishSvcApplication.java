package bot.learnenglishsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnEnglishSvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnEnglishSvcApplication.class, args);
    }
}