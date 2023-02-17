# Desafio QA - eNe Soluções

### Tópicos

:small_blue_diamond: [Descrição do projeto](#descrição) </br>
:small_blue_diamond: [Técnicas e tecnologias utilizadas no projeto](#técnicas-e-tecnologias-utilizadas) </br>
:small_blue_diamond: [Cenários de testes ](#cenário-de-testes) </br>
:small_blue_diamond: [Pré-requisitos](#pré-requisitos) </br>
:small_blue_diamond: [Executando o projeto](#executando-o-projeto) </br>


## Descrição

<p>Este projeto de automação de API com REST Assured + Java foi desenvolvido para avaliar habilidades para ser colaborador da eNe Soluções e fazer parte do time de QA.</p>
<p>Foi realizado uma automação da API pública  <i>https://petstore.swagger.io/</i> e levantado alguns possíveis cenários de testes (em BDD).</p>

## Técnicas e tecnologias utilizadas
- Java 8 (JDK);
- Intellij;
- Maven (como gerenciador de dependências);
- JUnit;
- REST Assured.


## Cenário de testes
<p>Segue abaixo alguns cenários de testes levantados para o projeto.</p>

- **CT001** Validar cadastro de pet
- **CT002** Validar busca de pet
- **CT003** Validar busca de pets por status
- **CT004** Validar exclusão de cadastro de pet
- **CT005** Validar atualização de cadastro de pet

## Pré-requisitos
<p>Para executar o projeto na sua máquina, é necessário:</p>

- JDK 8;
- [Maven](https://maven.apache.org/download.cgi) configurado nas variáveis de ambiente ([tutorial aqui](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26));
- Baixar e instalar o [Intellij Community Edition](https://www.jetbrains.com/pt-br/idea/download/download-thanks.html?platform=windows&code=IIC);
- Clonar o projeto na sua máquina através do comando git ou baixar o projeto, descompactá-lo e importar para o Intellij;

## Executando o projeto

<p>Para executar o projeto é necessário:</p>

- Baixar as dependências do Maven no projeto (caso nao baixa automaticamente ao importar o projeto);
- Localizar a classe java Suite em <i>src/test/java/suites</i>;
- Clicar no ícone PLAY para executar o projeto de testes.

# Autor

| [<img src="https://avatars.githubusercontent.com/u/17802288?v=4" width=115><br><sub>Lucas dos Santos Silva</sub>](https://github.com/eulucasilva) | 
|:-------------------------------------------------------------------------------------------------------------------------------------------------:|
