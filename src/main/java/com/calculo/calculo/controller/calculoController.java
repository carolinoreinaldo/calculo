package com.calculo.calculo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/calculo")
public class calculoController {

	@RequestMapping(method=RequestMethod.GET)
	public Map<String, Object> test() {
		final Map<String, Object> mapa = new HashMap<>();
		mapa.put("codigo", 1234);
		mapa.put("nome", "fulano");
		return mapa;
	}
}