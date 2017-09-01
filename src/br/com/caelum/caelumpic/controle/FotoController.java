package br.com.caelum.caelumpic.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FotoController {
	@RequestMapping("foto/lista")
	public String lista() {
		return "/foto/lista";
	}
	
	@RequestMapping("/foto/teste")
	public String teste() {
		return "/foto/teste";
	}
}
