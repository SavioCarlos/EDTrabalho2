public class Arvore {
    private class No {
        int valor;
        No esquerda, direita;

        public No(int valor) {
            this.valor = valor;
            esquerda = direita = null;
        }
    }

    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }
        return raiz;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor) != null;
    }

    private No buscarRec(No raiz, int valor) {
        if (raiz == null || raiz.valor == valor) {
            return raiz;
        }
        if (raiz.valor > valor) {
            return buscarRec(raiz.esquerda, valor);
        }
        return buscarRec(raiz.direita, valor);
    }
}
