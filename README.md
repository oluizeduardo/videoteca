# videoteca

- Arquitetura MVC
	- Model
	- View 
	- Controller
	- https://www.devmedia.com.br/introducao-ao-padrao-mvc/29308
	
- DAO (Data Access Object)
	- Pacote para conter as classes de manpulação da base de dados.
	- Independente se tiver usando banco de dados Oracle, PostgreSQL, MySQL, arquivo de texto ou planilha,
	deixe sempre as classes DAO exclusívas para fazerem o acesso à sua base de dados. Quando tiver que mudar
	o tipo de base de dados ex: de CSV para MySQL, você terá que alterar apenas as classes DAO.
	
- Criação da classe Stream
	- O professor pediu para trabalhar com somente filmes, porém ele deixou claro que quer ver como vocês deixam os sistema flexível para crescer sem muito impacto no código e vocês poderão usar isso para justificar essa parte.
	- Hoje sua locadora trabalha somente com aluguéis de filmes, mas amanhã vocês poderão trabalhar com a venda/aluguél de outros streamings, como série, música, podcast. A classe Stream é a mais genérica e de dá possibilidades de aplicar POLIMORFISMO.
	- Se tiver que adicionar outra forma de Stream, basta somente estender de Stream.
	
- DAOBase
	- Interface que implementa métodos abstratos que qualquer classe DAO deveria ter para acessar o banco de dados.
	- A classe que implementar essa interface terá por obrigação que implementar os métodos abstratos.
	- Adicionado métodos básicos CRUD: save, delete, update e find com parâmetros e retornos referenciando a classe Stream. Mais uma vez, usar aqui a classe Stream te dá abertura para aumentar o sistema sem ter que fazer muitas modificações, pois esses mesmos métodos servirão quando você adicionar mais serviços de streaming na sua locadora.
	- Usado padrão "generics". É como se eu colocasse parâmetros para a utilização da interface.

- CSVFileDAO
	- Criação da classe DAO exclusiva para manipulação de base de dados usando um arquivo CSV.
	- Esse padrão tem que ser exclusivo para manipulação dos dados contidos no arquivo CSV.
	- Caso você mude de banco de dados, terá que implmentar uma classe nova exclusiva para aquele banco de dados.
	- Nesta classe você criará somente os métodos que acessam o arquivo CSV e carregam a lista de filmes.
	
- MovieDAO
	- Classe de manipualção dos dados exclusivos de filmes.
	- Nesse momento a classe CSVFileDAO já carregou o arquivo CSV e você já tem a lista com todos os filmes.
	- Agora toda manipulação que você tiver que fazer (adicionar, excluir, atualizar, etc), primeiro você terá que mexer na lista e depois atualizar no arquivo CSV.
		Ex: Se for apagar um filme de código 123 -> busque na lista o filme com aquele código, remova o filme da lista e atualize o arquivo CSV com os dados da sua lista atual.

- MOVIES_DATASET_FILE_PATH
	- Endereço no seu computador onde está o arquivo CSV.
	
- APPVIEW
	- Sua classe princiapl onde terá toda interação com o usuário.