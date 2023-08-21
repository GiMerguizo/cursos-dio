# Manipulando arquivos Linux
## Terminal Linux
date => data e hora <br>
clear => limpa a tela

## Navegando pelo sistema de arquivos
`pwd` => indica onde estou <br>
`cd /` => diretório raiz
<br>
Mostrar a lista toda:
`ls | more`
<br>
Filtrar:
```
ls nome_arquivo
ls (nome/letra)*
```
Ex.:
```
ls p*
ls m?g*
ls arquivo[1-3].txt
ls arquivo[2,5]*
ls arquivo[^2,5]*
ls arquivo[^3-5]*
```

touch => cria arquivos vazios
