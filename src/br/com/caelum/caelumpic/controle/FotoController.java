package br.com.caelum.caelumpic.controle;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.caelumpic.dao.FotoDao;
import br.com.caelum.caelumpic.modelo.Foto;

/* Anotacao @Controller habilita a classe a ser uma controladora da aplicacao
 * e conter actions.
 */
@Controller
public class FotoController {
	
	/* Anotacao @Autowired injeta uma dependencia.
	 * Como discutido em sala, o melhor ponto de injecao seria no construtor, da seguinte
	 * forma:
	 * 
	 * @Autowired
	 * public FotoController(FotoDao dao) {
	 * 		this.dao = dao;
	 * }
	 */
	@Autowired
	private FotoDao dao;
	
	/* Anotacao @RequestMapping cria uma action do Spring para a URL passada como
	 * parametro.
	 */
	@RequestMapping("/foto/lista")
	public String lista(Model modelo) {
		/* A interface Model permite levar uma informacao para a JSP que sera
		 * carregada pela action. Para isso, basta usar o metodo addAttribute()
		 * passando como primeiro parametro a etiqueta que ira identificar a informacao
		 * quando ela chegar na JSP e, como segundo parametro, a informacao em si.
		 * 
		 * Uma instancia de Model pode ser obtida como parametro do metodo pois o
		 * Spring se encarregara de cria-la e de nos passar ela.
		 */
		modelo.addAttribute("fotos", dao.lista());
		return "/foto/lista";
	}
	
	@RequestMapping("/foto/formulario")
	public String form(Model modelo) {
		modelo.addAttribute("foto", new Foto());
		return "/foto/formulario";
	}
	
	/* Anotacao @Transactional delega o controle da transacao ao Spring
	 * iniciando a transacao ao inicio do metodo e finalizando
	 * quando ele terminar.
	 */
	@Transactional
	@RequestMapping("/foto/persistirFoto")
	public String adiciona(Foto foto) {
		dao.adiciona(foto);
		return "redirect:/foto/lista";
	}
}
