# Acesso remoto a máquinas Linux
## via Windows
- Verificar o Ip da máquina:
`ip a`
Endereço Ip = `inet ...........` <br>
`sudo apt-get install openssh-server`

- Uso do PuTTY
	- Configurar o IP

## via Linux
- via Terminal
`ssh nome_usuario_maquina@ip_da_maquina`


## Máquina virtual em nuvem (AWS)
### Windows
- IP público da instância
- PuTTY
	Converter o arquivo `.pem` para `.ppk`
	Save private key
	ssh > auth > colocar o arquivo
	Colocar o IP

### Linux
- Arquivo do certificado (.pem)
- Terminal
	`ssh -i nome_arquivo.pem usuario@ip_maquinavirtual` <br>
	`~erro~` <br>
	`sudo chmod 600 nome_aquivo.pem`
