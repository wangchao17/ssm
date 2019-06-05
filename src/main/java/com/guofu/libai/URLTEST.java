package com.guofu.libai;

import org.springframework.web.util.UriComponentsBuilder;

public class URLTEST {
	public static void main(String[] args) {
		String url ="https://cnecomft1.amwaynet.com.cn/socialSharing?code=1AmwayHybris&&rr=gg&";
		System.out.println(shareLinkUtm(url));
	}
	
	public static String shareLinkUtm(String uri){
		String utm_source="";
		try {
			utm_source = "utm_source";
		} catch (Exception e) {
		}
		if(utm_source !=null){
			uri = UriComponentsBuilder.fromUriString(uri).queryParam("utm_source", utm_source).build().toString();
		}
		return uri;
	}
}
