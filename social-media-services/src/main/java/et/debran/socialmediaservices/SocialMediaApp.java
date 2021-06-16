package et.debran.socialmediaservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class SocialMediaApp {

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaApp.class, args);
	}

	@Bean
	Sampler traceSampler() {
		return new Sampler() {
			
			@Override
			public boolean isSampled(long traceId) {
				return Math.random() > .5;
			}
		};
	}
}
