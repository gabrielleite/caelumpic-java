# caelumpic-java

## Descrição do Projeto

O objetivo desse projeto é treinar e testar os conhcimentos obtidos durante a formação Java da Caelum e, ao mesmo tempo, estimular o aluno a crescer ainda mais buscando adquirir novos conhecimentos.

O caelumpic-java é uma aplicação web desenvolvida em Java, utilizando o [Spring MVC](https://spring.io/) como framework para auxialiar o desenvolvimento e, além disso, utiliza também o [Materialize](http://materializecss.com/), uma biblioteca JS e CSS para dar à aplicação o visual utilizado pelo Material Design do Google.

O objetivo é atingir uma aplicação como nas imagens a seguir.

> Imagens em breve.

## Baby Steps

A seguir serão descritos os passos necessários para desenvolver a aplicação. A qualquer momento que quiser verificar a solução basta clicar no link. No entanto, é altamente indicado que tente fazer a solução por conta própria antes de ver a solução.

> **Obs.:** O nome do pacote onde cada classe será criada pode ficar a seu critério. No entanto, lembre-se que o Spring irá scannear o pacote `br.com.caelum.caelumpic`, então todos os pacotes criados deverão ser subpacotes desse.

### Listagem de Fotos
1. Criação da classe `Foto` com seus atributos id, título, descrição, endereço e data de criação.
    1. A definição do tipo de cada atributo faz parte do exercício.
    1. Crie também os getters e setters dos atributos.
    1. Mapeie a classe corretamente para que represente uma tabela no banco de dados com o nome `fotos`.
1. Criação da classe `FotoDao` para acesso à tabela `fotos`.
    1. Criação do método `lista()` da classe `FotoDao` que deverá retornar uma `List<Foto>` contendo todas as fotos do banco de dados.
1.  Criação da classe `FotoController` para encapsular as actions referentes ao modelo `Foto`.
    1. Criação do método `lista()` da classe `FotoController` que deverá ser mapeado para uma action e retornar a página de listagem de fotos.
    1. O método `lista()` deverá ser capaz de obter através de um objeto de `FotoDao` a lista de fotos e enviar para a página JSP que será carregada em seguida.
1. Na página já criada para listagem de fotos (`fotos/lista.jsp`), habilitar o uso da tag `c:forEach` do JSTL para listar as fotos recebidas pela action `lista()` da classe `FotoController`.
1. Habilitar a tag customizada `caelum:fotoCartao` a receber uma foto como atributo para exibir os dados da mesma de forma flexível.

### Inserção de Foto
> Em breve.
### Atualização de Foto
> Em breve.
### Remoção de Foto
> Em breve.
### Extras
> Em breve.

## Soluções
> Em breve.