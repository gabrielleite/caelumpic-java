package br.com.caelum.caelumpic.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* Anota��o @Controller habilita a classe a ser uma controladora da aplica��o
 * e conter actions.
 */
@Controller
public class FotoController {
	
	/* Anota��o @RequestMapping cria uma action do Spring para a URL passada como
	 * par�metro.
	 */
	@RequestMapping("foto/lista")
	public String lista() {
		return "/foto/lista";
	}
}
