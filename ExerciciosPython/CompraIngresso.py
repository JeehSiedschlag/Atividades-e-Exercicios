print('Bem vindo! Compre seu ingresso aqui!')
sair = input('Confirme para consultar valores ou digite sair para cancelar: ')
compra = 'enter'
cont = 0
idades = 0
total = 0
preco = 0

while True and sair != 'sair':
    idade = int(input('Qual é a idade? '))

    if idade < 3:
        preco = 0
        print('O valor do ingresso é R$ {}.'.format(preco))
        compra = input('Digite (enter) para confirmar a compra ou qualquer outra tecla para cancelar: ')
        sair = input('Digite (sair) para cancelar: ')
        if not idade:
            break
    if (idade > 2) and (idade < 12):
        preco = 15
        print('O valor do ingresso é R$ {}.'.format(preco))
        compra = input('Digite (enter) para confirmar a compra ou qualquer outra tecla para cancelar: ')
        sair = input('Digite (sair) para cancelar: ')
        if not idade:
            break
    if idade >= 12:
        preco = 30
        print('O valor do ingresso é R$ {}.'.format(preco))
        compra = input('Digite (enter) para confirmar a compra ou qualquer outra tecla para cancelar: ')
        sair = input('Digite (sair) para cancelar: ')
        if not idade:
            break
    if compra == 'enter':
        print('Compra realizada com sucesso!')
        print('Aperte qualquer tecla para fazer outra compra,')
        sair = input('ou digite (sair) para encerrar: ')
        cont += 1
        idades += idade
        total += preco
    if sair == 'sair':
        print('Encerrando.')
        break
print('{} pessoas compraram ingressos neste terminal.'.format(cont))
print('A média de idade dos frequentante é de {} anos'.format(idades/cont))
print('O total arrecadado neste terminal foi de R$ {},00.'.format(total))
