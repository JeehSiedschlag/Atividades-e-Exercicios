print('Bem-vindo ao nosso autoatendimento!')
sair = input('Confirme para fazer uma operação ou digite sair para cancelar: ')

while sair != 'sair':
    valor = int(input('Informe o valor que deseja sacar: R$ '))
    if valor > 0:
        ced100 = valor // 100
        ced50 = (valor % 100) // 50
        ced20 = (valor % 100) % 50 // 20
        ced10 = (valor % 100) % 50 % 20 // 10
        ced05 = (valor % 100) % 50 % 20 % 10 // 5
        ced01 = (valor % 100) % 50 % 20 % 10 % 5 // 1
        print(ced100, ced50, ced20, ced10, ced05, ced01)
        sair = input('Transação encerrada. Deseja sair ou fazer uma nova operação? ')
    elif valor <= 0:
        sair = input('Valor inválido! Tente novamente ou digite sair para cancelar: ')
    elif sair == 'sair':
        print('Operação Finalizada.')
    else:
        print('ERRO! Tente novamente.')
