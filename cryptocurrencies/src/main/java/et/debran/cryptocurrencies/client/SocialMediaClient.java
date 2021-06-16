package et.debran.cryptocurrencies.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import et.debran.cryptocurrencies.domain.SocialMedia;

@FeignClient("social-media-services")
public interface SocialMediaClient {
	
	@GetMapping
	public SocialMedia getMedia();

}
