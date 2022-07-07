programa
{
	funcao inicio()
	{
		inteiro x, y

		escreva("Digite os números para executar a soma do intervalo \n")
		escreva("Valor 1: ")
		leia(x)
		escreva("Valor 2: ")
		leia(y)

		escreva(soma(x, y))
	}
	funcao inteiro soma(inteiro x, inteiro y){
		inteiro total, resultado_parcial
		total = y/2
		resultado_parcial = y + x

		inteiro resultado = total * resultado_parcial
		retorne resultado
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */