package et.debran.cryptocurrencies.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import et.debran.cryptocurrencies.domain.Crypto;

@Service
public class CryptoService {
	private Logger logger = LoggerFactory.getLogger(CryptoService.class);
	
	public Crypto getCrypto() {
		logger.info("getCrypto");
		return new Crypto();
		
	}
}
