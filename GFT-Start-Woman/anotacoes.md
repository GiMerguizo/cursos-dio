# Módulo I
## Introdução à lógica de programação

**Algoritmos:** sequência de passos que resolve um problema; <br>
**Programa:** sequência de passos; <br>
**Pseudocódigo:** uma forma genérica de escrever um algoritmo, utilizando uma linguagem simples;<br>
**Fluxograma:** representa graficamente o algoritmo;
- Representação esquemática de um processo. <br>

**Variável:** um objeto capaz de reter e representar um valor ou expressão;
- Espaço na memória do computador; <br>

**Constantes:** valores imutáveis e não são alterados durante a vida útil do programa; <br>

**Concatenação:** unir o conteúdo de duas strings.

### Exercícios
Minha rotina
```
Início-do-dia
	Acordar
	Tomar remédio
	Levantar
	Trocar de roupa
	Responder mensagens
	Tomar café
	Arrumar a cama
	Escovar os dentes
	Estudar
	Almoço
	Escovar os dentes
	Estudar
	Tomar café da tarde
	Tomar banho
	Se dia for dia da semana
		Faculdade
	Dormir
Fim-do-dia		
```

Wolf and Sheep
```
Ovelha entra no barco
Atravessa
Ovelha sai do barco
Atravessa
Lobo entra no barco
Atravessa
Lobo sai do barco
Ovelha entra no barco
Atravessa
Ovelha sai do barco
Repolho entra no barco 
Atravessa
Repolho sai do barco
Atravessa
Ovelha entra no barco
Atravessa
Ovelha sai do barco
```

Pinguins numa fria
```
Pai verde entra no gelo
Filhote verde entra no gelo
Atravessa
Pai verde sai
Atravessa
Filhote vermelho entra
Atravessa
Filhote verde sai
Atravessa
Pai vermelho entra
Atravessa
Pai vermelho sai 
Atravessa
Filhote azul entra
Atravessa
Filhote vermelho sai
Atravessa
Pai azul entra
Atravessa
Pai azul sai
Filhote azul sai
Fim
```

## Estruturas de Dados e Algoritmos
**Estruturas de Dados:** estrutura organizada de dados na memória de um dispositivo de armazenamento.

- Vetor: varável que armazena várias variáveis do mesmo tipo.
- Matriz: um vetor que possui duas ou mais dimensões.
- Registro: fornece um formato especializado para armazenar informações em memória.
    - Pode armazenar mais de um tipo de dado;
    - Campos específicos;
- Lista: possuem tamanho ajustável.
- Pilha: uma coleção de elementos;
    - permite o acesso a somente um item de dados armanezado.
    - LIPO (UEPS): Último que Entra Primeiro que Sai;
    - FIFO (PEPS): Primeiro que Entra Primeiro que Sai;
- Filas: mesmo conceito FIFO.
- Árvore: forma hierárquica;
    - Raiz;
    - Nós ou folhas;
- Tabela Hash: espalha os elementos e define uma tabela; 
    - Associa chaves de pesquisa aos valores.
- Grafos: permitem programar a relação entre os objetos;

## Git & GitHub
### Pontos positivos
- Controle de Versão;
- Armazenamento em nuvem;
- Trabalho em equipe;
- Melhorar seu código;
- Reconhecimento;


### Primeiros comandos no Git
- `git init`: inicia o git
ls -a => mostra pastas ocultas

**Configurando pela primeira vez**
```
git config --global user.email "e-mail"
git config –global user.name GiMerguizo
```

**Clonar um repositório do github:** <br>
`git clone “caminho do repositório SSH”`

**Token de acesso pessoal** <br>
Developer settings => Personal access tokens <br>
`git clone “código_html”`

**Comandos para modificar o repositório**
```
git status
git add *
git commit -m “mensagem”
```

- mv => mover itens do repositório
```
git config --list
git config --global --unset “caracteristica_que_quer_alterar”
```

**Repositórios Remotos no GitHub**
```
git remote add origin “link”
git remote -v => lista os repositórios remotos
git push origin master
```

Conflitos
- Versões

`git pull origin master`

## Terminal
### Windows
- cd => acessar diretório 
- cd.. => sair do diretório
- dir => listar itens (Linux – ls)
- mkdir => criar diretório
- del => exclui arquivos
- rmdir => exclui diretórios
	/S /Q
- cls => limpar o terminal (clear – Linux)
- Tab => autocompletar
- echo => escreve
- '>' => redireciona

### Embaixo dos panos
**SHA1:** Algoritmo de Hash Seguro;
- Encriptação de 40 dígitos;
- Forma curta de representar um arquivo.
Comando: <br>
`Git Bash -> openssl sha1 “nome_do_arquivo”`

Objetos internos
Blobs
 
Comando:
`git hash-object –stdin`
 
**Tree:** armazenam blobs ou outras árvores
 
**Commit:** junta tudo
 
 
### Chave SSH
#### Comandos para criar a chave:
`ssh-keygen -t ed25519 -C “e-mail”`
Chave pública: <br>
`cat id_ed25519.pub`

`eval $(ssh-agent -s)`
`ssh-add id_ed25519`

pwd => mostra o caminho completo
