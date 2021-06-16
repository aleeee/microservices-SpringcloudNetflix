package et.debran.cryptocurrencies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CryptocurrenciesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptocurrenciesApplication.class, args);
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
