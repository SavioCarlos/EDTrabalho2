public class ArvoreAVL {
    private class No {
        int valor, altura;
        No esquerda, direita;

        public No(int valor) {
            this.valor = valor;
            this.altura = 1;
        }
    }

    private No raiz;

    public ArvoreAVL() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.valor) {
            no.esquerda = inserirRec(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRec(no.direita, valor);
        } else {
            return no;
        }
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
        int balanceamento = obterBalanceamento(no);
        if (balanceamento > 1 && valor < no.esquerda.valor) {
            return rotacaoDireita(no);
        }
        if (balanceamento < -1 && valor > no.direita.valor) {
            return rotacaoEsquerda(no);
        }
        if (balanceamento > 1 && valor > no.esquerda.valor) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }
        if (balanceamento < -1 && valor < no.direita.valor) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }
        return no;
    }

    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;
        x.direita = y;
        y.esquerda = T2;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;
        y.esquerda = x;
        x.direita = T2;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        return y;
    }

    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }

    private int obterBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return altura(no.esquerda) - altura(no.direita);
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
