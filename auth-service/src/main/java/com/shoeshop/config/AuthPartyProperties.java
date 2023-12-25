package com.shoeshop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "spring.security.oauth2.client.registration.google")
public class AuthPartyProperties {
    private String clientId;
    private String clientSecret;
}

