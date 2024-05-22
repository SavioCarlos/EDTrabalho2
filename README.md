
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
Os resultados obtidos mostram os tempos de inserção, ordenação e busca em nanosegundos (ns) para cada estrutura de dados.
Para cada tamanho de dados (100, 1000, 10000) e cada ordem, foram medidos os seguintes tempos:
- **Tempo de inserção**
- **Tempo de ordenação** (apenas para vetor)
- **Tempo de busca** (para primeiro, último, meio, aleatório e inexistente)

## Exemplo de resultado:

```plaintext
Testando vetor com 10000 elementos na ordem ordenada
Tempo de insercao no vetor: 2124200 ns
Tempo de ordenacao (Bubble Sort): 108483200 ns
Tempo de ordenacao (Merge Sort): 974100 ns
Tempo de busca sequencial (primeiro): 800 ns
Tempo de busca sequencial (ultimo): 544400 ns
Tempo de busca sequencial (meio): 142800 ns
Tempo de busca sequencial (aleatorio): 176800 ns
Tempo de busca sequencial (inexistente): 237900 ns
Tempo de busca binaria (primeiro): 2000 ns
Tempo de busca binaria (ultimo): 1300 ns
Tempo de busca binaria (meio): 1700 ns
Tempo de busca binaria (aleatorio): 6900 ns
Tempo de busca binaria (inexistente): 3500 ns

Testando arvore com 10000 elementos na ordem ordenada
Tempo de insercao na arvore: 261511900 ns
Tempo de busca (primeiro): 1200 ns
Tempo de busca (ultimo): 26300 ns
Tempo de busca (meio): 13100 ns
Tempo de busca (aleatorio): 12900 ns
Tempo de busca (inexistente): 28000 ns
 
Testando arvore AVL com 10000 elementos na ordem ordenada
Tempo de insercao na arvore AVL: 1475600 ns
Tempo de busca (primeiro): 2826100 ns
Tempo de busca (ultimo): 136000 ns
Tempo de busca (meio): 537600 ns
Tempo de busca (aleatorio): 2600 ns
Tempo de busca (inexistente): 2700 ns

