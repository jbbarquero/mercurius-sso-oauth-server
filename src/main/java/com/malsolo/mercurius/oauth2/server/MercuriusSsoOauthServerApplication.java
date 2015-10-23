package com.malsolo.mercurius.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class MercuriusSsoOauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuriusSsoOauthServerApplication.class, args);
    }
}
