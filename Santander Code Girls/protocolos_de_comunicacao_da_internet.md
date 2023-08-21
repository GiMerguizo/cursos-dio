# Protocolos de comunicação da internet
## Conceitos básicos
### Criptografia por chave
- Assimétrica
- Simétrica: chave única privada; <br>
	Ex.: Cifra de César; Cifra de fluxo - bit a bit (0 e 1); Cifra de bloco;

### Certificado digital
- Certificação de chave pública
- Entidade certificadora (garante a autenticidade)
    - Verificação de identidade;
    - Emissão de certificados;

### Protocolo SSL
**Secure Socket Layer (SSL)**
- Protocolo de segurança
- Transport Layer Security (TLS)
- Dados confiáveis, autenticidade;

### Operações
3 fases:
- **Hanshake:** similar ao HTTP (utilização do TCP)
	- Verificação de Autenticidade;
	- Certificação;
	- Envio da Master Secret Key;
- **Key derivation**
    - Master Secret Key: somente para essa sessão;
- **Data Transfer**

**HTTPS:** HTTP + SSL
- Verificação de autenticidade por centificados digitais;
- Lei Geral de Proteção de Dados (LGPD)
    - Protege dados de identificação dos usuários;
	- Dados sensíveis;
	- Tratamento de dados;
	- Livre consentimento;
- Agência Nacional de Proteção de Dados (ANPD) 

## Protocolo HTTP
HyperText Transfer Protocol (HTTP)
<br>
Protocolo de cominucação > rege a estrutura das mensagens <br>
**Browser:** implementa o cliente HTTP <br>
**Servidor:** host objetos web
- Tudo que está dentro da página.

### Arquitetura Cient-server
- **Stateless:** não possui estado anterior armazenado
- **Cliente:** mensagens - request HTTP
- **Servidor:** mensagens - response HTTP

### HTTP 1.1
Transmission Control Protocol - TCP <br>
SYN - SYN ACK - ACK <br>
- **Persistente:** vai manter a conexão ativa
- **Não persistente:** encerra sem que seja percebido a conexão

Para executar uma request, precisa ter executado a interior

- Browser
    - Permissão de até 6 requesições HTTP simultâneas

### Mensagens HTTP

#### Request
- Conexão Não Persistente
 - Entity body: campo da mensagem request HTTP. 
    - Não utilizada pelo GET, mas pelo método POST.
- Métodos seguros: Get, Head, Option
	- Não modificam o estado do servidor.
	- Idempotente: sempre acarreta no mesmo resultado.
- 90% GET

#### Response
- WebDav: Web Distributed Authoring and Versioning
- Data, servidor, ...
- Entity Header: definições 
    - Campos: "accept" e "content"
    - Entity Body

### Cookies e Cache
- Identificação do usuário;
- Track (rastrear as informações dos clientes);
- Fornecimento de funções;
- Componentes:
    - Cookie header line
	    - Response message 
		- Request message
	- Cookie file: mantido no cliente e servidor;
		- Gerenciado pelo Browser;
	- Banco de Dados 
    - Backend: web site

Resquest HTTP - User ID (existe?) - Responde
- Histórico;
- Caminho;

**Cookies de sessão:** são deletados após encerrar a sessão; <br>
**Cookies persistentes:** os dados são guardados;
- Logins ativos;
- Carrinho de ecommerce;
- Informação de website;

**Cookies e Privacidade**
- Coletam informações sobre o cliente;
- Concentimento sobre os cookies;
- Hacking;
- LGPD & Cookies;
- Eles estão seguros???
	- Fishing
	- Criptografia se quebra

**Web Cache (Proxy server)**
- Checagem para mudanças;
- Redução do tempo de resposta;
- Redução de tráfego;

### HTTP 2.0 
HOL - Head of Line Blocking
- Conexão principal (persistente)
	- Envio de requisições de maneira independente;
	- Multiplexação;
	- Priorização de recursos;
- Segmentação do header do data;
	- Compactação;
	- Reutilização do Header;
- **Push:** envio de tudo que for necessário, mesmo sem requisição do cliente.
	- Não é habilitado por Default;
- HTTPS por padrão.

**Contras**
- Push
	- Configuração incorreta;
- Mix 1.1 e 2.0
	- Lentidão;
	- Load Balancer - HTTP 1.1;

### Servidores / Sistemas de aplicação
HTTP Servers
- Apache;
- Nginx;
- Xampp;

Comunicação <br>
`$ sudo wireshark`

## WebSocket
**Definição:** O protocolo fornece comunicação cliente/servior executando um código não confiável (a aplicação) em um ambiente controlado para o host que escolheu essa
comunicação.
<br>
**Web Applications**
- Uma conexão bidirecional;
- Roda encapsulado no HTTP
	- Via API;
	- Aplicações WEB, de tempo real;
	
- Adequação do HTTP para essas aplicações;
	- Rodando em cima do protocolo HTTP;

- **2 fases:** Handshake (simplificado com 2 vias - SYN e SYN ACK) e Data Transfer;

### Comunicação 
IP - DNS - Servidor HTTP

Com Proxy:
- Objetos Web em Cache;
- Update;

Load Balancer
- Distribuição de carga;
- Multiplexação;

