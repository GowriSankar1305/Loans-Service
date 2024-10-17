package com.mybank.loans.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "api")
public class ExternalConfig {
	private String name;
	private String key;
	private String url;
}
