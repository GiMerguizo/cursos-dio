# Instalando Linux
Iremos utilizar inicialmente: Ubuntu Server <br>

Link: https://ubuntu.com/download/ <br>

- Máquina Vitual utilizada: VirtualBox <br>
https://www.virtualbox.org/

## Criando Máquias Virtuais
- Abrir o Prompt de Comando como ADM; <br>
`bcdedit`
	- Se o hypervisorlauchtype tiver _Auto_ =>
`bcdedit /set hypervisorlauchtype off` <br>

reboot => reinicia a máquina <br>
shutdown 0 => desliga

## WSL
- Checar se o Windows é versão Pro;
- Abrir o Painel de Controle > Ativar ou desativar recursos do Windows > Verificar as seguintes instalações:
 	- Plataforma de Máquina Virtual;
	- Plataforma de Hipervisor do Windows;
	- Subsistema do Windows para Linux;
