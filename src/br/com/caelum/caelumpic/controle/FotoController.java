package br.com.caelum.caelumpic.controle;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String form(Long id, Model modelo) {
		/* A mesma action e pagina de formulario pode servir tanto para adicionar
		 * quanto editar, basta verificar se um id esta sendo passado como parametro
		 * da URL. Se estiver eh pq o usuario deseja editar uma foto e o que devemos
		 * fazer eh carrega-la a partir do BD. Caso nao tenha um parametro id na URL,
		 * o usuario deseja criar uma nova foto, então devolvemos um objeto foto vazio.
		 * 
		 * Ex.:
		 * 		foto/formulario -> inserir nova foto.
		 * 		foto/formulario?id=1 -> editar a foto com id 1.
		 */
		if (id != null) {
			modelo.addAttribute("foto", dao.buscaPorId(id));
		} else {
			modelo.addAttribute("foto", new Foto());
		}
		return "/foto/formulario";
	}
	
	/* Anotacao @Transactional delega o controle da transacao ao Spring
	 * iniciando a transacao ao inicio do metodo e finalizando
	 * quando ele terminar.
	 */
	@Transactional
	@RequestMapping("/foto/persistirFoto")
	public String adiciona(Foto foto) {
		/* A mesma action pode servir tanto para adicionar quanto editar, basta
		 * verificar se a foto tem id, se tiver eh pq foi carregada a partir do BD
		 * e o que devemos fazer eh edita-la. Caso nao tenha id, a foto eh nova, logo
		 * devemos inserir ela no BD.
		 */
		if (foto.getId() != null) {
			dao.atualiza(foto);
		} else {
			dao.adiciona(foto);
		}
		return "redirect:/foto/lista";
	}
	
	/* Anotacao @ResonseBody devolve status 200 para a requisicao HTTP caso nao
	 * tenha ocorrido nenhum problema. Alem disso, qualquer retorno dado pelo metodo
	 * sera incluido no corpo da resposta.
	 */
	@ResponseBody
	@Transactional
	@RequestMapping("/foto/remove")
	public void remove(Foto foto) {
		dao.remove(foto);
	}
}
