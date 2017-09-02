package br.com.caelum.caelumpic.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.caelumpic.dao.FotoDao;

/* Anota��o @Controller habilita a classe a ser uma controladora da aplica��o
 * e conter actions.
 */
@Controller
public class FotoController {
	
	/* Anota��o @Autowired injeta uma depend�ncia.
	 * Como discutido em sala, o melhor ponto de inje��o seria no construtor, da seguinte
	 * forma:
	 * 
	 * @Autowired
	 * public FotoController(FotoDao dao) {
	 * 		this.dao = dao;
	 * }
	 */
	@Autowired
	private FotoDao dao;
	
	/* Anota��o @RequestMapping cria uma action do Spring para a URL passada como
	 * par�metro.
	 */
	@RequestMapping("foto/lista")
	public String lista(Model modelo) {
		/* A interface Model permite levar uma informa��o para a JSP que ser�
		 * carregada pela action. Para isso, basta usar o m�todo addAttribute()
		 * passando como primeiro par�metro a etiqueta que ir� identificar a informa��o
		 * quando ela chegar na JSP e, como segundo, par�metro a informa��o em si.
		 * 
		 * Uma inst�ncia de Model pode ser objetida como par�metro do m�todo pois o
		 * Spring se encarregar� de cri�-la e de nos passar ela.
		 */
		modelo.addAttribute("fotos", dao.lista());
		return "/foto/lista";
	}
}
