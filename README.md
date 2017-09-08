# caelumpic-java

## Descrição do Projeto

O objetivo desse projeto é treinar e testar os conhcimentos obtidos durante a formação Java da Caelum e, ao mesmo tempo, estimular o aluno a crescer ainda mais buscando adquirir novos conhecimentos.

O caelumpic-java é uma aplicação web desenvolvida em Java, utilizando o [Spring MVC](https://spring.io/) como framework para auxialiar o desenvolvimento e, além disso, utiliza também o [Materialize](http://materializecss.com/), uma biblioteca JS e CSS para dar à aplicação o visual utilizado pelo Material Design do Google.

O objetivo é atingir uma aplicação como nas imagens a seguir.

> Imagens em breve.

## Baby Steps

A seguir, serão descritos os passos necessários para desenvolver a aplicação. A qualquer momento que quiser verificar a solução basta clicar no link. No entanto, é altamente indicado que tente fazer a solução por conta própria antes de ver a solução.

> **Obs.:** O nome do pacote onde cada classe será criada pode ficar a seu critério. No entanto, lembre-se que o Spring irá scannear o pacote `br.com.caelum.caelumpic`, então todos os pacotes criados deverão ser subpacotes desse.

### Listagem de Fotos
1. Criação da classe `Foto` com seus atributos id, título, descrição, endereço e data de criação.
    1. A definição do tipo de cada atributo faz parte do exercício.
    1. Crie também os getters e setters dos atributos.
    1. Mapeie a classe corretamente para que represente uma tabela no banco de dados com o nome `fotos`.
1. Criação da classe `FotoDao` para acesso à tabela `fotos`.
1. Na classe `FotoDao`, crie um método responsável por listar as fotos devendo retornar uma `List<Foto>` contendo todas as fotos do banco de dados.
1.  Criação da classe `FotoController` para encapsular as actions referentes ao modelo `Foto`.
1. Na classe `FotoController`, crie um método que deverá ser mapeado para uma action e retornar a página de listagem de fotos. Esse método deverá ser capaz de obter através de uma instância de `FotoDao` a lista de fotos e enviar para a página JSP que será carregada em seguida.
1. Na página já criada para listagem de fotos (`foto/lista.jsp`), habilitar o uso da tag `c:forEach` do JSTL para listar as fotos recebidas pela action de listagem da classe `FotoController`.
1. Habilitar a tag customizada `caelum:fotoCartao` a receber uma foto como atributo para exibir os dados da mesma de forma flexível.

### Inserção de Foto
1. Na classe `FotoDao`, crie o método que será responsável por receber uma foto e adicioná-la ao banco de dados.
1. Crie um arquivo JSP para o formulário de cadastro de foto e que deverá enviar os dados da foto para alguma action do sistema. Lembre-se de criá-lo seguindo a convenção de localização de arquivos JSP dentro do projeto.
1. Na classe `FotoController`:
    1. Crie uma action para acessar a página de formulário para cadastro de foto.
    1. Crie uma outra action que deverá receber as informações vindas do formulário e, utilizando uma instância de `FotoDao`, insirir a informação no banco de dados. Por fim, o método deverá redirecionar o sistema para a página de listagem de fotos.
1.  No arquivo `tags/fab.tag`, habilite a tag a receber a informação do link para onde o sistema deve seguir ao ser clicado no fab. E utilize esse link no fab.
1. Na página de listagem de fotos (`fotos/lista.jsp`), utilize a tag fab que foi modificada no passo anterior, informando para a tag o link da página de formulário de cadastro de foto.

### Atualização de Foto
> Em breve.

### Remoção de Foto
> Em breve.

### Validação de Dados
> Em breve.

### Permissão e Autorização
> Em breve.

### Extras

#### Listagem de Fotos
1. Carregamento das fotos a medida que o usuário necessitar (`Lazy Loading`). Pode-se utilizar uma paginação ou carregamento de fotos a medida que o usuário for rolando a página para baixo.

#### Inserção de Foto
1. Pré-visualização da foto que será cadastrada, carregando a foto ao lado do formulário.
1. Ao término do cadastro de foto, exibir mensagem para o usuário informando sobre o sucesso da operação.

## Soluções
> Em breve.