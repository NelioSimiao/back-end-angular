package com.example.demo.config.token;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.example.demo.security.UsuarioSistema;

public class CustomTokenEnhancer implements TokenEnhancer {

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		UsuarioSistema usuarioSitema = (UsuarioSistema) authentication.getPrincipal();
		Map<String, Object> addInf = new HashMap<>();
		addInf.put("nome", usuarioSitema.getUsuario().getNome());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(addInf);
		return accessToken;
	}

}