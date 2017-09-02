package br.com.caelum.caelumpic.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.caelumpic.dao.FotoDao;

/* Anotação @Controller habilita a classe a ser uma controladora da aplicação
 * e conter actions.
 */
@Controller
public class FotoController {
	
	/* Anotação @Autowired injeta uma dependência.
	 * Como discutido em sala, o melhor ponto de injeção seria no construtor, da seguinte
	 * forma:
	 * 
	 * @Autowired
	 * public FotoController(FotoDao dao) {
	 * 		this.dao = dao;
	 * }
	 */
	@Autowired
	private FotoDao dao;
	
	/* Anotação @RequestMapping cria uma action do Spring para a URL passada como
	 * parâmetro.
	 */
	@RequestMapping("foto/lista")
	public String lista(Model modelo) {
		/* A interface Model permite levar uma informação para a JSP que será
		 * carregada pela action. Para isso, basta usar o método addAttribute()
		 * passando como primeiro parâmetro a etiqueta que irá identificar a informação
		 * quando ela chegar na JSP e, como segundo, parâmetro a informação em si.
		 * 
		 * Uma instância de Model pode ser objetida como parâmetro do método pois o
		 * Spring se encarregará de criá-la e de nos passar ela.
		 */
		modelo.addAttribute("fotos", dao.lista());
		return "/foto/lista";
	}
}
