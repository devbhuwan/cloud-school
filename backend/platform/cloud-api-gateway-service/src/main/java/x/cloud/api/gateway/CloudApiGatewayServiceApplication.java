package x.cloud.api.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudApiGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApiGatewayServiceApplication.class, args);
    }

}