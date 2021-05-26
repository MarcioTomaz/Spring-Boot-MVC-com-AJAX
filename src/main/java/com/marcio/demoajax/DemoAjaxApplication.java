package com.marcio.demoajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcio.demoajax.domain.SocialMetaTag;
import com.marcio.demoajax.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoAjaxApplication.class, args);
	}
	
	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {
		
		SocialMetaTag og = service.getOpenGraphByUrl("https://www.pichau.com.br/cadeira-gamer-dt3-sports-elise-rainbow-six-grey-12343-3");
		System.out.println(og.toString());
		
		SocialMetaTag twitter = service.getTwitterCardByUrl("https://www.pichau.com.br/cadeira-gamer-dt3-sports-elise-rainbow-six-grey-12343-3");
		System.out.println(twitter.toString());
	}

}
