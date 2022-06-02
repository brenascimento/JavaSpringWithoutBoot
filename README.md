# Fazendo uma aplicação Spring sem o Spring Boot

<em>Mini projeto feito com o [vídeo em inglês de Dan Vega](https://www.youtube.com/watch?v=e8aSyQo0nHo)</em>

Este mini projeto é para a criação e uso do Spring para entender melhor como é feito a configuração e gerenciamento de outros arquivos por meio do Spring IoC, e instâncias de beans manualmente. Isso ajuda a entender melhor como funciona o Spring quando em uso. 

1. Criação de um projeto Maven comum
2. Adição de dependencias manualmente
3. Criação manual de `Service`, `Model`, `Repository` e `Config`
4. Adicionar `@Configuration` no `config/AppConfig.java`para o Spring IoC entender que é um arquivo de Configuração.
5. Adicionar `@Bean` no `config/AppConfig.java` para o Spring fazer o gerenciamento de instâncias dos meus arquivos.
6. Depois para entender melhor e mais limpo, apagar os Beans do `config/AppConfig.java`, e adicionar `@Service` no `service/CourseService.java`, `@Repository` no `repository/CourseRepository`.
7. Adicionar `@ComponentScan("dev.danvega")` no `config/AppConfig.java`

<hr />

`Model`: Modelo de cada objeto instânciado. ex: `Course` model
`Service`: Uso de serviços disponibilizados pelo projeto. ex: `courseService.list()` para listar os cursos.
`Repository`: "Armazenamento de dados" do projeto. ex: `courseRepository.findall()` que faz uma lista de cursos, cria um curso(`springboot`) baseado inteiramente na `Model` e adiciona a lista criada. 
`Config`: Configuração do `ApplicationContext` e onde são armazenados nossos `beans`



