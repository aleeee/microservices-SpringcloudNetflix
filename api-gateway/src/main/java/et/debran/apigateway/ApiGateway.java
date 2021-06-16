package et.debran.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@EnableZuulProxy
@RestController
@EnableDiscoveryClient
public class ApiGateway {
	public static void main(String[] args) {
		SpringApplication.run(ApiGateway.class, args);
	}
	
	@Bean
    public SimpleFilter defaultSampler() {
        return new SimpleFilter();
    }
}
