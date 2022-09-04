def valida (pergunta, min, max):
    op = int(input(pergunta))
    while ((op < min) or (op > max)):
        op = int(input(pergunta))
    return op

def listarJogos(nomeArquivo):
    try:
        a = open(nomeArquivo, 'rt')
    except:
        print('Erro ao ler o arquivo!')
    else:
        print(a.read())
    finally:
        a.close()

def cadastrarJogo(nomeArquivo,jogo,plataforma):
    try:
        a = open(nomeArquivo, 'at')
    except:
        print('Erro ao tentar abrir o arquivo!')
    else:
        a.write('{}; {}\n'.format(jogo,plataforma))
    finally:
        a.close()

def criaArquivo(nomeArquivo):
    try:
        a = open(nomeArquivo, 'wt+')
        a.close()
    except:
        print('Erro ao criar arquivo!')
    else:
        print('O arquivo ({}) foi criado com sucesso!'.format(nomeArquivo))

def existeArquivo(nomeArquivo):
    try:
        a = open(nomeArquivo, 'rt')
        a.close()
    except FileNotFoundError:
        return False
    else:
        return True

arquivo = 'games.txt'
if existeArquivo(arquivo):
    print('Arquivo Localizado!')
else:
    print('Arquivo inexistente.')
    criaArquivo(arquivo)

while True:
    print('MENU')
    print('1 - Cadastrar novo item')
    print('2 - Listar itens cadastrados')
    print('3 - Sair')

    op = valida('Selecione a opção desejada: ',1,3,)
    if op == 1:
        print('Opção de cadastrar selecionada.')
        jogo = input('Nome do jogo: ')
        plataforma = input('Plataforma: ')
        cadastrarJogo(arquivo,jogo,plataforma)
    elif op == 2:
        print('Opção de listar selecionada.')
        listarJogos(arquivo)
    elif op == 3:
        print('Programa Encerrado.')
        break
