package com.example.demo.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.event.RecursoCriadoEvento;

@Component
public class RecursoCriadoEventoListener implements ApplicationListener<RecursoCriadoEvento> {

	@Override
	public void onApplicationEvent(RecursoCriadoEvento recursoCriadoEvento) {

		HttpServletResponse response = recursoCriadoEvento.getResponse();

		Long codigo = recursoCriadoEvento.getCodigo();

		setHeaderAndUrl(response, codigo);

	}

	private void setHeaderAndUrl(HttpServletResponse response, Long codigo) {
		URI url = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/codigo").buildAndExpand(codigo).toUri();
		response.setHeader("Location", url.toASCIIString());
	}

}
