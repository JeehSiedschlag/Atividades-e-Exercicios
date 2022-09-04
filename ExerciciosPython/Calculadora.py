
print('CALCULADORA')
print('Informe os valores e a operação que deseja realizar.')
print('Selecione (+) para soma;')
print('Selecione (-) para subtração;')
print('Selecione (*) para multiplicação;')
print('Selecione (/) para divisão;')
sair = input('Se desejar sair basta digitar off ou qualquer tecla para continuar.')

while sair != 'off':
    a = float(input('Informe um valor: '))
    op = input('Qual operação deseja realizar? ')
    b = float(input('Informe um valor: '))

    if op == '+':
        c = a + b
        print('O resultado é: {} '.format(c))
    elif op == '-':
        c = a - b
        print('O resultado é: {} '.format(c))
    elif op == '*':
        c = a * b
        print('O resultado é: {} '.format(c))
    elif op == '/':
        c = a / b
        print('O resultado é: {} '.format(c))
    else:
        print('ERRO, VALOR OU OPERADOR INVÁLIDO!')
    sair = input('Se desejar sair basta digitar off ou qualquer tecla para continuar.')
