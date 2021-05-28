package com.marcio.demoajax;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marcio.demoajax.domain.SocialMetaTag;
import com.marcio.demoajax.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		
		
		SpringApplication.run(DemoAjaxApplication.class, args);
	}
	@Bean
	public LocaleResolver localeResolver(){
	   return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
	
	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {
		
	
	
	}

}
