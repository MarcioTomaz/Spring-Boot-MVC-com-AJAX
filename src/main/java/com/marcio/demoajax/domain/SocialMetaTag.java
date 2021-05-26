package com.marcio.demoajax.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class SocialMetaTag implements Serializable{

	private String site;
	private String title;
	private String url;
	private String image;

}
