print("Oi, seja bem-vindo!")
idade = int(input("Sua idade: "))
nome = input("Seu nome: ")

print('Olá,',nome,'! Você possui', idade, 'anos. Correto?')
print('Olá, {}! Você possui {} anos. Correto? '.format(nome, idade))

age, name = (23, 'Guilherme')
print(f'Meu nome é {name} e eu tenho {age} ano(s) de idade.')
