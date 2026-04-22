JPA/Hibernate Mini Project
Sobre o projeto

Este repositório demonstra o uso do JPA (Jakarta Persistence API) com Hibernate como provider para persistência de dados em Java.
O objetivo é mostrar como configurar o ambiente, mapear entidades e realizar operações básicas de CRUD (Create, Read, Update, Delete) em um banco de dados relacional.
Tecnologias utilizadas

    Java SE 17

    Jakarta Persistence API 3.1

    Hibernate ORM 6.4.4.Final

    MySQL (pode ser adaptado para outros bancos)

    Maven para gerenciamento de dependências

Estrutura do projeto

    src/main/java/ → código fonte principal

        Dominio/ → classes de entidades (Pessoa, etc.)

        aplicacao/ → classe principal (Programa) para execução

    src/main/resources/META-INF/ → arquivo persistence.xml com configuração do JPA

Configuração

    Crie um banco de dados no MySQL (exemplo: aulajpa).

    Ajuste o arquivo persistence.xml com suas credenciais:
    xml

    <property name="jakarta.persistence.jdbc.url"
              value="jdbc:mysql://localhost:3306/aulajpa?useSSL=false&amp;serverTimezone=UTC"/>
    <property name="jakarta.persistence.jdbc.driver"
              value="com.mysql.cj.jdbc.Driver"/>
    <property name="jakarta.persistence.jdbc.user" value="usuario"/>
    <property name="jakarta.persistence.jdbc.password" value="senha"/>

    Compile e execute o projeto com Maven:
    bash

    mvn clean package
    java -cp target/classes aplicacao.Programa

Exemplos de uso
Persistindo entidades
java

Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
em.getTransaction().begin();
em.persist(p1);
em.getTransaction().commit();

Consultando entidades
java

Pessoa pessoa = em.find(Pessoa.class, 1);
System.out.println(pessoa);

Conceitos principais

    JPA: especificação para persistência de dados em Java.

    Hibernate: implementação da JPA usada como provider.

    EntityManager: responsável por gerenciar operações de persistência.

    Entidades: classes anotadas com @Entity que representam tabelas no banco.

Licença

Este projeto é de uso livre para fins de estudo e aprendizado.
