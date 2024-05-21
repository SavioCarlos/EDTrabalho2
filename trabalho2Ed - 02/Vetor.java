import java.util.Arrays;

public class Vetor {
    private Integer[] dados;
    private int tamanho;
    private int capacidade;
    
    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new Integer[capacidade];
        this.tamanho = 0;
    }
    
    public Vetor(Integer[] dados) {
        this.capacidade = dados.length;
        this.dados = Arrays.copyOf(dados, dados.length);
        this.tamanho = dados.length;
    }
    
    public void inserir(int valor) {
        if (tamanho < capacidade) {
            dados[tamanho++] = valor;
        }
    }
    
    public void bubbleSort() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (dados[j] > dados[j + 1]) {
                
                
                    int temp = dados[j];
                    
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                    
                }
            }
        }
    }
    
    public void mergeSort() {
        mergeSort(0, tamanho - 1);
    }
    
    private void mergeSort(int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(esquerda, meio);
            mergeSort(meio + 1, direita);
            merge(esquerda, meio, direita);
        }
    }
    
    private void merge(int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = dados[esquerda + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = dados[meio + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = esquerda;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                dados[k++] = L[i++];
            } else {
                dados[k++] = R[j++];
            }
        }
        
        while (i < n1) {
            dados[k++] = L[i++];
        }
        
        while (j < n2) {
            dados[k++] = R[j++];
        }
    }
    
    public int buscaSequencial(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    
    public int buscaBinaria(int valor) {
        int esquerda = 0, direita = tamanho - 1;
        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            if (dados[meio] == valor) {
                return meio;
            } else if (dados[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }
}
