import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000};
        String[] ordens = {"ordenada", "inversamenteOrdenada", "aleatoria"};
        Random random = new Random();
        
        for (int tamanho : tamanhos) {
            for (String ordem : ordens) {
                Integer[] dados = gerarDados(tamanho, ordem);
                System.out.println(" ");
                testarVetor(dados, tamanho, ordem, random);
                testarArvore(dados, tamanho, ordem, random);
                testarArvoreAVL(dados, tamanho, ordem, random);
            }
        }
    }
    
    public static Integer[] gerarDados(int tamanho, String ordem) {
        Integer[] dados = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            dados[i] = i;
        }
        
        if (ordem.equals("inversamenteOrdenada")) {
            Arrays.sort(dados, Collections.reverseOrder());
        } else if (ordem.equals("aleatoria")) {
            Collections.shuffle(Arrays.asList(dados));
        }
        
        return dados;
    }
    
    public static void testarVetor(Integer[] dados, int tamanho, String ordem, Random random) {
        System.out.println(" ");
        System.out.println("Testando vetor com " + tamanho + " elementos na ordem " + ordem);
        Vetor vetor = new Vetor(tamanho);
        
        // Inserção
        long inicio = System.nanoTime();
        for (int valor : dados) {
            vetor.inserir(valor);
        }
        long fim = System.nanoTime();
        System.out.println("Tempo de insercao no vetor: " + (fim - inicio) + " ns");
        
        // Ordenação
        inicio = System.nanoTime();
        vetor.bubbleSort();
        fim = System.nanoTime();
        System.out.println("Tempo de ordenacao (Bubble Sort): " + (fim - inicio) + " ns");
        
        vetor = new Vetor(dados);
        inicio = System.nanoTime();
        vetor.mergeSort();
        fim = System.nanoTime();
        System.out.println("Tempo de ordenacao (Merge Sort): " + (fim - inicio) + " ns");
        
        // Busca
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int aleatorio = dados[random.nextInt(dados.length)];
        int inexistente = tamanho;
        
        buscarVetorSequencial(vetor, primeiro, "primeiro");
        buscarVetorSequencial(vetor, ultimo, "ultimo");
        buscarVetorSequencial(vetor, meio, "meio");
        buscarVetorSequencial(vetor, aleatorio, "aleatorio");
        buscarVetorSequencial(vetor, inexistente, "inexistente");
        System.out.println(" ");
        buscarVetorBinario(vetor, primeiro, "primeiro");
        buscarVetorBinario(vetor, ultimo, "ultimo");
        buscarVetorBinario(vetor, meio, "meio");
        buscarVetorBinario(vetor, aleatorio, "aleatorio");
        buscarVetorBinario(vetor, inexistente, "inexistente");
    }
    
    public static void buscarVetorSequencial(Vetor vetor, int valor, String descricao) {
        long inicio = System.nanoTime();
        vetor.buscaSequencial(valor);
        long fim = System.nanoTime();
        System.out.println("Tempo de busca sequencial (" + descricao + "): " + (fim - inicio) + " ns");
    }
    
    public static void buscarVetorBinario(Vetor vetor, int valor, String descricao) {        
        long inicio = System.nanoTime();
        vetor.buscaBinaria(valor);
        long fim = System.nanoTime();
        System.out.println("Tempo de busca binaria (" + descricao + "): " + (fim - inicio) + " ns");
    }
    
    public static void testarArvore(Integer[] dados, int tamanho, String ordem, Random random) {
        System.out.println(" ");
        System.out.println("Testando arvore com " + tamanho + " elementos na ordem " + ordem);
        Arvore arvore = new Arvore();
        
        // Inserção
        long inicio = System.nanoTime();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long fim = System.nanoTime();
        System.out.println("Tempo de insercao na arvore: " + (fim - inicio) + " ns");
        
        // Busca
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int aleatorio = dados[random.nextInt(dados.length)];
        int inexistente = tamanho;
        
        buscarArvore(arvore, primeiro, "primeiro");
        buscarArvore(arvore, ultimo, "ultimo");
        buscarArvore(arvore, meio, "meio");
        buscarArvore(arvore, aleatorio, "aleatorio");
        buscarArvore(arvore, inexistente, "inexistente");
    }
    
    public static void buscarArvore(Arvore arvore, int valor, String descricao) {
        long inicio = System.nanoTime();
        arvore.buscar(valor);
        long fim = System.nanoTime();
        System.out.println("Tempo de busca (" + descricao + "): " + (fim - inicio) + " ns");
    }
    
    public static void testarArvoreAVL(Integer[] dados, int tamanho, String ordem, Random random) {
        System.out.println(" ");
        System.out.println("Testando arvore AVL com " + tamanho + " elementos na ordem " + ordem);
        ArvoreAVL arvoreAVL = new ArvoreAVL();
        
        // Inserção
        long inicio = System.nanoTime();
        for (int valor : dados) {
            arvoreAVL.inserir(valor);
        }
        long fim = System.nanoTime();
        System.out.println("Tempo de insercao na arvore AVL: " + (fim - inicio) + " ns");
        
        // Busca
        int primeiro = dados[0];
        int ultimo = dados[dados.length - 1];
        int meio = dados[dados.length / 2];
        int aleatorio = dados[random.nextInt(dados.length)];
        int inexistente = tamanho;
        
        buscarArvoreAVL(arvoreAVL, primeiro, "primeiro");
        buscarArvoreAVL(arvoreAVL, ultimo, "ultimo");
        buscarArvoreAVL(arvoreAVL, meio, "meio");
        buscarArvoreAVL(arvoreAVL, aleatorio, "aleatorio");
        buscarArvoreAVL(arvoreAVL, inexistente, "inexistente");
    }
    
    public static void buscarArvoreAVL(ArvoreAVL arvoreAVL, int valor, String descricao) {
        long inicio = System.nanoTime();
        arvoreAVL.buscar(valor);
        long fim = System.nanoTime();
        System.out.println("Tempo de busca (" + descricao + "): " + (fim - inicio) + " ns");
    }
}
