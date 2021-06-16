package et.debran.socialmediaservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import et.debran.socialmediaservices.model.SocialMedia;

@Service
public class SocialMediaService {
	
	private Logger logger = LoggerFactory.getLogger(SocialMediaService.class);
	
	public SocialMedia getMediaData() {
		logger.info("getMediaData ");
		SocialMedia media = new SocialMedia();
		media.setId("t_00001");
		media.setName("Twitter");
		media.setUrl("http://twitter.com/cryptoinfo");
		media.setText("Ada is fully decentralized");
		logger.info("found {}", media.toString());
		return media;
	}
}
