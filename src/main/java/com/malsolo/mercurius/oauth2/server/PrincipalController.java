package com.malsolo.mercurius.oauth2.server;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

}
