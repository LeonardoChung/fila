public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        dados = new int[this.capacidade];
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }
    public boolean vazia() {
        return tamanho == 0;
    }
    
    public boolean cheia() {
        return tamanho == capacidade;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                int index = (primeiro + i) % capacidade;
                System.out.println(dados[index]);
            }
        }
    }

    public void insere(int valor) {
        if (cheia()) {
            System.out.println("Fila cheia");
        } else {
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = valor;
            tamanho++;
        }
    }
    
    public int remove() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return -1;
        } else {
            int valor = dados[primeiro];
            primeiro = (primeiro + 1) % capacidade;
            tamanho--;
            return valor;
        }
    }
}
