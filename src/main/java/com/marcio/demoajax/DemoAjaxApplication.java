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
		
		SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.colombo.com.br/produto/Eletroportateis/Jarra-Eletrica-Cadence-1-7-Litros-Preta-CEL550");
		System.out.println(tag.toString()); 
		
	
	}

}
