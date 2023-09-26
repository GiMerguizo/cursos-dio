# Versionamento de Código com Git e GitHub
## Versionamento
Gerar uma nova versão a cada alteração do código

## Git
Sistema de Controle de Versão Distribuído
- Gratuito e Open Source
- Branching e merging eficientes
- Leve e rápido

:link: [Documentação](https://git-scm.com/)

Comandos: <br>
`git init` <br>
`git status` <br>
`git add` <br>
`git clone` <br>
`git commit` <br>
`git pull` <br>
`git push` <BR>

## GitHub
Plataforma de hospedagem de código para controle de versão com Git, e colaboração.
- Comunidade ativa
- Servidor de hospedagem

### Desfazendo alterações
- Reverter o `git init`: `rm -rf .git`
- Alterar a mensagem do último commit:
`git commit --amend -m "nova mensagem"`
- Desfazer um commit <br>
`git reset --soft <id_commit>` <br>
`git reset --mixed <id_commit>` <br>
`gti reset --hard <id_commit>`  => desfaz os arquivos

### Branches
Ramificação do projeto
- Criar uma branch: `git checkout -b nova-branch`
- Último commit de cada branch: `git branch -v`
- Mesclar: `git merge`
- Listar: `git branch`
- Excluir: `git branch -d nome-branch`
- Baixar alterações: `git fetch`
- Verificar diferenças: `git diff`
- `git stash`

## 🔍 Referências
:link: [Navegar no GitHub](https://github.com/) <br>
:link: [Sintaxe básica de gravação e formatação no GitHub](https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax) <br>
