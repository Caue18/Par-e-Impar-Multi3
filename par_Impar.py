import random  # Importação aleatória

# Função de aleatório
def lista_Gerada_random(size):
    lista_random = [random.randint(0, 100) for _ in range(size)]
    return lista_random

# Função de números escolha de par, ímpar e múltiplos de 3
print("---Resultado----")
def num_escolha(num): # Função  para escolher um número
    if num % 3 == 0:  # Se o número for múltiplo de 3
        print(f"{num} é múltiplo de 3")
    if num % 2 == 0:  # Se o número for par
        print(f"{num} é Par")
    else: # se For Impar
        print(f"{num} é Ímpar")

# Função Principal
def principal():
    size = int(input("Digite o Tamanho da lista: ")) # Digite um número
    lista_random = lista_Gerada_random(size) # gera uma lista com números aletorios
    print("Lista foi Gerada:", lista_random) # mensagem: "Lista foi gerada"
    for num in lista_random: #  Percorre  os valores da lista
        num_escolha(num)  #Chama a função de escolha de numero

if __name__ == "__main__": #  condição principal do programa
    principal()
