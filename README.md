
# Estruturas de Dados: Comparação de Vetores, Árvores Binárias e Árvores AVL
Este projeto tem como objetivo comparar o desempenho de três estruturas de dados diferentes: vetor, árvore binária e árvore AVL. 
A comparação é feita com base nos tempos de inserção e busca de elementos em diferentes ordens:
- **Ordenada**
- **Inversamente Ordenada**
- **Aleatória**


## Métodos de Ordenação e Busca

### Vetor
O vetor é uma estrutura de dados que armazena elementos em uma sequência linear. 
É testado para : 
- Inserção.
- **Ordenação:**
  - Bubble Sort
  - Merge Sort
- **Busca:**
  - Sequencial
  - Binária

### Árvore Binária de Busca
A árvore binária de busca é uma estrutura de dados onde cada nó tem, no máximo, dois filhos, e a subárvore à esquerda contém valores menores,
enquanto a subárvore à direita contém valores maiores. 
- **Inserção e Busca**

### Árvore AVL
A árvore AVL é uma árvore binária de busca auto-balanceada,
onde a diferença de altura entre as subárvores de qualquer nó é, no máximo, 1. 
- **Inserção e Busca** (com balanceamento automático)



## Estruturas de Dados Implementadas
- Vetor.java
- Arvore.java
- ArvoreAVL.java



## Execução do Programa
O programa é executado a partir da classe Principal.java, que gera conjuntos de dados em três ordens diferentes 
(ordenada, inversamente ordenada e aleatória) para diferentes tamanhos (100, 1000, 10000). 
Em seguida, realiza testes de inserção, ordenação e busca para cada estrutura de dados.



## Resultados dos Testes Realizados
Para cada tamanho de dados (100, 1000, 10000) e cada ordem, foram medidos os seguintes tempos:
- **Tempo de inserção**
- **Tempo de ordenação** (apenas para vetor)
- **Tempo de busca** (para primeiro, último, meio, aleatório e inexistente)

## Exemplo de resultado:

Testando vetor com 100 elementos na ordem ordenada
Tempo de insercao no vetor: 37400 ns
Tempo de ordenacao (Bubble Sort): 368200 ns
Tempo de ordenacao (Merge Sort): 126000 ns
Tempo de busca sequencial (primeiro): 1500 ns
Tempo de busca sequencial (ultimo): 3900 ns
Tempo de busca sequencial (meio): 1500 ns
Tempo de busca sequencial (aleatorio): 1900 ns
Tempo de busca sequencial (inexistente): 3000 ns
Tempo de busca binaria (primeiro): 3400 ns
Tempo de busca binaria (ultimo): 1400 ns
Tempo de busca binaria (meio): 900 ns
Tempo de busca binaria (aleatorio): 1100 ns
Tempo de busca binaria (inexistente): 900 ns

Testando arvore com 100 elementos na ordem ordenada
Tempo de insercao na arvore: 1156300 ns
Tempo de busca (primeiro): 2800 ns
Tempo de busca (ultimo): 3700 ns
Tempo de busca (meio): 2700 ns
Tempo de busca (aleatorio): 900 ns
Tempo de busca (inexistente): 7800 ns

Testando arvore AVL com 100 elementos na ordem ordenada
Tempo de insercao na arvore AVL: 1583900 ns
Tempo de busca (primeiro): 7600 ns
Tempo de busca (ultimo): 1100 ns
Tempo de busca (meio): 900 ns
Tempo de busca (aleatorio): 700 ns
Tempo de busca (inexistente): 700 ns
