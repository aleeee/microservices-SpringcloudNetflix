package et.debran.socialmediaservices.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import et.debran.socialmediaservices.model.SocialMedia;
import et.debran.socialmediaservices.service.SocialMediaService;

@RestController
public class SocialMediaApi {
	private Logger logger = LoggerFactory.getLogger(SocialMediaApi.class);
	
	@Autowired
	private SocialMediaService service;
	
	@GetMapping
	public SocialMedia getMediaResponses() {
		logger.info("getMediaResponses");
				
		return service.getMediaData();
	}
}
