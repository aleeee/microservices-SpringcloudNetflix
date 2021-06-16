package et.debran.cryptocurrencies.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import et.debran.cryptocurrencies.client.SocialMediaClient;
import et.debran.cryptocurrencies.domain.Crypto;
import et.debran.cryptocurrencies.domain.SocialMedia;
import et.debran.cryptocurrencies.service.CryptoService;

@RestController
public class CryptoApi {
	protected static Logger logger = LoggerFactory.getLogger(CryptoApi.class);
	
	@Autowired
	private CryptoService cryptoService;
	@Autowired
	private SocialMediaClient socialMediaClient;
	
	@GetMapping
	public Crypto getCrypto() {
		logger.info("get crypto called");
		return cryptoService.getCrypto();
	}
	
	@GetMapping("/crypto/{id}")
	public SocialMedia getSocialMedia(@PathVariable("id") String id) {
		logger.info("get media called cryptoID: {}", id);
		return socialMediaClient.getMedia();
	}
}
