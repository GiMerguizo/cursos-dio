programa
{
	
	funcao inicio()
	{
		real jan, fev, mar, abr, media, total

		escreva("Valor de janeiro: ")
		leia(jan)
		escreva("Valor de fevereiro: ")
		leia(fev)
		escreva("Valor de março: ")
		leia(mar)
		escreva("Valor de abril: ")
		leia(abr)

		total = (jan+fev+mar+abr)
		media = total/4

		escreva("Soma: R$ " + total)
		escreva("\nMédia: R$ " + media)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */