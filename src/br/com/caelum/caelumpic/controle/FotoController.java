package br.com.caelum.caelumpic.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* Anotação @Controller habilita a classe a ser uma controladora da aplicação
 * e conter actions.
 */
@Controller
public class FotoController {
	
	/* Anotação @RequestMapping cria uma action do Spring para a URL passada como
	 * parâmetro.
	 */
	@RequestMapping("foto/lista")
	public String lista() {
		return "/foto/lista";
	}
}
